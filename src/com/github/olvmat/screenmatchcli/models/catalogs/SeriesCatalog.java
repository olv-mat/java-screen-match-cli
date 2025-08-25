package com.github.olvmat.screenmatchcli.models.catalogs;

import com.github.olvmat.screenmatchcli.models.titles.Series;

public class SeriesCatalog extends Catalog<Series> {
    public SeriesCatalog() {
        this.addItem(new Series(
                "The Eternaut",
                2025,
                1,
                6,
                56,
                true
        ));
        this.addItem(new Series(
                "Stranger Things",
                2016,
                4,
                34,
                61,
                true
        ));
    }
}
