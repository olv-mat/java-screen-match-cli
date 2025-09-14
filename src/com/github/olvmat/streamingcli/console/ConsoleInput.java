package com.github.olvmat.streamingcli.console;

import java.util.Scanner;

public class ConsoleInput {
    private final Scanner input = new Scanner(System.in);

    public int readInt() {
        return this.input.nextInt();
    }
}
