package pl.sda.functional;

import java.util.*;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class Tasks {

    public static void main(String[] args) {
        //#1
//        useLambdas();

        //#2
        useOptional();

        //#3
        useStreams();
    }

    /**
     * 1. Utwórz i użyj lambdę która:
     * - utworzy obiekt klasy Double (Supplier)
     * - pobierze obiekt klasy String i wyświetli na konsolę (Consumer)
     * - sprawdzi czy podany string ma długość > 10 (Predicate)
     * - przekształci dwie liczby w String (zsumuje je i zwróci reprezentację tekstową) (BiFunction)
     */
    private static void useLambdas() {
        Supplier<Double> doubleSupplier = () -> 10.0;
        System.out.println(doubleSupplier.get());

        Consumer<String> stringConsumer = (String s) -> System.out.println(s);
        stringConsumer.accept("próba metody stringConsumer");

        Predicate<String> stringPredicate = s -> {
            if (s != null){
            return s.length() > 10;
            }
            return false;
        };

//        Predicate<String> stringPredicate = s -> s != null) && s.length() > 10  return false};


        System.out.println(stringPredicate.test("Alamakota"));
        System.out.println(stringPredicate.test("ala nie ma kota"));
        System.out.println(stringPredicate.test("bla bla bla"));
        System.out.println(stringPredicate.test(null));

        BiFunction<Double, Double, String> stringBiFunction = (aDouble, aDouble2) -> String.valueOf(aDouble + aDouble2);

        System.out.println(stringBiFunction.apply(12.1, 14.1));




    }

    /**
     * 2. Utwórz obiekt Optional, który:
     * - nie będzie zawierał żadnej wartości (Optional.empty)
     * - będzie pozwalał przyjmować wartość typu String, która może być `null` (Optional.ofNullable)
     * - rzuci wyjątkiem, w momencie podania wartości null typu Float (Optional.of)
     * - rzuci własny wyjątek, jeśli podano wartość `null` i próbowano pobrać wartość (Optional.orElseThrow)
     * - zwróci wartość domyślną dla typu String jeśli podano wartość `null` (Optional.orElse)
     */
    private static void useOptional() {
        Optional<Integer> optional = Optional.empty();
        System.out.println(optional.isPresent());
        optional.ifPresent(s -> System.out.println("ok"));
        optional.get();

        Optional<String> optionalS = Optional.ofNullable(null);




    }


    /**
     * 3. Utwórz i użyj strumień danych (Stream):
     * - utwórz stream liczb typu Double z kolekcji typu Set - podaj ich sumę i średnią arytmetyczną
     * - utwórz stream liczb całkowitych od 10 do 40, usuń parzyste i podaj sumę pozostałych
     * - utwórz stream obiektów typu String, zamień wszystkie litery na małe, zostaw tylko te które zaczynają się na literę 'a' lub 'z'
     *   i utwórz listę przetworzonych elementów
     * - utwórz stream obiektów Person i utwórz statystykę lat (suma, średnia, minimalny i maksymalny wiek) dla tego zbioru
     * - utwórz strumień który wypisze na ekran ścieżki wszystkich katalogów i podkatalogów znajdujących się w aktualnym katalogu (Files.list && Paths.get("."))
     */
    private static void useStreams() {
        Set<Double> doubleSet = new HashSet<>();
        doubleSet.add(1.1);
        doubleSet.add(20.1);
        doubleSet.add(15.1);
        doubleSet.add(100.2);
        doubleSet.add(23.1);
        doubleSet.add(99.2);
        doubleSet.add(150.1);

        Stream<Double> doubleStream = doubleSet.stream();
        OptionalDouble avg = doubleStream.mapToDouble(d -> d).average();
        Double sum = doubleStream.reduce(0.0, (a, b) -> a + b );




    }
}