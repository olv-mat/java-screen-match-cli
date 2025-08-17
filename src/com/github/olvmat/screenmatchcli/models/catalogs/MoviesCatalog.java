package com.github.olvmat.screenmatchcli.models.catalogs;

import com.github.olvmat.screenmatchcli.models.titles.Movie;

public class MoviesCatalog extends Catalog<Movie> {
    public MoviesCatalog() {
        this.addItem(new Movie(
                "Hereditary",
                2018,
                "Ari Aster"
        ));
        this.getItem(0).setDuration(127);
        this.addItem(new Movie(
                "The Witch",
                2015,
                "Robert Eggers"
        ));
        this.getItem(1).setDuration(92);
    }
}
