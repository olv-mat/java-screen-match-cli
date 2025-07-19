public class Movie {
    String title;
    int releaseYear;
    double averageRating;
    double ratingsSum;
    int ratingsAmount;

    void displayMovieData() {
        System.out.println("Movie: " + this.title);
        System.out.println("Release Year: " + this.releaseYear);
        System.out.println("Average Rating: " + this.averageRating);
    }

    void addRating(double rating) {
        this.ratingsSum += rating;
        this.ratingsAmount ++;
    }

    double getAverageRating() {
        return this.averageRating = this.ratingsSum / this.ratingsAmount;
    }
}
