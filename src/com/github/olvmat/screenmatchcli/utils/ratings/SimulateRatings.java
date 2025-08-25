package com.github.olvmat.screenmatchcli.utils.ratings;

import com.github.olvmat.screenmatchcli.models.titles.Title;

import java.util.Random;

public class SimulateRatings {
    private static final Random random = new Random();

    public static void simulate(Title title) {
        for (int i = 0; i < random.nextInt(10); i++) {
            title.rate(random.nextDouble() * 10);
        }
    }
}
