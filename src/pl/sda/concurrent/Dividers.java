package pl.sda.concurrent;

import java.util.ArrayList;
import java.util.List;

public class Dividers implements Runnable {
    int num;
    List<Integer> dividersList = new ArrayList<>();

    public Dividers (int num){
        this.num = num;
    }

    @Override
    public void run() {
        System.out.println("Dividers for " + num);
        for (int i = 1; i  <= num; i++) {
            if (num % i == 0) {
                dividersList.add(i);
            }
        }
        System.out.println(dividersList);

    }
}
