package com.github.olvmat.screenmatchcli.models;

public class Series extends Title {
    private final int seasons;
    private final int episodes;
    private final boolean active;

    public Series(
            String name,
            int releaseYear,
            int seasons,
            int episodes,
            boolean active
    ) {
        super(name, releaseYear);
        this.seasons = seasons;
        this.episodes = episodes;
        this.active = active;
    }

    public int getSeasons() {
        return this.seasons;
    }

    public int getEpisodes() {
        return this.episodes;
    }

    public String getActive() {
        return this.active ? "Yes" : "No";
    }

    @Override
    public void setDuration(int episodesDurationAverage) {
        this.duration = this.episodes * episodesDurationAverage;
    }

    public String getInformation() {
        return "Series: " + this.getName() + "\n" +
                "Release Year: " + this.getReleaseYear() + "\n" +
                "Seasons: " + this.getSeasons() + "\n" +
                "Episodes: " + this.getEpisodes() + "\n" +
                "Active: " + this.getActive() + "\n" +
                "Duration: " + this.getDuration() + " Minutes\n" +
                "Ratings Amount: " + this.getRatingsAmount() + "\n" +
                "Average Rating: " + this.getAverageRating() + "\n" +
                "Stars: " + this.getStarsClassification() + "\n";
    }
}
