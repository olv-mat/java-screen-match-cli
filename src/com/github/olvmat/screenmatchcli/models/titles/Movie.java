package com.github.olvmat.screenmatchcli.models.titles;

public class Movie extends Title {
    private final String director;

    public Movie(
            String name,
            int releaseYear,
            String director
    ) {
        super(name, releaseYear);
        this.director = director;
    }

    public String getDirector() {
        return this.director;
    }

    public String getInformation() {
        return "Movie: " + this.getName() + "\n" +
                "Release Year: " + this.getReleaseYear() + "\n" +
                "Director: " + this.getDirector() + "\n" +
                "Duration: " + this.getDuration() + " Minutes\n" +
                "Ratings Amount: " + this.getRatingsAmount() + "\n" +
                "Average Rating: " + this.getAverageRating() + "\n" +
                "Stars: " + this.getStarsClassification() + "\n";
    }
}
