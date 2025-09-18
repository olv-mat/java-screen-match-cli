package com.github.olvmat.streamingcli.model.audios;

import com.github.olvmat.streamingcli.model.Classifiable;

public abstract class Audio implements Classifiable {
    protected final String name;
    protected final int duration;
    protected final int reproductions;
    protected final int likes;

    public Audio(
        String name,
        int duration,
        int reproductions,
        int likes
    ) {
        this.name = name;
        this.duration = duration;
        this.reproductions = reproductions;
        this.likes = likes;
    }
}
