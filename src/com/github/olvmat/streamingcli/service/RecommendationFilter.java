package com.github.olvmat.streamingcli.service;

import com.github.olvmat.streamingcli.model.Classifiable;

public class RecommendationFilter {
    public String recommend(Classifiable classifiable) {
        return classifiable.starsClassification() > 4 ? "Highly Recommended" : "Worth a Try";
    }
}
