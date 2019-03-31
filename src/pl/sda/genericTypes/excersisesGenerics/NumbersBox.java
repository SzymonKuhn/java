package pl.sda.genericTypes.excersisesGenerics;

import java.util.List;

public class NumbersBox<T extends Number> {
    private List<T> items;

    public NumbersBox(List<T> items) {
        this.items = items;
    }

    public boolean isEmpty() {
        return items.isEmpty();
    }


    public T getFirst() {
        return items.get(0);
    }

    public int getFirstAsInt() {
        return items.get(0).intValue();
    }

    public T getLast() {
        return items.get(items.size() - 1);
    }

    public int getLastAsInt() {
        return items.get(items.size() - 1).intValue();
    }


}