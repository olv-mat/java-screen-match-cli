package com.github.olvmat.streamingcli.console;

import java.util.Scanner;

public class ConsoleInput {
    private final Scanner input = new Scanner(System.in);

    public int readInt() {
        int value = this.input.nextInt();
        this.input.nextLine();
        return value;
    }

    public String readText() {
        return this.input.nextLine();
    }
}
