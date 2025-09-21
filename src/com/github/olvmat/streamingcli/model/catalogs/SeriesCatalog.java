package com.github.olvmat.streamingcli.model.catalogs;

import com.github.olvmat.streamingcli.model.titles.Episode;
import com.github.olvmat.streamingcli.model.titles.Series;

import java.util.List;

public class SeriesCatalog extends Catalog<Series> {
    public SeriesCatalog() {
        this.addItem(new Series(
                "Stranger Things",
                2016,
                9.3,
                1,
                51,
                true,
                List.of(
                        new Episode(
                                1,
                                "Chapter One: The Vanishing of Will Byers",
                                7295
                        ),
                        new Episode(
                                2,
                                "Chapter Two: The Weirdo on Maple Street",
                                5509
                        ),
                        new Episode(
                                3,
                                "Chapter Three: Holly, Jolly",
                                9989
                        ),
                        new Episode(
                                4,
                                "Chapter Four: The Body",
                                5085
                        )
                )
        ));
    }
}
