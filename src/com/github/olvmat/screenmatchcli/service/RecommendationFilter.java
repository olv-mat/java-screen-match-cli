package com.github.olvmat.screenmatchcli.service;

import com.github.olvmat.screenmatchcli.model.Classifiable;

public class RecommendationFilter {
    public String recommend(Classifiable classifiable) {
        return classifiable.starsClassification() >= 4 ? "Highly Recommended" : "Worth a Try";
    }
}
