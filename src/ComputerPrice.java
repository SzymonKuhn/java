import java.util.Scanner;

public class ComputerPrice {

    static int getPrice (){
        int a;
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        return a;
    }

    public static void main(String[] args) {

        int cenaPlyta, cenaProc, cenaRam, cenaDysk, cenaMonit;

        System.out.println("Podaj cenę płyty głównej: ");
        cenaPlyta = getPrice();

        System.out.println("Podaj cenę procesora: ");
        cenaProc = getPrice();

        System.out.println("Podaj cenę pamięci ram: ");
        cenaRam = getPrice();

        System.out.println("Podaj cenę dysku główego: ");
        cenaDysk = getPrice();

        System.out.println("Podaj cenę monitora: ");
        cenaMonit = getPrice();


        double vat = 0.23;

        int cenaKompNetto = cenaPlyta + cenaProc + cenaRam + cenaDysk;
        double cenaKompBrutto = (double) cenaKompNetto + (cenaKompNetto * vat);

        System.out.println(cenaKompNetto);
        System.out.println(cenaKompBrutto);

    }
}
