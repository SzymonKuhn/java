package pl.sda.composition.toolsShop;

public class ShoppingCart {
    Tool[] cart = new Tool[10];

    public void addTooltoCart(Tool tool) {
        for (int i = 0; i < cart.length; i++) {
            if (cart[i] == null) {
                cart[i] = tool;
                return;
            }
        }
        System.out.println("Koszyk jest pełny");
    }

    public void showModels() {
        System.out.println();
        for (int i = 0; i < cart.length; i++) {
            if (cart[i] != null) {
                System.out.print(cart[i].getModel() + ", ");
            }
        }
    }

    public double getSum() {
        double result = 0.0;
        System.out.println();
        for (int i = 0; i < cart.length; i++) {
            if (cart[i] != null) {
                result = result + cart[i].getPrice();
            }
        }
        return result;
    }

    public void showDescription() {
        System.out.println();
        for (int i = 0; i < cart.length; i++) {
            if (cart[i] != null) {
                System.out.print(cart[i].getDescription() + ", ");
            }
        }
    }
}
