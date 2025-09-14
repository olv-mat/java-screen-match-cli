package com.github.olvmat.streamingcli.model.audios;

public class Music extends Audio {
    private final String singer;

    public Music(
            String name,
            int duration,
            String singer
    ) {
        super(name, duration);
        this.singer = singer;
    }

    public String info() {
        return "Music: " + this.name + "\n" +
                "Singer: " + this.singer + "\n" +
                "Duration: " + this.duration + " Minutes" + "\n" +
                "Reproductions: " + this.reproductions + "\n" +
                "Likes: " + this.likes;

    }

    @Override
    public int starsClassification() {
        int classification = (this.reproductions / 1000) + 1;
        return Math.min(classification, 5);
    }

    @Override
    public String toString() {
        return this.name + "(" + this.singer + ")";
    }
}
