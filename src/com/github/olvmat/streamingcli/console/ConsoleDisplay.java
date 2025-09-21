package com.github.olvmat.streamingcli.console;

public class ConsoleDisplay {
    public void display(String content) {
        System.out.println("=".repeat(50));
        System.out.print(content);
    }
}
