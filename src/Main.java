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
                        String movieTitle = "Hereditary";
                        int releaseYear = 2018;
                        String movieTag = releaseYear >= 2024 ? "New!" : "Classic!";
                        double averageRating = (9.8 + 7.2 + 8 + 10) / 4;
                        int stars = (int) (averageRating / 2);
                        System.out.println("=".repeat(30));
                        System.out.println(movieTag);
                        System.out.println("Movie: " + movieTitle);
                        System.out.println("Release Year: " + releaseYear);
                        System.out.println("Average Rating: " + averageRating);
                        System.out.println("Stars: " + stars);
                    } else {
                        System.out.println("Please, Subscribe To Our Platform");
                    }
                    break;
                case 2:
                    System.out.println("Add Movie");
                    System.out.println("=".repeat(30));
                    System.out.print("Movie Title: ");
                    String newMovieTitle = input.nextLine();
                    System.out.print("Release Year: ");
                    int newMovieReleaseYear = input.nextInt();
                    double newMovieAverageRating = 0;
                    for (int i = 0; i < 4; i++) {
                        System.out.printf("Rating %d: ", i + 1);
                        newMovieAverageRating += input.nextDouble();
                    }
                    newMovieAverageRating /= 4;
                    System.out.println("=".repeat(30));
                    System.out.println("New Movie Added Successfully");
                    System.out.printf("Movie: %s%n", newMovieTitle);
                    System.out.printf("Release Year: %d%n", newMovieReleaseYear);
                    System.out.printf("Average Rating: %f%n", newMovieAverageRating);
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