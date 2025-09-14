package com.github.olvmat.streamingcli.model.catalogs;

import com.github.olvmat.streamingcli.model.titles.Episode;
import com.github.olvmat.streamingcli.model.titles.Series;

import java.util.ArrayList;
import java.util.List;

public class SeriesCatalog extends Catalog<Series> {
    public SeriesCatalog() {
        List<Episode> episodes = new ArrayList<>();
        episodes.add(
                new Episode(
                        1,
                        "A Night of Cards",
                        1000
                )
        );
        this.addItem(new Series(
                "The Eternaut",
                2025,
                1,
                56,
                true,
                episodes
        ));
        episodes.clear();
        episodes.add(
                new Episode(
                        1,
                        "Chapter One: The Vanishing of Will Byers",
                        6200
                )
        );
        this.addItem(new Series(
                "Stranger Things",
                2016,
                4,
                61,
                true,
                episodes
        ));
    }
}
