package com.github.olvmat.screenmatchcli.models.titles;

import com.github.olvmat.screenmatchcli.interfaces.Classifiable;

public class Episode implements Classifiable {
    private final Series series;
    private final String episode;
    private final int number;
    private final int views;

    public Episode(
            Series series,
            String episode,
            int number,
            int views
    ) {
        this.series = series;
        this.episode = episode;
        this.number = number;
        this.views = views;
    }

    public String getSeries() {
        return this.series.getName();
    }

    public String getEpisode() {
        return episode;
    }

    public int getNumber() {
        return this.number;
    }

    public int getViews() {
        return this.views;
    }

    public int getStarsClassification() {
        int views = this.views;
        if (views <= 100) {
            return 1;
        } else if (views <= 500) {
            return 2;
        } else if (views <= 1000) {
            return 3;
        } else if (views <= 5000) {
            return 4;
        } else {
            return 5;
        }
    }

    public String getInformation() {
        return "Series: " + this.getSeries() + "\n" +
                "Episode: " + this.getNumber() + ". " + this.getEpisode() + "\n" +
                "Views: " + this.getViews() + "\n" +
                "Stars: " + this.getStarsClassification() + "\n";
    }
}
