package pl.sda;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Maps {

    public static void main(String[] args) {

        Map<String, String> vocabulary = new HashMap<>();
        //dodawanie
        vocabulary.put("kot", "cat");
        vocabulary.put("dom", "house");
        vocabulary.put("samochód", "car");
        vocabulary.put("ołówek", "pencil");

        //sprawdź
        System.out.println("contains kot " + vocabulary.containsKey("kot"));
        System.out.println("contains dom " + vocabulary.containsKey("dom"));
        System.out.println("contains pencil " + vocabulary.containsValue("pencil"));
        System.out.println("contains bow " + vocabulary.containsValue("bow"));

        //pobierz
        System.out.println("kot in english " + vocabulary.get("kot"));
        System.out.println("pies in english " + vocabulary.get("pies"));
        System.out.println("dom in english " + vocabulary.get("dom"));

        //usuń
        vocabulary.remove("kot");
        System.out.println("kot in english " + vocabulary.get("kot"));

        //przeglądanie
        Set<String> keySet = vocabulary.keySet();
        for (String key : keySet) {
            System.out.println(key + vocabulary.get(key));
        }
    }
}
