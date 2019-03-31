package pl.sda.genericTypes;


public class LiveCoding {
    public static void main(String[] args) {
        Orange orange = new Orange();
        Apple apple = new Apple();
        Strawberry strawberry = new Strawberry();

        Box<Apple> appleBox = new Box<>(apple);
        Box<Orange> orangeBox = new Box<>(orange);
        Box<Strawberry> strawberryBox = new Box<>(strawberry);

        appleBox.isRotten();

    }
}
