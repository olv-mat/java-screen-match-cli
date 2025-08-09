package com.github.olvmat.screenmatchcli.app;

import com.github.olvmat.screenmatchcli.models.Episode;
import com.github.olvmat.screenmatchcli.models.Movie;
import com.github.olvmat.screenmatchcli.models.Series;
import com.github.olvmat.screenmatchcli.utils.ConsoleDisplay;
import com.github.olvmat.screenmatchcli.utils.MarathonCalculator;
import com.github.olvmat.screenmatchcli.utils.RecommendationFilter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Screen Match");
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
                MarathonCalculator marathonCalculator = new MarathonCalculator();
                RecommendationFilter recommendationFilter = new RecommendationFilter();
                switch (option) {
                    case 1:
                        System.out.println("Movies Catalog");

                        Movie hereditary = new Movie(
                                "Hereditary",
                                2018,
                                "Ari Aster");
                        hereditary.setDuration(127);
                        hereditary.rate(10);
                        hereditary.rate(8.2);
                        marathonCalculator.add(hereditary);

                        Movie theWitch = new Movie(
                                "The Witch",
                                2015,
                                "Robert Eggers"
                        );
                        theWitch.setDuration(92);
                        marathonCalculator.add(theWitch);

                        ConsoleDisplay.display(hereditary.getInformation());
                        System.out.println(recommendationFilter.recommend(hereditary));
                        ConsoleDisplay.display(theWitch.getInformation());
                        System.out.println(recommendationFilter.recommend(theWitch));

                        ConsoleDisplay.display(
                                "Over " + marathonCalculator.getTotalTime() +
                                        " Minutes Of Content!\n"
                        );
                        break;
                    case 2:
                        System.out.println("Series Catalog");
                        Series theEternaut = new Series(
                                "The Eternaut",
                                2025,
                                1,
                                6,
                                true
                        );
                        theEternaut.setDuration(56);
                        theEternaut.rate(9.3);
                        theEternaut.rate(6.3);
                        theEternaut.rate(9.2);
                        marathonCalculator.add(theEternaut);

                        Series strangerThings = new Series(
                                "Stranger Things",
                                2016,
                                4,
                                34,
                                true
                        );
                        strangerThings.setDuration(61);
                        marathonCalculator.add(strangerThings);

                        ConsoleDisplay.display(theEternaut.getInformation());
                        System.out.println(recommendationFilter.recommend(theEternaut));
                        ConsoleDisplay.display(strangerThings.getInformation());
                        System.out.println(recommendationFilter.recommend(strangerThings));

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
