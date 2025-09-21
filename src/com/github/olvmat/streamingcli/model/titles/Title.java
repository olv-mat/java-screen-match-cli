package com.github.olvmat.streamingcli.model.titles;

import com.github.olvmat.streamingcli.model.Classifiable;
import com.github.olvmat.streamingcli.model.Informative;

public abstract class Title implements Classifiable, Comparable<Title>, Informative {
    protected final String name;
    protected final int releaseYear;
    protected final int duration;
    protected final double averageRating;

    public Title(
            String name,
            int releaseYear,
            int duration,
            double averageRating
    ) {
        this.name = name;
        this.releaseYear = releaseYear;
        this.duration = duration;
        this.averageRating = averageRating;
    }

    public int getDuration() {
        return this.duration;
    }

    public String getAverageRating() {
        return String.format("%.2f", this.averageRating);
    }

    public int starsClassification() {
        return (int) (this.averageRating / 2);
    }

    @Override
    public int compareTo(Title otherTitle) {
        return this.name.compareTo(otherTitle.name);
    }

    @Override
    public String toString() {
        return this.name + " (" + this.releaseYear + ")";
    }
}
