package com.github.olvmat.streamingcli.service.calculators;

import com.github.olvmat.streamingcli.model.titles.Title;

import java.util.List;

public class MarathonCalculator {
    private int totalTime;

    public int getTotalTime() {
        return this.totalTime;
    }

    public void add(List<? extends Title> titles) {
        for (Title title: titles) {
            this.totalTime += title.getDuration();
        }
    }
}
