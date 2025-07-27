package com.github.olvmat.screenmatchcli.models;

public class Movie extends Title {
    private String director;

    public String getDirector() {
        return this.director;
    }

    public void setDirector(String director) {
        this.director = director;
    }
}
