package com.github.olvmat.streamingcli.model.records;

import com.google.gson.annotations.SerializedName;

public record MovieRecord(
        String title,
        String year,
        String runtime,
        @SerializedName("imdbRating")
        String imdbRating,
        String director
) {
}
