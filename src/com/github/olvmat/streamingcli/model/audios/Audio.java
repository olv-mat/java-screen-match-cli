package com.github.olvmat.streamingcli.model.audios;

import com.github.olvmat.streamingcli.model.Classifiable;

public abstract class Audio implements Classifiable {
    protected final String title;
    protected final int duration;
    protected int reproductions;
    protected int likes;

    public Audio(
        String title,
        int duration
    ) {
        this.title = title;
        this.duration = duration;
    }

    public void play() {
        System.out.println("Now Playing: " + this.title);
        this.reproductions ++;
    }

    public void like() {
        System.out.println("You Liked: " + this.title);
        this.likes ++;
    }
}
