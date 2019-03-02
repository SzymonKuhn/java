public class Car {
    String color, brand;

    public Car(String color, String brand) {
        this.color = color;
        this.brand = brand;
    }
// komentarz dodany na githubie
    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", brand='" + brand + '\'' +
                '}';
    }

}
