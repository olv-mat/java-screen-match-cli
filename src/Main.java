import com.github.olvmat.screenmatchcli.models.Movie;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Screen Match");
        Scanner input = new Scanner(System.in);
        while (true) {
            String menu = """
                    Menu
                    1 - Movies Catalog
                    2 - Add Movie
                    3 - Exit
                    """;
            System.out.println("=".repeat(30));
            System.out.print(menu);
            System.out.println("=".repeat(30));
            System.out.print("Option: ");
            int option = input.nextInt();
            input.nextLine();
            switch (option) {
                case 1:
                    boolean hasSubscribed = true;
                    if (hasSubscribed) {
                        System.out.println("Movies Catalog");
                        Movie catalogMovie = new Movie();
                        catalogMovie.setName("Hereditary");
                        catalogMovie.setReleaseYear(2018);
                        catalogMovie.setDirector("Ari Aster");
                        catalogMovie.rateTitle(10);
                        catalogMovie.rateTitle(8.6);
                        System.out.println("=".repeat(30));
                        displayMovieData(catalogMovie);
                    } else {
                        System.out.println("Please, Subscribe To Our Platform");
                    }
                    break;
                case 2:
                    System.out.println("Add Movie");
                    Movie newMovie = new Movie();
                    System.out.println("=".repeat(30));
                    System.out.print("Movie Title: ");
                    newMovie.setName(input.nextLine());
                    System.out.print("Release Year: ");
                    newMovie.setReleaseYear(input.nextInt());
                    input.nextLine();
                    System.out.print("Director: ");
                    newMovie.setDirector(input.nextLine());
                    for (int i = 0; i < 4; i++) {
                        System.out.printf("Rating %d: ", i + 1);
                        newMovie.rateTitle(input.nextDouble());
                    }
                    System.out.println("=".repeat(30));
                    System.out.println("New Movie Added Successfully");
                    displayMovieData(newMovie);
                    break;
                case 3:
                    System.out.println("Thank You For Using Screen Match. See You Next Time!");
                    return;
                default:
                    System.out.println("Invalid Option");
                    break;
            }
        }
    }

    public static void displayMovieData (Movie movie) {
        System.out.println("Movie: " + movie.getName());
        System.out.println("Release Year: " + movie.getReleaseYear());
        System.out.println("Director: " + movie.getDirector());
        System.out.println("Ratings Amount: " + movie.getRatingsAmount());
        System.out.println("Average Rating: " + movie.getAverageRating());
        System.out.println("Stars: " + movie.getStars());
        System.out.println(movie.generateTag());
    }
}
