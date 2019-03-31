package pl.sda.exceptionsTasks;

import java.util.Scanner;

public class PrintTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            int index = scanner.nextInt();
            String[] fruits = new String[]{"apple", "organge", "mango", "cheery"};
            System.out.println(fruits[index]);
        } catch (ArrayIndexOutOfBoundsException aioobe) {
            System.out.println("Zbyt duża liczba");
        } catch (Exception e) {
            System.out.println("Błędny wpis");
        } finally {
            System.out.println("Dziękuję, dobranoc");
        }
    }
}
