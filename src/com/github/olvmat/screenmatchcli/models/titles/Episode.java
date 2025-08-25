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

    public String seriesName() {
        return this.series.name;
    }

    public int starsClassification() {
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

    public String info() {
        return "Series: " + this.series + "\n" +
                "Episode: " + this.number + ". " + this.episode + "\n" +
                "Views: " + this.views + "\n" +
                "Stars: " + this.starsClassification() + "\n";
    }

    @Override
    public String toString() {
        return this.episode + " (" + this.seriesName() + ")";
    }
}
