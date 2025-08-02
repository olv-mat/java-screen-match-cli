package com.github.olvmat.screenmatchcli.models;

public class Series extends Title {
    private int seasons;
    private int episodes;
    private int episodesDurationAverage;
    private boolean active;

    public int getSeasons() {
        return this.seasons;
    }

    public int getEpisodes() {
        return this.episodes;
    }

    public boolean getActive() {
        return this.active;
    }

    public void setSeasons(int seasons) {
        this.seasons = seasons;
    }

    public void setEpisodes(int episodes) {
        this.episodes = episodes;
    }

    public void setEpisodesDurationAverage(int episodesDurationAverage) {
        this.episodesDurationAverage = episodesDurationAverage;
        this.setDuration(this.episodes * this.episodesDurationAverage);
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    @Override
    public String getData() {
        return this.generateTag() + "\n" +
                "Series: " + this.getName() + "\n" +
                "Release Year: " + this.getReleaseYear() + "\n" +
                "Seasons: " + this.getSeasons() + "\n" +
                "Episodes: " + this.getEpisodes() + "\n" +
                "Duration: " + this.getDuration() + " Minutes\n" +
                "Active: " + this.getActive() + "\n" +
                "Ratings Amount: " + this.getRatingsAmount() + "\n" +
                "Average Rating: " + this.getAverageRating() + "\n" +
                "Stars: " + this.getStars() + "\n";
    }
}
