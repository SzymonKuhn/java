package pl.sda.composition.food;

public class Salad extends Vegetables {
    @Override
    public String getTaste() {
        return "Połączenie wszystkich smaków świata";
    }

    public Salad(String name) {
        super(name);
    }
}
