import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("WELCOME TO SCREEN MATCH");
        Scanner input = new Scanner(System.in);
        while (true) {
            String menu = """
                    
                    MENU
                    1 - SEE OUR MOVIES CATALOG
                    2 - RECOMMEND YOUR FAVORITE MOVIE
                    3 - EXIT
                    """;
            System.out.println(menu);
            System.out.print("YOUR OPTION: ");
            int option = input.nextInt();
            input.nextLine();
            switch (option) {
                case 1:
                    boolean hasSubscribed = true;
                    if (hasSubscribed) {
                        System.out.println("MOVIES CATALOG");
                        String movieTitle = "HEREDITARY";
                        int releaseYear = 2018;
                        String movieTag = releaseYear >= 2024 ? "NEW!" : "CLASSIC!";
                        double averageRating = (9.8 + 6.3 + 8) / 3;
                        int stars = (int) (averageRating / 2);
                        System.out.println("------------------------------");
                        System.out.println(movieTag);
                        System.out.println("MOVIE: " + movieTitle);
                        System.out.println("RELEASE YEAR: " + releaseYear);
                        System.out.println("AVERAGE RATING: " + averageRating);
                        System.out.println("STARS: " + stars);
                        System.out.println("------------------------------");
                    } else {
                        System.out.println("PLEASE, SUBSCRIBE TO OUR PLATFORM");
                    }
                    break;
                case 2:
                    System.out.println("RECOMMEND YOUR FAVORITE MOVIE");
                    System.out.println("------------------------------");
                    System.out.print("ENTER YOUR FAVORITE MOVIE: ");
                    String favoriteMovie = input.nextLine();
                    System.out.print("ENTER THE RELEASE DATE OF YOUR FAVORITE MOVIE: ");
                    int releaseYearFavoriteMovie = input.nextInt();
                    double averageRatingFavoriteMovie = 0;
                    for (int i = 0; i < 3; i++) {
                        System.out.printf("ENTER RATING %d: ", i + 1);
                        averageRatingFavoriteMovie += input.nextDouble();
                    }
                    averageRatingFavoriteMovie /= 3;
                    System.out.println("------------------------------");
                    System.out.printf("FAVORITE MOVIE: %s%n", favoriteMovie);
                    System.out.printf("RELEASE YEAR: %d%n", releaseYearFavoriteMovie );
                    System.out.printf("AVERAGE RATING: %f%n", averageRatingFavoriteMovie);
                    System.out.println("THANKS FOR THE RECOMMENDATION");
                    System.out.println("------------------------------");
                    break;
                case 3:
                    System.out.println("THANK YOU FOR USING SCREEN MATCH. SEE YOU NEXT TIME!");
                    return;
                default:
                    System.out.println("INVALID OPTION");
                    break;
            }
        }
    }
}