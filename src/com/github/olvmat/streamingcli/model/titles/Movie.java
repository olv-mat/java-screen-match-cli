package com.github.olvmat.streamingcli.model.titles;

public class Movie extends Title {
    private final String director;

    public Movie(
            String name,
            int releaseYear,
            int duration,
            double averageRating,
            String director
    ) {
        super(name, releaseYear, duration, averageRating);
        this.director = director;
    }

    public String info() {
        return "Movie: " + this.name + "\n" +
                "Release Year: " + this.releaseYear + "\n" +
                "Director: " + this.director + "\n" +
                "Duration: " + this.duration + " Minutes\n" +
                "Average Rating: " + getAverageRating() + "\n" +
                "Stars: " + this.starsClassification() + "\n";
    }
}
