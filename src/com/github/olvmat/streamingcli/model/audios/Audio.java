package com.github.olvmat.streamingcli.model.audios;

import com.github.olvmat.streamingcli.model.Classifiable;
import com.github.olvmat.streamingcli.model.Informative;

public abstract class Audio implements Classifiable, Informative, Comparable<Audio> {
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

    @Override
    public int compareTo(Audio otherAudio) {
        return this.name.compareTo(otherAudio.name);
    }
}
