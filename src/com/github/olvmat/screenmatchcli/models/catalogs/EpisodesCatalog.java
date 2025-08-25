package com.github.olvmat.screenmatchcli.models.catalogs;

import com.github.olvmat.screenmatchcli.models.titles.Episode;
import com.github.olvmat.screenmatchcli.models.titles.Series;

public class EpisodesCatalog extends Catalog<Episode> {
    public EpisodesCatalog() {
        this.addItem(new Episode(
                new Series(
                        "The Simpsons",
                        1989,
                        37,
                        790,
                        30,
                        true),
                "Simpsons Roasting on an Open Fire",
                1,
                4580));
    }
}
