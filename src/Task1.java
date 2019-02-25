public class Task1 {

    public static void main(String[] args) {
        int zmienna1, zmienna2;
        zmienna1 = 15;
        zmienna2 = 6;

        System.out.println("Liczba 1 =" + zmienna1);
        System.out.println("Liczba 2 = " + zmienna2);
        System.out.println("Suma = " + (zmienna1 + zmienna2));
        System.out.println("Różnica = " + (zmienna1 - zmienna2));
        System.out.println("Iloczyn = " + (zmienna1 * zmienna2));

        System.out.println("Liczba 1 do 3 potęgi = " + zmienna1 * zmienna1 * zmienna1);

        int reszta1 = zmienna1 % 2;
        int reszta2 = zmienna2 % 2;

        if (reszta1 == 0) {
            System.out.println("Liczba 1 jest liczbą parzystą");
        } else {
            System.out.println("Liczba 1 jest liczbą nieparzystą");
        }

        if (reszta2 == 0) {
            System.out.println("Liczba 2 jest liczbą parzystą");
        } else {
            System.out.println("Liczba 2 jest liczbą nieparzystą");
        }

        int reszta3, reszta5;
        reszta3 = zmienna1 % 3;
        reszta5 = zmienna1 % 5;
        boolean podzielna = (reszta3 == 0 && reszta5 == 0);
        System.out.println("Liczba 1 jest podzielna przez 3 i przez 5? " + podzielna);

        System.out.println("5 liter łacińskich: " + (char) 65 + (char) 66 + (char) 67);
        System.out.println("5 liter hebrajskich: " + (char) 1488 + (char) 1489+ (char) 1490);
        System.out.println("5 liter tybetańskich: " + (char) 3840 + (char) 3841 + (char) 3842);

        System.out.println("" + (char) 74 + (char) 65 + (char) 86 + (char) 65 + (char) 32 + (char) 8658 + (char) 32 + (char) 9786);







    }

}


