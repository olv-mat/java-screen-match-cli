package com.github.olvmat.streamingcli.service;

import com.github.olvmat.streamingcli.model.titles.Title;

import java.util.Random;

public class RatingSimulator {
    private static final Random random = new Random();

    public static void simulate(Title title) {
        for (int i = 0; i < random.nextInt(10); i++) {
            title.rate(random.nextDouble() * 10);
        }
    }
}
