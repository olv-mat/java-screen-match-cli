package com.github.olvmat.streamingcli.model.catalogs;

import com.github.olvmat.streamingcli.model.audios.Music;

public class MusicCatalog extends Catalog<Music> {
    public MusicCatalog() {
        this.addItem(new Music(
                "Happy",
                233,
                this.interactionsSimulator.simulateIntBetween(1000, 1000000),
                this.interactionsSimulator.simulateIntBetween(500, 300000),
                "Pharrell Williams")
        );
        this.addItem(new Music(
                "Shake It Off",
                242,
                this.interactionsSimulator.simulateIntBetween(1000, 1000000),
                this.interactionsSimulator.simulateIntBetween(500, 300000),
                "Taylor Swift")
        );
        this.addItem(new Music(
                "Billie Jean",
                294,
                this.interactionsSimulator.simulateIntBetween(1000, 1000000),
                this.interactionsSimulator.simulateIntBetween(500, 300000),
                "Michael Jackson")
        );
        this.addItem(new Music(
                "Shape of You",
                233,
                this.interactionsSimulator.simulateIntBetween(1000, 1000000),
                this.interactionsSimulator.simulateIntBetween(500, 300000),
                "Ed Sheeran")
        );
    }
}
