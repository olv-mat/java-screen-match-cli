package com.github.olvmat.streamingcli.service;

import java.util.Random;

public class InteractionsSimulator {
    private final Random random = new Random();

    public int simulateIntBetween(int min, int max) {
        return this.random.nextInt(max - min + 1) + min;
    }

    public double simulateDouble() {
        return random.nextDouble() * 10;
    }
}
