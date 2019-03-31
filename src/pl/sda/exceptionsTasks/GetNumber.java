package pl.sda.exceptionsTasks;

import java.util.Scanner;

public class GetNumber {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("Podaj liczbę");
                String number = scanner.nextLine();
                int num = Integer.parseInt(number);
                System.out.println(num);
                break;
            } catch (Exception e) {
                System.out.println("Błędna liczba");
            } finally {
                System.out.println("Dziękuję za uwagę.");
            }
        }
    }
}
