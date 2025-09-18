package com.github.olvmat.streamingcli.model.catalogs;

import com.github.olvmat.streamingcli.model.audios.Podcast;

public class PodcastCatalog extends Catalog<Podcast> {
    public PodcastCatalog() {
        this.addItem(new Podcast(
                "The Tech Behind AI",
                1500,
                this.interactionsSimulator.simulateIntBetween(500, 100000),
                this.interactionsSimulator.simulateIntBetween(100, 10000),
                "The Daily")
        );
        this.addItem(new Podcast(
                "Climate Change Today",
                1800,
                this.interactionsSimulator.simulateIntBetween(500, 100000),
                this.interactionsSimulator.simulateIntBetween(100, 10000),
                "The Daily")
        );
        this.addItem(new Podcast(
                "Politics in 2025",
                1600,
                this.interactionsSimulator.simulateIntBetween(500, 100000),
                this.interactionsSimulator.simulateIntBetween(100, 10000),
                "The Daily")
        );
        this.addItem(new Podcast(
                "Cultural Trends and Music",
                1700,
                this.interactionsSimulator.simulateIntBetween(500, 100000),
                this.interactionsSimulator.simulateIntBetween(100, 10000),
                "The Daily")
        );
    }
}
