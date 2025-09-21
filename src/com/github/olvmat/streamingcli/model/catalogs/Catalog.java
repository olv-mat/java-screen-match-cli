package com.github.olvmat.streamingcli.model.catalogs;

import com.github.olvmat.streamingcli.model.Classifiable;
import com.github.olvmat.streamingcli.model.Informative;

import java.util.ArrayList;
import java.util.List;

public abstract class Catalog<T extends Classifiable & Informative> {
    protected final List<T> items = new ArrayList<>();

    public void addItem(T item) {
        this.items.add(item);
    }

    public List<T> getItems() {
        return new ArrayList<>(this.items);
    }

    public T getItem(int index) {
        return this.items.get(index);
    }
}
