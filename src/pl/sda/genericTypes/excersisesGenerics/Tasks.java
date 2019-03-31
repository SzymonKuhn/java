package pl.sda.genericTypes.excersisesGenerics;

import java.util.*;

public class Tasks {

    public static void main(String[] args) {
        //#1
        Set<Double> doubles = setOfDoubles();

        //#2
        Map<Integer, String> genericMap = genericMap();

        //#3
        List<Number> numbers = doublesToNumbers(doubles);
        System.out.println("numbers = " + numbers);

        //#4
        NumbersBox numbersBox = numbersToNumbersBox(numbers);

        //#5
        NumbersBox<Double> doubleNumbersBox = boxOfDoubles(doubles);
    }

    /**
     * 1. Stwórz kolekcję typu Set, zawierającą obiekty klasy Double. Dodaj do niej kilka liczb.
     * Następnie pobierz i wyświetl w konsoli wszystkie elementy kolekcji.
     * Metoda powinna zwrócić stworzoną kolekcję.
     */
    private static Set<Double> setOfDoubles() {
        Set<Double> setOfDoubles = new HashSet<>();
        setOfDoubles.add(123.22);
        setOfDoubles.add(12.1);
        setOfDoubles.add(55.5);
        setOfDoubles.add(10.1);
        setOfDoubles.add(1.0);

        for (Double setOfDouble : setOfDoubles) {
            System.out.println(setOfDouble);
        }

        return setOfDoubles;
    }

    /**
     * 2. Stwórz mapę zawierającą obiekty typu Integer jako klucze i String jako wartości. Dodaj kilka obiektów do mapy.
     * Pobierz i wyświetl w konsoli pojedyncze elementy.
     * Następnie pobierz i wyświetl w konsoli wszystkie elementy mapy.
     * Metoda powinna zwrócić stworzoną mapę.
     */
    private static Map<Integer, String> genericMap() {
        Map<Integer, String> mapOfIntAndStrings = new HashMap<>();
        mapOfIntAndStrings.put(0, "zero");
        mapOfIntAndStrings.put(1, "jeden");
        mapOfIntAndStrings.put(2, "dwa");
        mapOfIntAndStrings.put(3, "trzy");
        mapOfIntAndStrings.put(4, "cztery");
        mapOfIntAndStrings.put(5, "pięć");
        mapOfIntAndStrings.put(6, "sześć");

        System.out.println(mapOfIntAndStrings.get(0));
        System.out.println(mapOfIntAndStrings.get(4));
        System.out.println();
        for (Integer integer : mapOfIntAndStrings.keySet()) {
            System.out.println(integer + " - " + mapOfIntAndStrings.get(integer));
        }
        return mapOfIntAndStrings;
    }

    /**
     * 3. Skopiuj podany zbiór liczby Double do listy obiektów klasy Number.
     * Nie kopiuj obiektu jeżeli jest równy null.
     * Zwróć nową listę jako wynik metody.
     */
    private static List<Number> doublesToNumbers(Set<Double> doubles) {
        List<Number> listOfNumebrs = new ArrayList<>();
        for (Double doubleValue : doubles) {
            if (doubleValue != null) {
                listOfNumebrs.add(doubleValue);
            }
        }

        for (Number number : listOfNumebrs) {
            System.out.println(number);
        }
        return listOfNumebrs;
    }

    /**
     * 4. Uzupełnij klasę NumbersBox która ma przechowywać listę obiektów klasy Number.
     * Dodaj metody które:
     * - sprawdzą czy lista jest pusta
     * - pobierze pierwszy element listy
     * - pobierze pierwszy element listy jako int
     * - pobierze ostatni element listy
     * - pobierze ostatni element listy jako int
     * Zwróć obiekt klasy NumbersBox jako wynik tej metody.
     */
    private static NumbersBox<Number> numbersToNumbersBox(List<Number> numbers) {
        NumbersBox<Number> numbersBox = new NumbersBox<>(numbers);
        System.out.println("Is empty: " + numbersBox.isEmpty());
        System.out.println(numbersBox.getFirst());
        System.out.println(numbersBox.getFirstAsInt());
        System.out.println(numbersBox.getLast());
        System.out.println(numbersBox.getLastAsInt());

        return numbersBox;
    }

    /**
     * 5. Zmień klasę NumbersBox - tak żeby przyjmowała różne typy liczbowe - np. Double
     * Zwróć obiekt klasy NumbersBox jako wynik tej metody.
     */
    private static NumbersBox<Double> boxOfDoubles(Set<Double> doubles) {
        return null;
    }
}
