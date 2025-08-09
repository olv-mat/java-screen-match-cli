package com.github.olvmat.screenmatchcli.models;

import com.github.olvmat.screenmatchcli.interfaces.Classifiable;

public abstract class Title implements Classifiable {
    private final String name;
    private final int releaseYear;
    protected int duration;
    private int ratingsAmount;
    private double ratingsSum;
    private double averageRating;

    public Title(String name, int releaseYear) {
        this.name = name;
        this.releaseYear = releaseYear;
    }

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

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void rate(double rating) {
        this.ratingsAmount ++;
        this.ratingsSum += rating;
        this.calculateAverageRating();
    }

    public int getStarsClassification() {
        return (int) (this.averageRating / 2);
    }

    private void calculateAverageRating() {
        this.averageRating = this.ratingsSum / this.ratingsAmount;
    }
}
