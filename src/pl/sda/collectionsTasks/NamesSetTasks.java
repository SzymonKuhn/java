package pl.sda.collectionsTasks;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class NamesSetTasks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<String> setOfNames = new HashSet<>();

        while (true) {
            System.out.println("Podaj imię lub wpisz q aby zakończyć");
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("q")) {
                break;
            }
            setOfNames.add(input);
        }
        Iterator<String> iterator = setOfNames.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next());
        }
    }
}
