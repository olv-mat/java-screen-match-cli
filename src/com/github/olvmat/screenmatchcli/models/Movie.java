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
    public String getData() {
        return this.generateTag() + "\n" +
                "Movie: " + this.getName() + "\n" +
                "Release Year: " + this.getReleaseYear() + "\n" +
                "Duration: " + this.getDuration() + " Minutes\n" +
                "Director: " + this.getDirector() + "\n" +
                "Ratings Amount: " + this.getRatingsAmount() + "\n" +
                "Average Rating: " + this.getAverageRating() + "\n" +
                "Stars: " + this.getStars() + "\n";
    }
}
