package com.github.olvmat.streamingcli.model.catalogs;

import com.github.olvmat.streamingcli.model.audios.Podcast;

public class PodcastCatalog extends Catalog<Podcast> {
    public PodcastCatalog() {
        this.addItem(new Podcast("Serial Season 1, Episode 1 – The Alibi", 53, "Sarah Koenig"));
        this.addItem(new Podcast("Serial Season 1, Episode 2 – The Breakup", 56, "Sarah Koenig"));
        this.addItem(new Podcast("Serial Season 1, Episode 3 – Leakin Park", 49, "Sarah Koenig"));
        this.addItem(new Podcast("Serial Season 1, Episode 4 – Inconsistencies", 54, "Sarah Koenig"));
    }
}
