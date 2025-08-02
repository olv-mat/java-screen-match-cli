package com.github.olvmat.screenmatchcli.models;

public abstract class Title {
    private String name;
    private int releaseYear;
    private int duration;
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

    public int getDuration() {
        return this.duration;
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

    public void setDuration(int duration) {
        this.duration = duration;
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

    public String getData() {
        return this.generateTag() + "\n" +
                "Title: " + this.getName() + "\n" +
                "Release Year: " + this.getReleaseYear() + "\n" +
                "Duration: " + this.getDuration() + "\n" +
                "Ratings Amount: " + this.getRatingsAmount() + "\n" +
                "Average Rating: " + this.getAverageRating() + "\n" +
                "Stars: " + this.getStars() + "\n";
    }

    private void calculateAverageRating() {
        this.averageRating = this.ratingsSum / this.ratingsAmount;
    }

    private void calculateStars() {
        this.stars = (int) (this.averageRating / 2);
    }
}
