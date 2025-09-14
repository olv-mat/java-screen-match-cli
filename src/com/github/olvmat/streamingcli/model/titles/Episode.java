package com.github.olvmat.streamingcli.model.titles;

import com.github.olvmat.streamingcli.model.Classifiable;

public class Episode implements Classifiable {
    private final int number;
    private final String name;
    private int views;

    public Episode(
            int number,
            String name
    ) {
        this.number = number;
        this.name = name;
    }

    public void watch() {
        System.out.println("Watching: " + this.name);
        this.views ++;
    }

    @Override
    public int starsClassification() {
        int classification = (this.views / 100) + 1;
        return Math.min(classification, 5);
    }

    public String info() {
        return "Episode: " + this.number + ". " + this.name + "\n" +
                "Views: " + this.views + "\n" +
                "Stars: " + this.starsClassification() + "\n";
    }
}
