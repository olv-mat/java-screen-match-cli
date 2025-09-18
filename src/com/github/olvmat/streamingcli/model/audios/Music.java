package com.github.olvmat.streamingcli.model.audios;

public class Music extends Audio {
    private final String singer;

    public Music(
            String name,
            int duration,
            int reproductions,
            int likes,
            String singer
    ) {
        super(name, duration, reproductions, likes);
        this.singer = singer;
    }

    public String info() {
        return "Music: " + this.name + "\n" +
                "Singer: " + this.singer + "\n" +
                "Duration: " + this.duration + " Minutes" + "\n" +
                "Reproductions: " + this.reproductions + "\n" +
                "Likes: " + this.likes + "\n" +
                "Stars: " + this.starsClassification() + "\n";
    }

    @Override
    public int starsClassification() {
        int classification = (this.reproductions / 1000) + 1;
        return Math.min(classification, 5);
    }

    @Override
    public String toString() {
        return this.name + " (" + this.singer + ")";
    }
}
