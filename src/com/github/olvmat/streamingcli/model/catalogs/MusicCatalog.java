package com.github.olvmat.streamingcli.model.catalogs;

import com.github.olvmat.streamingcli.model.audios.Music;

public class MusicCatalog extends Catalog<Music> {
    public MusicCatalog() {
        this.addItem(new Music("Hurt", 225, "Johnny Cash"));
        this.addItem(new Music("Mad World", 193, "Tears for Fears"));
        this.addItem(new Music("Creep", 238, "Radiohead"));
        this.addItem(new Music("Bury a Friend", 194, "Billie Eilish"));
    }
}
