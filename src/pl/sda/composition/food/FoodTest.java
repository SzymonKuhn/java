package pl.sda.composition.food;

public class FoodTest {
    public static void main(String[] args) {
        Chicken chicken = new Chicken("kurczaczek");
        Ham ham = new Ham("szyneczka");
        Salad salad = new Salad("sałateczka");
        Carrot carrot = new Carrot("marcheweczka");

        System.out.println("Marchewka: " + carrot.getTaste() + " " + carrot.getType());
        System.out.println("Kurczak: " + chicken.getTaste() + " " + chicken.getType());
        System.out.println("Szynka: " + ham.getTaste() + " " + ham.getType());
        System.out.println("Sałata: " + salad.getTaste() + " " + salad.getType());
    }
}
