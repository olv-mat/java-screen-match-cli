package com.github.olvmat.streamingcli.model.catalogs;

import com.github.olvmat.streamingcli.model.audios.Podcast;

public class PodcastsCatalog extends Catalog<Podcast> {
    public PodcastsCatalog() {
        this.addItem(new Podcast(
                "The Tech Behind AI",
                1500,
                3677,
                883,
                "The Daily")
        );
        this.addItem(new Podcast(
                "Climate Change Today",
                1800,
                2031,
                542,
                "The Daily")
        );
        this.addItem(new Podcast(
                "Politics in 2025",
                1600,
                2020,
                682,
                "The Daily")
        );
        this.addItem(new Podcast(
                "Cultural Trends and Music",
                1700,
                3060,
                752,
                "The Daily")
        );
    }
}
