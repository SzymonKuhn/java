package pl.sda;

import java.util.Scanner;

public class Triangle {

    private int a;
    private int b;
    private int c;

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }


    public Triangle() {


        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj najmniejszy bok trójkąta: ");
        a = scanner.nextInt();

        System.out.println("Podaj średni bok trójkąta: ");
        b = scanner.nextInt();

        System.out.println("Podaj najwiekszy bok trójkąta: ");
        c = scanner.nextInt();

    }

    public boolean isRectangular() {
        int a = getA();
        int b = getB();
        int c = getC();

        return c*c == (a*a) + (b*b);
    }



}
