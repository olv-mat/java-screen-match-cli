package com.github.olvmat.streamingcli.model.catalogs;

import com.github.olvmat.streamingcli.model.titles.Movie;

public class MoviesCatalog extends Catalog<Movie> {
    public MoviesCatalog() {
        this.addItem(new Movie(
                "Hereditary",
                2018,
                127,
                9.8,
                "Ari Aster")
        );
        this.addItem(new Movie(
                "The Witch",
                2015,
                92,
                7.6,
                "Robert Eggers")
        );
        this.addItem(new Movie(
                "Get Out",
                2017,
                104,
                8.8,
                "Jordan Peele")
        );
        this.addItem(new Movie(
                "A Quiet Place",
                2018,
                90,
                7.2,
                "John Krasinski")
        );
    }
}
