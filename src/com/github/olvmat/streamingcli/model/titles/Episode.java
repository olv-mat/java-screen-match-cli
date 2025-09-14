package com.github.olvmat.streamingcli.model.titles;

import com.github.olvmat.streamingcli.model.Classifiable;

public class Episode implements Classifiable {
    private final int number;
    private final String name;
    private final int views;

    public Episode(
            int number,
            String name,
            int views
    ) {
        this.number = number;
        this.name = name;
        this.views = views;
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
        return "Episode: " + this.number + ". " + this.name + "\n" +
                "Views: " + this.views + "\n" +
                "Stars: " + this.starsClassification() + "\n";
    }
}
