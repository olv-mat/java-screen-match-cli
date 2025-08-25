package com.github.olvmat.screenmatchcli.models.catalogs;

import java.util.ArrayList;
import java.util.List;

public abstract class Catalog<T> {
    protected final List<T> items = new ArrayList<>();

    public void addItem(T item) {
        this.items.add(item);
    }

    public List<T> getItems() {
        return List.copyOf(this.items);
    }

    public T getItem(int index) {
        return this.items.get(index);
    }
}
