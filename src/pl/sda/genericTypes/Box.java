package pl.sda.genericTypes;

public class Box<T extends Fruit> {
    private T item;

    public Box (T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }

    public void isRotten() {
        item.isRotten();
    }
}
