package pl.sda;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class MapsTasks {

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(-4, "minus cztery");
        map.put(-3, "minus trzy");
        map.put(-2, "minus dwa");
        map.put(-1, "minus jeden");
        map.put(0, "zero");
        map.put(1, "jeden");
        map.put(2, "dwa");
        map.put(3, "trzy");
        map.put(4, "cztery");
        map.put(5, "pięć");
        map.put(6, "sześć");

        System.out.println("map size: " + map.size());

        Set<Integer> keySet = map.keySet();
        for (Integer integer : keySet) {
            System.out.println("klucz: " + integer + " i wartość: " + map.get(integer));
        }

        int integersLessEqZero = 0;
        int integerMoreZero = 0;

        for (Integer integer : map.keySet()) {
             if (integer < 0) {
                integersLessEqZero ++;
            }
        }

        for (Integer integer : map.keySet()) {
            if (integer >= 0) {
                integerMoreZero ++;
            }
        }

        System.out.println("liczba kluczy < 0: " + integersLessEqZero);
        System.out.println("liczba kluczy => 0: " + integerMoreZero);

        Map<Integer, String> mapLessThenZero = new HashMap<>();


        for (Integer integer : map.keySet()) {
            if (integer < 0) {
                mapLessThenZero.put(integer, map.get(integer));
            }
        }

        System.out.println("Mapa mniejszych niż zero");
        for (Integer integer : mapLessThenZero.keySet()) {
            System.out.println(integer + " " + mapLessThenZero.get(integer));
        }

        System.out.println("Mapa większych równych zero");
        for (Integer integer : map.keySet()) {
            System.out.println(integer + " " + map.get(integer));
        }

    }
}
