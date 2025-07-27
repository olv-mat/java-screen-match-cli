package com.github.olvmat.screenmatchcli.models;

public class Title {
    private String name;
    private int releaseYear;
    private double ratingsSum;
    private int ratingsAmount;
    private double averageRating;
    private int stars;

    public String getName() {
        return name;
    }

    public int getReleaseYear() {
        return this.releaseYear;
    }

    public int getRatingsAmount() {
        return this.ratingsAmount;
    }

    public double getAverageRating() {
        return this.averageRating;
    }

    public int getStars() {
        return this.stars;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public void rateTitle(double rating) {
        this.ratingsSum += rating;
        this.ratingsAmount ++;
        this.calculateAverageRating();
        this.calculateStars();
    }

    public String generateTag() {
        return this.stars >= 4 ? "Masterpiece!" : "Regular";
    }

    private void calculateAverageRating() {
        this.averageRating = this.ratingsSum / this.ratingsAmount;
    }

    private void calculateStars() {
        this.stars = (int) (this.averageRating / 2);
    }

}
