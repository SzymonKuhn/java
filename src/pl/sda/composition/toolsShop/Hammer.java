package pl.sda.composition.toolsShop;

public class Hammer extends Tool{
    private double weight;

    public Hammer (String model, double price, double weight) {
        super(model, price);
        this.weight=weight;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Hammer{" +
                "weight=" + weight +
                ", model='" + model + '\'' +
                ", price=" + price +
                '}';
    }

    public String getDescription() {
        return "Hammer. It weights" + weight + " kg." + super.getDescription();
    }

}
