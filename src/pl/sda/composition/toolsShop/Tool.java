package pl.sda.composition.toolsShop;

public class Tool {
    String model;
    double price;

    public Tool(String model, double price) {
        this.model = model;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Tool{" +
                "model='" + model + '\'' +
                ", price=" + price +
                '}';
    }

    public String getDescription() {
        return "This tool is a " + model + " model. It costs " + price + "PLN.";
    }
}
