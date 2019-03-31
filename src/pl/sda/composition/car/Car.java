package pl.sda.composition.car;

public class Car {
    private String brand;
    private Engine engine; // wkomponowana klasa `Engine`
    private Entertainment entertainment;

    public Car(String brand, Engine engine, Entertainment entertainment) { // konstruktor wymaga od nas podania obiektu typu Engine
        this.brand = brand;
        this.engine = engine;
        this.entertainment = entertainment;
    }

    public String getBrand() {
        return brand;
    }

    public void start() {
        engine.start(); // wywołanie metody na obiekcie `Engine`
    }

    public EngineType getType() {
        return engine.getEngineType(); // wywołanie metody na obiekcie `Engine`
    }

    public void radioOn() {
        entertainment.radioOn();
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", engine=" + engine +
                '}';
    }
}
