package pl.sda.composition.food;

public class Carrot extends Vegetables {
    @Override
    public String getTaste() {
        return "Niepowtarzalny smak ziemi";
    }

    public Carrot(String name) {
        super(name);
    }
}
