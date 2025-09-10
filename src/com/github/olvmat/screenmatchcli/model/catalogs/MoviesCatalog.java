package com.github.olvmat.screenmatchcli.model.catalogs;

import com.github.olvmat.screenmatchcli.model.titles.Movie;

public class MoviesCatalog extends Catalog<Movie> {
    public MoviesCatalog() {
        this.addItem(new Movie(
                "Hereditary",
                2018,
                127,
                "Ari Aster"
        ));
        this.addItem(new Movie(
                "The Witch",
                2015,
                92,
                "Robert Eggers"
        ));
    }
}
