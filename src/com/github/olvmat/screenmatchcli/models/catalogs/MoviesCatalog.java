package com.github.olvmat.screenmatchcli.models.catalogs;

import com.github.olvmat.screenmatchcli.models.titles.Movie;

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
