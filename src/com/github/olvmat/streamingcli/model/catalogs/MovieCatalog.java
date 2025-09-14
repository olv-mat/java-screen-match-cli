package com.github.olvmat.streamingcli.model.catalogs;

import com.github.olvmat.streamingcli.model.titles.Movie;

public class MovieCatalog extends Catalog<Movie> {
    public MovieCatalog() {
        this.addItem(new Movie("Hereditary", 2018, 127, "Ari Aster"));
        this.addItem(new Movie("The Witch", 2015, 92, "Robert Eggers"));
        this.addItem(new Movie("Get Out", 2017, 104, "Jordan Peele"));
        this.addItem(new Movie("A Quiet Place", 2018, 90, "John Krasinski"));
    }
}
