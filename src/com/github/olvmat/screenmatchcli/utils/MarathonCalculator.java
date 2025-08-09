package com.github.olvmat.screenmatchcli.utils;

import com.github.olvmat.screenmatchcli.models.Title;

public class MarathonCalculator {
    private int totalTime;

    public int getTotalTime() {
        return this.totalTime;
    }

    public void add(Title title) {
        this.totalTime += title.getDuration();
    }
}
