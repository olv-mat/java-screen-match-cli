package com.github.olvmat.screenmatchcli.utils;

import com.github.olvmat.screenmatchcli.interfaces.Classifiable;

public class RecommendationFilter {
    public String recommend(Classifiable classifiable) {
        return classifiable.getStarsClassification() >= 4 ? "Highly Recommended" : "Worth a Try";
    }
}
