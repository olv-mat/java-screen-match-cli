package com.github.olvmat.streamingcli.model.catalogs;

import com.github.olvmat.streamingcli.model.titles.Episode;
import com.github.olvmat.streamingcli.model.titles.Series;

import java.util.List;

public class SeriesCatalog extends Catalog<Series> {
    public SeriesCatalog() {
        this.addItem(new Series(
                "Stranger Things",
                2016,
                this.interactionsSimulator.simulateDouble(),
                1,
                51,
                true,
                List.of(
                        new Episode(
                                1,
                                "Chapter One: The Vanishing of Will Byers",
                                this.interactionsSimulator.simulateIntBetween(500, 10000)
                        ),
                        new Episode(
                                2,
                                "Chapter Two: The Weirdo on Maple Street",
                                this.interactionsSimulator.simulateIntBetween(500, 10000)
                        ),
                        new Episode(
                                3,
                                "Chapter Three: Holly, Jolly",
                                this.interactionsSimulator.simulateIntBetween(500, 10000)
                        ),
                        new Episode(
                                4,
                                "Chapter Four: The Body",
                                this.interactionsSimulator.simulateIntBetween(500, 10000)
                        )
                )
        ));
    }
}
