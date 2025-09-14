package com.github.olvmat.streamingcli.model.audios;

public class Podcast extends Audio {
    private final String host;

    public Podcast(
            String name,
            int duration,
            String host
    ) {
        super(name, duration);
        this.host = host;
    }

    public String info() {
        return "Podcast: " + this.name + "\n" +
                "Host: " + this.host + "\n" +
                "Duration: " + this.duration + " Minutes" + "\n" +
                "Reproductions: " + this.reproductions + "\n" +
                "Likes: " + this.likes;

    }

    @Override
    public int starsClassification() {
        int classification = (this.likes / 50) + 1;
        return Math.min(classification, 5);
    }

    @Override
    public String toString() {
        return this.name + " (" + this.host + ")";
    }
}
