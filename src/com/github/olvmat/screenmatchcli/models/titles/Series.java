package com.github.olvmat.screenmatchcli.models.titles;

public class Series extends Title {
    private final int seasons;
    private final int episodes;
    private final int episodesDurationAverage;
    private final boolean active;

    public Series(
            String name,
            int releaseYear,
            int seasons,
            int episodes,
            int episodesDurationAverage,
            boolean active
    ) {
        super(name, releaseYear, (episodes * episodesDurationAverage));
        this.seasons = seasons;
        this.episodes = episodes;
        this.episodesDurationAverage = episodesDurationAverage;
        this.active = active;
    }

    public String isActive() {
        return this.active ? "Yes" : "No";
    }

    public String info() {
        return "Series: " + this.name + "\n" +
                "Active: " + this.isActive() + "\n" +
                "Release Year: " + this.releaseYear + "\n" +
                "Seasons: " + this.seasons + "\n" +
                "Episodes: " + this.episodes + "\n" +
                "Episodes Duration Average: " + this.episodesDurationAverage + "\n" +
                "Total Duration: " + this.duration + " Minutes\n" +
                "Ratings Amount: " + this.ratingsAmount + "\n" +
                "Average Rating: " + getAverageRating() + "\n" +
                "Stars: " + this.starsClassification() + "\n";
    }
}
