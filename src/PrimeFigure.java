public class PrimeFigure {


    public static void main(String[] args) {
        System.out.println("Podaj liczbę: ");
        int figure = TypeIn.getInt();

        if ((figure % 2) != 0 && (figure % 3) != 0 && (figure % 5) != 0 && (figure % 7) != 0) {
            System.out.println("Liczba " + figure + " jest liczbą pierwszą!");
        } else {
            System.out.println("Liczba " + figure + " nie jest liczbą pierwszą!");
        }
    }
}
