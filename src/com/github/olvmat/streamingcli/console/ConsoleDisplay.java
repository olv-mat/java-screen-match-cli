package com.github.olvmat.streamingcli.console;

import com.github.olvmat.streamingcli.model.catalogs.Catalog;

import java.util.List;

public class ConsoleDisplay {
    public static void display(String content) {
        System.out.println("=".repeat(50));
        System.out.print(content);
    }

    public static <T> void displayCatalog(String title, Catalog<T> catalog) {
        System.out.println("=".repeat(50));
        System.out.println(title);
        List<T> items = catalog.getItems();
        for (int i = 0; i < items.size(); i++) {
            System.out.printf("%d - %s%n", i + 1, items.get(i));
        }
    }
}
