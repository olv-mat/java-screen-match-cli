package com.github.olvmat.streamingcli.model.catalogs;

import com.github.olvmat.streamingcli.model.titles.Episode;
import com.github.olvmat.streamingcli.model.titles.Series;

import java.util.List;

public class SeriesCatalog extends Catalog<Series> {
    public SeriesCatalog() {
        List<Episode> episodes = List.of(
                new Episode(1, "Chapter One: The Vanishing of Will Byers"),
                new Episode(2, "Chapter Two: The Weirdo on Maple Street"),
                new Episode(3, "Chapter Three: Holly, Jolly"),
                new Episode(4, "Chapter Four: The Body")
        );
        this.addItem(new Series(
                "Stranger Things",
                2016,
                1,
                51,
                true,
                episodes
        ));
    }
}
