package com.github.olvmat.streamingcli.service.filters;

import com.github.olvmat.streamingcli.model.interfaces.Classifiable;

public class RecommendationFilter {
    public String recommend(Classifiable classifiable) {
        return classifiable.starsClassification() > 4
                ? "Highly Recommended".toUpperCase()
                : "Worth a Try".toUpperCase();
    }
}
