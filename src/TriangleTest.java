import java.util.Scanner;

public class TriangleTest {


    public static void main(String[] args) {
//        int a;
//        int b;
//        int c;
//
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Podaj najmniejszy bok trójkąta: ");
//        a = scanner.nextInt();
//
//        System.out.println("Podaj średni bok trójkąta: ");
//        b = scanner.nextInt();
//
//        System.out.println("Podaj najwiekszy bok trójkąta: ");
//        c = scanner.nextInt();


        Triangle trojkat = new Triangle();
        System.out.print("Trójkąt o bokach a=" + trojkat.getA() + ", b=" + trojkat.getB() + ", c=" + trojkat.getC() + " ");
        if (trojkat.isRectangular() == true) {
            System.out.print("jest prostokątny.");
        } else {
            System.out.print("jest nieprostokątny.");
        }

    }
}
