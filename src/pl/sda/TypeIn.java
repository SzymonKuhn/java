package pl.sda;

import java.util.Scanner;

public class TypeIn {

    static int getInt (){
        int a;
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        return a;
    }
    static double getDouble (){
        double a;
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextDouble();
        return a;
    }

    static String getString() {
        String a;
        Scanner scanner = new Scanner(System.in);
        a = scanner.next();
        return a;
    }
}
