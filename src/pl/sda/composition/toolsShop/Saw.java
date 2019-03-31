package pl.sda.composition.toolsShop;

public class Saw extends Tool{
    double length;

    public Saw (String model, double price, double length) {
        super(model, price);
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    @Override
    public String toString() {
        return "Saw{" +
                "length=" + length +
                ", model='" + model + '\'' +
                ", price=" + price +
                '}';
    }

    public String getDescription() {
        return "Saw. It has " + length + " cm length." + super.getDescription();
    }
}
