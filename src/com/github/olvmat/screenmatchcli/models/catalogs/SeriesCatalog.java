package com.github.olvmat.screenmatchcli.models.catalogs;

import com.github.olvmat.screenmatchcli.models.titles.Series;

public class SeriesCatalog extends Catalog<Series> {
    public SeriesCatalog() {
        this.addItem(new Series(
                "The Eternaut",
                2025,
                1,
                6,
                true
        ));
        this.getItem(0).setDuration(56);
        this.addItem(new Series(
                "Stranger Things",
                2016,
                4,
                34,
                true
        ));
        this.getItem(1).setDuration(61);
    }
}
