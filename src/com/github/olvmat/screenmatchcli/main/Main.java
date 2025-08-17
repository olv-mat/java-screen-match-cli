package com.github.olvmat.screenmatchcli.main;

import com.github.olvmat.screenmatchcli.models.titles.Episode;
import com.github.olvmat.screenmatchcli.models.titles.Movie;
import com.github.olvmat.screenmatchcli.models.titles.Series;
import com.github.olvmat.screenmatchcli.models.catalogs.MoviesCatalog;
import com.github.olvmat.screenmatchcli.models.catalogs.SeriesCatalog;
import com.github.olvmat.screenmatchcli.utils.console.ConsoleDisplay;
import com.github.olvmat.screenmatchcli.utils.calculators.MarathonCalculator;
import com.github.olvmat.screenmatchcli.utils.filters.RecommendationFilter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Screen Match");

        MoviesCatalog moviesCatalog = new MoviesCatalog();
        SeriesCatalog seriesCatalog = new SeriesCatalog();
        MarathonCalculator marathonCalculator = new MarathonCalculator();
        RecommendationFilter recommendationFilter = new RecommendationFilter();

        boolean hasSubscribed = true;
        if (hasSubscribed) {
            Scanner input = new Scanner(System.in);
            while (true) {
                String menu = """
                        Menu
                        1 - Movies Catalog
                        2 - Series Catalog
                        3 - Episodes
                        4 - Exit
                        """;
                ConsoleDisplay.display(menu);
                ConsoleDisplay.display("Option: ");
                int option = input.nextInt();
                input.nextLine();
                switch (option) {
                    case 1:
                        System.out.println("Movies Catalog");

                        moviesCatalog.getItem(0).rate(10);
                        moviesCatalog.getItem(0).rate(8.2);
                        marathonCalculator.add(moviesCatalog.getItem(0));

                        moviesCatalog.getItem(1).rate(9.3);
                        moviesCatalog.getItem(1).rate(8.6);
                        marathonCalculator.add(moviesCatalog.getItem(1));

                        for (int i = 0; i < moviesCatalog.getItems().size(); i++) {
                            Movie movie = moviesCatalog.getItem(i);
                            ConsoleDisplay.display(movie.getInformation());
                            System.out.println(recommendationFilter.recommend(movie));
                        }

                        ConsoleDisplay.display(
                                "Over " + marathonCalculator.getTotalTime() +
                                        " Minutes Of Content!\n"
                        );
                        break;
                    case 2:
                        System.out.println("Series Catalog");

                        seriesCatalog.getItem(0).rate(9.2);
                        seriesCatalog.getItem(0).rate(5.3);
                        seriesCatalog.getItem(0).rate(4.4);
                        seriesCatalog.getItem(0).rate(7.1);
                        marathonCalculator.add(seriesCatalog.getItem(0));

                        seriesCatalog.getItem(1).rate(9.4);
                        seriesCatalog.getItem(1).rate(10);
                        marathonCalculator.add(seriesCatalog.getItem(1));

                        for (int i = 0; i < seriesCatalog.getItems().size(); i++) {
                            Series series = seriesCatalog.getItem(i);
                            ConsoleDisplay.display(series.getInformation());
                            System.out.println(recommendationFilter.recommend(series));
                        }

                        ConsoleDisplay.display(
                                "Over " + marathonCalculator.getTotalTime() +
                                        " Minutes Of Content!\n"
                        );
                        break;
                    case 3:
                        System.out.println("Episodes");
                        Episode episode = new Episode(
                                new Series(
                                        "The Simpsons",
                                        1989,
                                        37,
                                        790,
                                        true),
                                "Simpsons Roasting on an Open Fire",
                                1,
                                4580);
                        ConsoleDisplay.display(episode.getInformation());
                        System.out.println(recommendationFilter.recommend(episode));
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
