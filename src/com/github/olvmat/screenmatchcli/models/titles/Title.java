package com.github.olvmat.screenmatchcli.models.titles;

import com.github.olvmat.screenmatchcli.interfaces.Classifiable;

public abstract class Title implements Classifiable {
    protected final String name;
    protected final int releaseYear;
    protected int duration;
    protected int ratingsAmount;
    private double ratingsSum;
    protected double averageRating;

    public Title(String name, int releaseYear, int duration) {
        this.name = name;
        this.releaseYear = releaseYear;
        this.duration = duration;
    }

    public int getDuration() {
        return this.duration;
    }

    public String getAverageRating() {
        return String.format("%.2f", this.averageRating);
    }

    public void rate(double rating) {
        this.ratingsAmount ++;
        this.ratingsSum += rating;
        this.calculateAverageRating();
    }

    private void calculateAverageRating() {
        this.averageRating = this.ratingsSum / this.ratingsAmount;
    }

    public int starsClassification() {
        return (int) (this.averageRating / 2);
    }

    @Override
    public String toString() {
        return this.name + " (" + this.releaseYear + ")";
    }
}
