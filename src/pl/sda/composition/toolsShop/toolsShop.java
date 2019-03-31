package pl.sda.composition.toolsShop;

public class toolsShop {

    public static void main(String[] args) {
        Hammer hammer = new Hammer("młotek", 25.50, 5.0);
        Saw saw = new Saw ("piła", 35.50, 13.1);
//        System.out.println(hammer.toString());
//        System.out.println(saw.toString());
//        System.out.println(hammer.getPrice());
//        System.out.println(saw.getPrice());

        ShoppingCart koszyk = new ShoppingCart();
        koszyk.addTooltoCart(hammer);
        koszyk.addTooltoCart(saw);
        koszyk.addTooltoCart(saw);
        koszyk.addTooltoCart(saw);
        koszyk.addTooltoCart(saw);
        koszyk.addTooltoCart(saw);
        koszyk.addTooltoCart(saw);
        koszyk.addTooltoCart(saw);
        koszyk.addTooltoCart(saw);
        koszyk.addTooltoCart(hammer);
        koszyk.addTooltoCart(hammer);
        koszyk.addTooltoCart(hammer);
        System.out.println("Łącznie koszt: " + koszyk.getSum());
        koszyk.showModels();
        System.out.println();
        System.out.println(saw.getDescription());
        System.out.println(hammer.getDescription());
        koszyk.showDescription();


    }
}
