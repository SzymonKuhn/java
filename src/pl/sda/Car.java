package pl.sda;

public class Car {
    String color, brand;

    public Car(String color, String brand) {
        this.color = color;
        this.brand = brand;
    }
// komentarz dodany na githubie
    @Override
    public String toString() {
        return "pl.sda.Car{" +
                "color='" + color + '\'' +
                ", brand='" + brand + '\'' +
                '}';
    }

}
