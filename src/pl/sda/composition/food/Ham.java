package pl.sda.composition.food;

public class Ham extends Meat {
    @Override
    public String getTaste() {
        return "Jak za komuny";
    }

    public Ham(String name) {
        super(name);
    }
}
