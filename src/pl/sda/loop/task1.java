package pl.sda.loop;

public class task1 {

    static void evenNumbers(int x) {
        int j = 2;
        for (int i = 1; i <= x; i++) {
            System.out.print(j + ", ");
            j = j + 2;
        }
    }

    static void power(int a, int b) {
        int x = a;
        for (int i = b; i > 1; i--) {
            x = x * a;
        }
        System.out.println("\nwynik " + x);
    }

    static void upperCaseLetters() {
        for (int i = 65; i <= 90; i = i + 2) {
            System.out.println((char) i);
        }
    }

    static boolean stringEquals(String string1, String string2) {
        for (int i = 0; i < string1.length() || i < string2.length(); i++) {
            if ((string1.charAt(i)) != (string2.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    static void showStignEquals(String a, String b) {
        System.out.println("Porównuję następujące zdania:");
        System.out.println("Zdanie 1: " + a);
        System.out.println("Zdanie 2: " + b);
        if (stringEquals(a, b)) {
            System.out.println("Zdania są takie same");
        } else {
            System.out.println("Zdania nie są takie same");
        }
    }


    public static void main(String[] args) {
        evenNumbers(10);
        power(3, 3);
        upperCaseLetters();
        showStignEquals("ala ma kota", "Ala ma kota");
        showStignEquals("Ala nie ma kota", "Ala ma kota");
    }
}
