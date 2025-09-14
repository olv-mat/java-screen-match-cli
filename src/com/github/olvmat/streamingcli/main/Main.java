package com.github.olvmat.streamingcli.main;

import com.github.olvmat.streamingcli.model.titles.Movie;
import com.github.olvmat.streamingcli.model.titles.Series;
import com.github.olvmat.streamingcli.model.catalogs.MoviesCatalog;
import com.github.olvmat.streamingcli.model.catalogs.SeriesCatalog;
import com.github.olvmat.streamingcli.model.titles.Title;
import com.github.olvmat.streamingcli.console.ConsoleDisplay;
import com.github.olvmat.streamingcli.service.MarathonCalculator;
import com.github.olvmat.streamingcli.console.ConsoleInput;
import com.github.olvmat.streamingcli.service.RecommendationFilter;
import com.github.olvmat.streamingcli.service.WatchedFilter;
import com.github.olvmat.streamingcli.service.RatingSimulator;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Screen Match");

        ConsoleInput consoleInput = new ConsoleInput();
        MoviesCatalog moviesCatalog = new MoviesCatalog();
        SeriesCatalog seriesCatalog = new SeriesCatalog();
        MarathonCalculator marathonCalculator = new MarathonCalculator();
        RecommendationFilter recommendationFilter = new RecommendationFilter();
        WatchedFilter watchedFilter = new WatchedFilter();

        marathonCalculator.add(moviesCatalog.getItems());
        marathonCalculator.add(seriesCatalog.getItems());

        ConsoleDisplay.display(
                "Over " +  marathonCalculator.getTotalTime() + " Minutes Of Content!\n");

        boolean hasSubscribed = true;
        if (hasSubscribed) {
            while (true) {
                String menu = """
                        Menu
                        1 - Movies Catalog
                        2 - Series Catalog
                        3 - Watched
                        4 - Exit
                        """;
                ConsoleDisplay.display(menu);
                ConsoleDisplay.display("Option: ");
                int option = consoleInput.readInt();
                switch (option) {
                    case 1:
                        System.out.println("Movies Catalog");
                        List<Movie> movies = moviesCatalog.getItems();
                        Collections.sort(movies);
                        for (Movie movie: movies) {
                            watchedFilter.add(movie);
                            RatingSimulator.simulate(movie);
                            ConsoleDisplay.display(movie.info());
                            System.out.println(recommendationFilter.recommend(movie));
                        }
                        break;
                    case 2:
                        System.out.println("Series Catalog");
                        List<Series> seriesList = seriesCatalog.getItems();
                        seriesList.sort(Comparator.comparing(Title::getDuration));
                        for (Series series: seriesList) {
                            watchedFilter.add(series);
                            RatingSimulator.simulate(series);
                            ConsoleDisplay.display(series.info());
                            System.out.println(recommendationFilter.recommend(series));
                        }
                        break;
                    case 3:
                        System.out.println("Watched");
                        for (Title title: watchedFilter.allWatched()) {
                            System.out.println(title);
                        }
                        break;
                    case 4:
                        System.out.println("Thank You For Using Screen Match!");
                        return;
                    default:
                        System.out.println("Invalid Option");
                        break;
                }
            }
        } else {
            System.out.println("Please, Subscribe To Our Platform");
        }
    }
}
