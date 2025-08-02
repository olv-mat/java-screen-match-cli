import com.github.olvmat.screenmatchcli.models.Movie;
import com.github.olvmat.screenmatchcli.models.Series;
import com.github.olvmat.screenmatchcli.utils.DisplayConsole;
import com.github.olvmat.screenmatchcli.utils.TimeCalculator;

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
                        3 - Add Movie
                        4 - Exit
                        """;
                DisplayConsole.display(menu);
                DisplayConsole.display("Option: ");
                int option = input.nextInt();
                input.nextLine();
                TimeCalculator calculator = new TimeCalculator();
                switch (option) {
                    case 1:
                        System.out.println("Movies Catalog");

                        Movie catalogMovieHereditary = new Movie();
                        catalogMovieHereditary.setName("Hereditary");
                        catalogMovieHereditary.setReleaseYear(2018);
                        catalogMovieHereditary.setDuration(127);
                        catalogMovieHereditary.setDirector("Ari Aster");
                        catalogMovieHereditary.rateTitle(10);
                        catalogMovieHereditary.rateTitle(8.6);
                        calculator.add(catalogMovieHereditary);

                        Movie catalogMovieTheWitch = new Movie();
                        catalogMovieTheWitch.setName("The Witch");
                        catalogMovieTheWitch.setReleaseYear(2015);
                        catalogMovieTheWitch.setDuration(92);
                        catalogMovieTheWitch.setDirector("Robert Eggers");
                        catalogMovieTheWitch.rateTitle(9.0);
                        catalogMovieTheWitch.rateTitle(8.3);
                        calculator.add(catalogMovieTheWitch);

                        DisplayConsole.display(catalogMovieHereditary.getData());
                        DisplayConsole.display(catalogMovieTheWitch.getData());
                        DisplayConsole.display("Over " + calculator.getTotalTime() + " Minutes Of Content!\n");
                        break;
                    case 2:
                        System.out.println("Series Catalog");

                        Series catalogSeriesEternaut = new Series();
                        catalogSeriesEternaut.setName("The Eternaut");
                        catalogSeriesEternaut.setReleaseYear(2025);
                        catalogSeriesEternaut.setSeasons(1);
                        catalogSeriesEternaut.setEpisodes(6);
                        catalogSeriesEternaut.setEpisodesDurationAverage(56);
                        catalogSeriesEternaut.setActive(true);
                        catalogSeriesEternaut.rateTitle(10);
                        catalogSeriesEternaut.rateTitle(6.4);
                        calculator.add(catalogSeriesEternaut);

                        Series catalogSeriesStrangerThings = new Series();
                        catalogSeriesStrangerThings.setName("Stranger Things");
                        catalogSeriesStrangerThings.setReleaseYear(2016);
                        catalogSeriesStrangerThings.setSeasons(4);
                        catalogSeriesStrangerThings.setEpisodes(34);
                        catalogSeriesStrangerThings.setEpisodesDurationAverage(61);
                        catalogSeriesStrangerThings.setActive(true);
                        catalogSeriesStrangerThings.rateTitle(9.6);
                        catalogSeriesStrangerThings.rateTitle(9.4);
                        calculator.add(catalogSeriesStrangerThings);

                        DisplayConsole.display(catalogSeriesEternaut.getData());
                        DisplayConsole.display(catalogSeriesStrangerThings.getData());
                        DisplayConsole.display("Over " + calculator.getTotalTime() + " Minutes Of Content!\n");
                        break;
                    case 3:
                        System.out.println("Add Movie");
                        Movie newMovie = new Movie();
                        DisplayConsole.display("Movie Title: ");
                        newMovie.setName(input.nextLine());
                        System.out.print("Release Year: ");
                        newMovie.setReleaseYear(input.nextInt());
                        input.nextLine();
                        System.out.print("Duration: ");
                        newMovie.setDuration(input.nextInt());
                        input.nextLine();
                        System.out.print("Director: ");
                        newMovie.setDirector(input.nextLine());
                        for (int i = 0; i < 4; i++) {
                            System.out.printf("Rating %d: ", i + 1);
                            newMovie.rateTitle(input.nextDouble());
                        }
                        DisplayConsole.display("New Movie Added Successfully!\n");
                        DisplayConsole.display(newMovie.getData());
                        break;
                    case 4:
                        System.out.println("Thank You For Using Screen Match. See You Next Time!");
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
