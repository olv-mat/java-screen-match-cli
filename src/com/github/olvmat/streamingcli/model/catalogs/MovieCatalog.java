package com.github.olvmat.streamingcli.model.catalogs;

import com.github.olvmat.streamingcli.model.titles.Movie;

public class MovieCatalog extends Catalog<Movie> {
    public MovieCatalog() {
        this.addItem(new Movie(
                "Hereditary",
                2018,
                127,
                this.interactionsSimulator.simulateDouble(),
                "Ari Aster")
        );
        this.addItem(new Movie(
                "The Witch",
                2015,
                92,
                this.interactionsSimulator.simulateDouble(),
                "Robert Eggers")
        );
        this.addItem(new Movie(
                "Get Out",
                2017,
                104,
                this.interactionsSimulator.simulateDouble(),
                "Jordan Peele")
        );
        this.addItem(new Movie(
                "A Quiet Place",
                2018,
                90,
                this.interactionsSimulator.simulateDouble(),
                "John Krasinski")
        );
    }
}
