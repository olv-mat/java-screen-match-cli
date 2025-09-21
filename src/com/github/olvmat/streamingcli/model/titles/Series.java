package com.github.olvmat.streamingcli.model.titles;

import java.util.ArrayList;
import java.util.List;

public class Series extends Title {
    private final int seasons;
    private final int episodes;
    private final boolean active;
    private final List<Episode> episodesList;

    public Series(
            String name,
            int releaseYear,
            double averageRating,
            int seasons,
            int episodesDurationAverage,
            boolean active,
            List<Episode> episodesList
    ) {
        super(
                name,
                releaseYear,
                (episodesList.size() * episodesDurationAverage),
                averageRating
        );
        this.seasons = seasons;
        this.episodes = episodesList.size();
        this.active = active;
        this.episodesList = episodesList;
    }

    public List<Episode> getEpisodesList() {
        return new ArrayList<>(this.episodesList);
    }

    public String isActive() {
        return this.active ? "Yes" : "No";
    }

    @Override
    public String information() {
        return "Series: " + this.name + "\n" +
                "Active: " + this.isActive() + "\n" +
                "Release Year: " + this.releaseYear + "\n" +
                "Seasons: " + this.seasons + "\n" +
                "Episodes: " + this.episodes + "\n" +
                "Total Duration: " + this.duration + " Minutes\n" +
                "Average Rating: " + this.getAverageRating() + "\n" +
                "Stars: " + this.starsClassification() + "\n";
    }
}
