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
                        catalogMovie.title = "Hereditary";
                        catalogMovie.releaseYear = 2018;
                        catalogMovie.averageRating = 9;

                        String tag = catalogMovie.averageRating >= 9 ? "Masterpiece!" : "Regular";
                        int stars = (int) (catalogMovie.averageRating / 2);

                        System.out.println("=".repeat(30));
                        System.out.println("Tag: " + tag);
                        catalogMovie.displayMovieData();
                        System.out.println("Stars: " + stars);
                    } else {
                        System.out.println("Please, Subscribe To Our Platform");
                    }
                    break;
                case 2:
                    System.out.println("Add Movie");
                    Movie newMovie = new Movie();
                    System.out.println("=".repeat(30));

                    System.out.print("Movie Title: ");
                    newMovie.title = input.nextLine();

                    System.out.print("Release Year: ");
                    newMovie.releaseYear = input.nextInt();

                    for (int i = 0; i < 4; i++) {
                        System.out.printf("Rating %d: ", i + 1);
                        newMovie.addRating(input.nextDouble());
                    }

                    System.out.println("=".repeat(30));
                    System.out.println("New Movie Added Successfully");
                    System.out.printf("Movie: %s%n", newMovie.title);
                    System.out.printf("Release Year: %d%n", newMovie.releaseYear);
                    System.out.printf("Average Rating: %f%n", newMovie.getAverageRating());
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