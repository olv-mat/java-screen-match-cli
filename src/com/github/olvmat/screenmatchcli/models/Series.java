package com.github.olvmat.screenmatchcli.models;

public class Series extends Title {
    private int seasons;
    private int episodes;
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

    public void setActive(boolean active) {
        this.active = active;
    }

    @Override
    public void displayData() {
        System.out.println(this.generateTag());
        System.out.println("Series: " + this.getName());
        System.out.println("Release Year: " + this.getReleaseYear());
        System.out.println("Seasons: " + this.getSeasons());
        System.out.println("Episodes: " + this.getEpisodes());
        System.out.println("Active: " + this.getActive());
        System.out.println("Ratings Amount: " + this.getRatingsAmount());
        System.out.println("Average Rating: " + this.getAverageRating());
        System.out.println("Stars: " + this.getStars());
    }
}
