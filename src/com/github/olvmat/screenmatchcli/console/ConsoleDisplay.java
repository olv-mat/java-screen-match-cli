package com.github.olvmat.screenmatchcli.console;

public class ConsoleDisplay {
    public static void display(String content) {
        System.out.println("=".repeat(40));
        System.out.print(content);
    }
}
