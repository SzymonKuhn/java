import java.sql.SQLOutput;
import java.util.Scanner;

public class Statements {

    public static void sprawdzLiczbe(int a) {
        if (a <= 0)
            System.out.println("Liczba " + a + " jest mniejsze lub równe 0");
        else if (a <= 10)
            System.out.println("Liczba " + a + " jest w przedziale od 0 do 10.");
        else if (a <= 100)
            System.out.println("Liczba " + a + " jest w przedziale od 11 do 100.");
        else if (a <= 1000)
            System.out.println("Liczba " + a + " jest w przedziale od 101 do 1000.");
        else System.out.println("Liczba " + a + " jest większa niż 1000.");
    }

    public static void sprawdzOcene(int b) {
        System.out.println("Sprawdzam liczbę " + b);
        switch (b) {
            case (1):
                System.out.println("Ocena niedostateczna.");
                break;
            case (2):
                System.out.println("Ocena mierna");
                break;
            case (3):
                System.out.println("Ocena dostateczna");
                break;
            case (4):
                System.out.println("Ocena dobra");
                break;
            case (5):
                System.out.println("Ocena bardzo dobra");
                break;
            case (6):
                System.out.println("Ocena celująca");
            default:
                System.out.println("Nie ma takiej oceny jak " + b);
        }
    }

    public static void tlumaczCyfre(String c) {
        System.out.println("Sprawdzam " + c);
        switch (c) {
            case ("I"):
                System.out.println("Rzymskie I to arabskie 1");
                break;
            case ("II"):
                System.out.println("Rzymskie II to arabskie 2");
                break;
            case ("III"):
                System.out.println("Rzymskie III to arabskie 3");
                break;
            case ("IV"):
                System.out.println("Rzymskie IV to arabskie 4");
                break;
            case ("V"):
                System.out.println("Rzymskie V to arabskie 5");
                break;
            case ("VI"):
                System.out.println("Rzymskie VI to arabskie 6");
                break;
            case ("VII"):
                System.out.println("Rzymskie VII to arabskie 7");
                break;
            case ("VIII"):
                System.out.println("Rzymskie VIII to arabskie 8");
                break;
            case ("IX"):
                System.out.println("Rzymskie IX to arabskie 9");
                break;
            default:
                System.out.println(c + " nie jest liczbą rzymską z zakresu od I do IX.");
        }

    }

    public static void sprawdzUnicode(int d) {
        System.out.println("Sprawdzam znak numer " + d);
        if (d >= 48 && d <= 57) {
            System.out.println("Znak numer " + d + " jest cyfrą w zakresie od 0 do 9");
        } else if (d >= 97 && d <= 122) {
            System.out.println("Znak numer " + d + "jest małą literą w zakresie od a do z");
        } else if (d >= 65 && d <= 90) {
            System.out.println("Znak numer " + d + " jest dużą literą w zakresie od A do Z");
        } else {
            System.out.println("Znak numer " + d + " nie jest ani cyfrą ani literą");
        }
        System.out.println("Znak numer " + d + " to " + (char) d);
    }

    public static void ileDni(int f) {
        f = 6 - f;
        if (f <= 0 && f >= -1) {
            System.out.println("Weekend już trwa");
        } else if (f <= 5 && f >= 1) {
            System.out.println("Do weekendu pozostało " + f + " dni.");
        } else {
            System.out.println("Wprowadzono nieprawdiłowe dane");
        }
    }

    public static void sprawdzDzien(int e) {
        switch (e) {
            case (1):
                System.out.println("Liczba " + e + " to poniedziałek");
                ileDni(e);
                break;
            case (2):
                System.out.println("Liczba " + e + " to wtorek");
                ileDni(e);
                break;
            case (3):
                System.out.println("Liczba " + e + " to środa");
                ileDni(e);
                break;
            case (4):
                System.out.println("Liczba " + e + " to czwartek");
                ileDni(e);
                break;
            case (5):
                System.out.println("Liczba " + e + " to piątek");
                ileDni(e);
                break;
            case (6):
                System.out.println("Liczba " + e + " to sobota");
                ileDni(e);
                break;
            case (7):
                System.out.println("Liczba " + e + " to niedziela");
                ileDni(e);
                break;
            default:
                System.out.println("Liczba " + e + " nie odpowiada dniom tygodnia");
        }

    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj liczbę do sprawdzenia: ");
        int a = scanner.nextInt();

        sprawdzLiczbe(a);

        System.out.println("Podaj cyfrę rzymską: ");
        String b = scanner.next();


        tlumaczCyfre(b);

        System.out.println("Podaj numer UniCode: ");
        int c = scanner.nextInt();

        sprawdzUnicode(c);

        System.out.println("Podaj numer dnia tygodnia: ");
        int d = scanner.nextInt();

        sprawdzDzien(d);
    }
}
