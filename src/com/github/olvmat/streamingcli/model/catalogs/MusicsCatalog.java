package com.github.olvmat.streamingcli.model.catalogs;

import com.github.olvmat.streamingcli.model.audios.Music;

public class MusicsCatalog extends Catalog<Music> {
    public MusicsCatalog() {
        this.addItem(new Music(
                "Happy",
                233,
                22598,
                11035,
                "Pharrell Williams")
        );
        this.addItem(new Music(
                "Shake It Off",
                242,
                19373,
                19323,
                "Taylor Swift")
        );
        this.addItem(new Music(
                "Billie Jean",
                294,
                19207,
                10477,
                "Michael Jackson")
        );
        this.addItem(new Music(
                "Shape of You",
                233,
                19268,
                10158,
                "Ed Sheeran")
        );
    }
}
