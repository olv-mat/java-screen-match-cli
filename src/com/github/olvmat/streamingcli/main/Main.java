package com.github.olvmat.streamingcli.main;

import com.github.olvmat.streamingcli.console.ConsoleDisplay;
import com.github.olvmat.streamingcli.console.ConsoleInput;
import com.github.olvmat.streamingcli.exception.InvalidYearException;
import com.github.olvmat.streamingcli.model.interfaces.Classifiable;
import com.github.olvmat.streamingcli.model.interfaces.Informative;
import com.github.olvmat.streamingcli.model.catalogs.*;
import com.github.olvmat.streamingcli.model.titles.Movie;
import com.github.olvmat.streamingcli.model.records.MovieRecord;
import com.github.olvmat.streamingcli.service.calculators.MarathonCalculator;
import com.github.olvmat.streamingcli.service.filters.RecommendationFilter;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import io.github.cdimascio.dotenv.Dotenv;

import java.io.IOException;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.util.List;

public class Main {
    // Console
    private final ConsoleDisplay consoleDisplay = new ConsoleDisplay();
    private final ConsoleInput consoleInput = new ConsoleInput();
    // Catalogs
    private final MoviesCatalog moviesCatalog = new MoviesCatalog();
    private final MusicsCatalog musicsCatalog = new MusicsCatalog();
    private final PodcastsCatalog podcastsCatalog = new PodcastsCatalog();
    private final SeriesCatalog seriesCatalog = new SeriesCatalog();
    // Calculators & Filters
    private final MarathonCalculator marathonCalculator = new MarathonCalculator();
    private final RecommendationFilter recommendationFilter = new RecommendationFilter();

    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        this.marathonCalculator.add(moviesCatalog.getItems());
        this.marathonCalculator.add(seriesCatalog.getItems());
        int totalTime = this.marathonCalculator.getTotalTime();

        this.consoleDisplay.display("Welcome to Our Streaming!\n");
        this.consoleDisplay.display("Over " + totalTime + " Minutes of Content\n");
        while (true) {
            this.consoleDisplay.displayMenu(
                    "Menu",
                    "Movies", "Musics", "Podcasts", "Series", "Exit"
            );
            consoleDisplay.display("Option: ");
            switch (consoleInput.readInt()) {
                case 1:
                    this.handleCatalog("Movies Catalog", this.moviesCatalog);
                    break;
                case 2:
                    this.handleCatalog("Musics Catalog", this.musicsCatalog);
                    break;
                case 3:
                    this.handleCatalog("Podcasts Catalog", this.podcastsCatalog);
                    break;
                case 4:
                    this.handleCatalog("Series Catalog", this.seriesCatalog);
                    break;
                case 5:
                    consoleDisplay.display("Goodbye...");
                    return;
                default:
                    consoleDisplay.display("Invalid Option\n");
                    break;
            }
        }
    }

    private <T extends Classifiable & Informative & Comparable<? super T>> void handleCatalog(
            String title,
            Catalog<T> catalog
    ) {
        boolean isMoviesCatalog = catalog instanceof MoviesCatalog;
        List<T> items = catalog.getItems();
        while (true) {
            this.consoleDisplay.displayList(title, items);
            String[] options = isMoviesCatalog
                    ? new String[]{"Information", "Search (Online)", "Back"}
                    : new String[]{"Information", "Back"};
            this.consoleDisplay.displayMenu("Options", options);
            this.consoleDisplay.display("Option: ");
            switch (this.consoleInput.readInt()) {
                case 1:
                    this.showInformationAndRecommend(items);
                    break;
                case 2:
                    if (isMoviesCatalog) {
                        this.searchOnline();
                    }
                    return;
                case 3:
                    if (isMoviesCatalog) {
                        return;
                    } else {
                        consoleDisplay.display("Invalid Option\n");
                    }
                    break;
                default:
                    consoleDisplay.display("Invalid Option\n");
                    break;
            }
        }
    }

    private <T extends Informative & Classifiable> void showInformationAndRecommend(
            List<T> items
    ) {
        int option;
        do {
            consoleDisplay.display("About: ");
            option = this.consoleInput.readInt();
        } while (option > items.size());
        T item = items.get(option - 1);
        consoleDisplay.display(item.information());
        System.out.println(this.recommendationFilter.recommend(item));
    }

    private void searchOnline() {
        try {
            // Loading And Fetching Environment Variables
            Dotenv dotenv = Dotenv.load();
            String baseURL = dotenv.get("BASE_URL");
            String apiKey = dotenv.get("API_KEY");

            this.consoleDisplay.display("Enter a Movie: ");
            String movieTitle = this.consoleInput.readText();

            String encodedTitle = URLEncoder.encode(movieTitle, StandardCharsets.UTF_8);
            String endpoint = baseURL + "/?t=" + encodedTitle + "&apikey=" + apiKey;
            String json = this.sendRequest(endpoint);

            MovieRecord movieRecord = this.toRecord(json);
            Movie movie = this.toMovie(movieRecord);
            consoleDisplay.display(movie.information());
        } catch (NumberFormatException | InvalidYearException e) {
            this.consoleDisplay.display("Something Went Wrong: " + e.getMessage() + "\n");
        } finally {
            this.consoleDisplay.display("Search Completed" + "\n");
        }
    }

    private String sendRequest(String to) {
        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(String.format(to)))
                    .build();
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return response.body();
        } catch (IOException | InterruptedException e) {
            this.consoleDisplay.display("Request Error: " + e.getMessage() + "\n");
            return null;
        }
    }

    private MovieRecord toRecord(String json) {
        Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).create();
        return gson.fromJson(json, MovieRecord.class);
    }

    private Movie toMovie(MovieRecord movieRecord) {
        String name = movieRecord.title();
        String year = movieRecord.year();
        if (year.length() > 4) {
            throw new InvalidYearException("There Was a Problem Converting The Release Year");
        }
        int releaseYear = Integer.parseInt(year);
        int duration = Integer.parseInt(movieRecord.runtime().substring(0, 2));
        double averageRating = Double.parseDouble(movieRecord.imdbRating());
        String director = movieRecord.director();
        return new Movie(name, releaseYear, duration, averageRating, director);
    }
}
