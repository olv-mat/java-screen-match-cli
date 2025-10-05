package com.github.olvmat.streamingcli.console;

import java.util.List;

public class ConsoleDisplay {
    public void divider() {
        System.out.println("=".repeat(50));
    }

    public void display(String content) {
        this.divider();
        System.out.print(content.toUpperCase());
    }

    public <T> void displayList(String title, List<T> list) {
        this.divider();
        System.out.println(title.toUpperCase());
        for (int i = 0; i < list.size(); i++) {
            T item = list.get(i);
            System.out.printf("%d - %s%n", (i + 1), item.toString().toUpperCase());
        }
    }

    public void displayMenu(String title, String... options) {
        this.divider();
        System.out.println(title.toUpperCase());
        for (int i = 0; i < options.length; i++) {
            System.out.printf("%d - %s%n", (i + 1), options[i].toUpperCase());
        }
    }
}
