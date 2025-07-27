package com.github.olvmat.screenmatchcli.models;

public class Movie extends Title {
    private String director;

    public String getDirector() {
        return this.director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public void displayData() {
        System.out.println(this.generateTag());
        System.out.println("Movie: " + this.getName());
        System.out.println("Release Year: " + this.getReleaseYear());
        System.out.println("Director: " + this.getDirector());
        System.out.println("Ratings Amount: " + this.getRatingsAmount());
        System.out.println("Average Rating: " + this.getAverageRating());
        System.out.println("Stars: " + this.getStars());
    }
}
