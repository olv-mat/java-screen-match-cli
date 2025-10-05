package com.github.olvmat.streamingcli.model.catalogs;

import com.github.olvmat.streamingcli.model.interfaces.Classifiable;
import com.github.olvmat.streamingcli.model.interfaces.Informative;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class Catalog<T extends Classifiable & Informative & Comparable<? super T>> {
    protected final List<T> items = new ArrayList<>();

    public void addItem(T item) {
        this.items.add(item);
    }

    public List<T> getItems() {
        List<T> catalogCopy = new ArrayList<>(this.items);
        Collections.sort(catalogCopy);
        return catalogCopy;
    }

    public T getItem(int index) {
        return this.items.get(index);
    }
}
