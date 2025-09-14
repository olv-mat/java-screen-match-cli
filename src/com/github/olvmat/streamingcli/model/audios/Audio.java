package com.github.olvmat.streamingcli.model.audios;

import com.github.olvmat.streamingcli.model.Classifiable;

public abstract class Audio implements Classifiable {
    protected final String name;
    protected final int duration;
    protected int reproductions;
    protected int likes;

    public Audio(
        String name,
        int duration
    ) {
        this.name = name;
        this.duration = duration;
    }

    public void play() {
        System.out.println("Now Playing: " + this.name);
        this.reproductions ++;
    }

    public void like() {
        System.out.println("You Liked: " + this.name);
        this.likes ++;
    }
}
