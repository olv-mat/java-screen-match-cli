package com.github.olvmat.screenmatchcli.models;

public class Movie {
    private String title;
    private int releaseYear;
    private double ratingsSum;
    private int ratingsAmount;
    private double averageRating;

    public void setTitle(String title) {
        this.title = title;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public void displayMovieInformation() {
        System.out.println("Movie: " + this.title);
        System.out.println("Release Year: " + this.releaseYear);
        System.out.println("Ratings Amount: " + this.ratingsAmount);
        System.out.println("Average Rating: " + this.averageRating);
        System.out.println("Stars: " + this.calculateMovieStars());
        System.out.println(this.generateMovieTag());
    }

    public void rateMovie(double rating) {
        this.ratingsSum += rating;
        this.ratingsAmount ++;
        this.calculateAverageRating(this.ratingsSum, this.ratingsAmount);
    }

    private void calculateAverageRating(double sum, int amount) {
        this.averageRating = sum / amount;
    }

    private int calculateMovieStars() {
        return (int) (this.averageRating / 2);
    }

    private String generateMovieTag() {
        return this.averageRating >= 9 ? "Masterpiece!" : "Regular";
    }
}
