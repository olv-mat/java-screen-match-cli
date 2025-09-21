package com.github.olvmat.streamingcli.model.audios;

public class Podcast extends Audio {
    private final String host;

    public Podcast(
            String name,
            int duration,
            int reproductions,
            int likes,
            String host
    ) {
        super(name, duration, reproductions, likes);
        this.host = host;
    }

    @Override
    public String information() {
        return "Podcast: " + this.name + "\n" +
                "Host: " + this.host + "\n" +
                "Duration: " + this.duration + " Minutes" + "\n" +
                "Reproductions: " + this.reproductions + "\n" +
                "Likes: " + this.likes + "\n" +
                "Stars: " + this.starsClassification() + "\n";
    }

    @Override
    public int starsClassification() {
        int classification = (this.likes / 200) + 1;
        return Math.min(classification, 5);
    }

    @Override
    public String toString() {
        return this.name + " (" + this.host + ")";
    }
}
