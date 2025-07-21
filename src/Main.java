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
                        catalogMovie.setTitle("Hereditary");
                        catalogMovie.setReleaseYear(2018);
                        System.out.println("=".repeat(30));
                        catalogMovie.displayMovieInformation();
                    } else {
                        System.out.println("Please, Subscribe To Our Platform");
                    }
                    break;
                case 2:
                    System.out.println("Add Movie");
                    Movie newMovie = new Movie();
                    System.out.println("=".repeat(30));
                    System.out.print("Movie Title: ");
                    newMovie.setTitle(input.nextLine());
                    System.out.print("Release Year: ");
                    newMovie.setReleaseYear(input.nextInt());
                    for (int i = 0; i < 4; i++) {
                        System.out.printf("Rating %d: ", i + 1);
                        newMovie.rateMovie(input.nextDouble());
                    }
                    System.out.println("=".repeat(30));
                    System.out.println("New Movie Added Successfully");
                    newMovie.displayMovieInformation();
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
}
