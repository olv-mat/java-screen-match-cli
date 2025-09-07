package com.github.olvmat.screenmatchcli.main;

import com.github.olvmat.screenmatchcli.models.catalogs.EpisodesCatalog;
import com.github.olvmat.screenmatchcli.models.titles.Episode;
import com.github.olvmat.screenmatchcli.models.titles.Movie;
import com.github.olvmat.screenmatchcli.models.titles.Series;
import com.github.olvmat.screenmatchcli.models.catalogs.MoviesCatalog;
import com.github.olvmat.screenmatchcli.models.catalogs.SeriesCatalog;
import com.github.olvmat.screenmatchcli.models.titles.Title;
import com.github.olvmat.screenmatchcli.utils.console.ConsoleDisplay;
import com.github.olvmat.screenmatchcli.utils.calculators.MarathonCalculator;
import com.github.olvmat.screenmatchcli.utils.console.ConsoleInput;
import com.github.olvmat.screenmatchcli.utils.filters.RecommendationFilter;
import com.github.olvmat.screenmatchcli.utils.filters.WatchedFilter;
import com.github.olvmat.screenmatchcli.utils.ratings.SimulateRatings;

import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Screen Match");

        ConsoleInput consoleInput = new ConsoleInput();
        MoviesCatalog moviesCatalog = new MoviesCatalog();
        SeriesCatalog seriesCatalog = new SeriesCatalog();
        EpisodesCatalog episodesCatalog = new EpisodesCatalog();
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
                        3 - Episodes
                        4 - Watched
                        5 - Exit
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
                            SimulateRatings.simulate(movie);
                            ConsoleDisplay.display(movie.info());
                            System.out.println(recommendationFilter.recommend(movie));
                        }
                        break;
                    case 2:
                        System.out.println("Series Catalog");
                        List<Series> seriesList = seriesCatalog.getItems();
                        Collections.sort(seriesList);
                        for (Series series: seriesList) {
                            watchedFilter.add(series);
                            SimulateRatings.simulate(series);
                            ConsoleDisplay.display(series.info());
                            System.out.println(recommendationFilter.recommend(series));
                        }
                        break;
                    case 3:
                        System.out.println("Episodes");
                        for (Episode episode: episodesCatalog.getItems()) {
                            ConsoleDisplay.display(episode.info());
                            System.out.println(recommendationFilter.recommend(episode));
                        }
                        break;
                    case 4:
                        System.out.println("Watched");
                        for (Title title: watchedFilter.allWatched()) {
                            System.out.println(title);
                        }
                        break;
                    case 5:
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
