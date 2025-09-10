package com.github.olvmat.screenmatchcli.service;

import com.github.olvmat.screenmatchcli.model.titles.Title;

import java.util.ArrayList;
import java.util.List;

public class WatchedFilter {
    private final ArrayList<Title> watched = new ArrayList<>();

    public void add(Title title) {
        this.watched.add(title);
    }

    public List<Title> allWatched() {
        return List.copyOf(this.watched);
    }
}
