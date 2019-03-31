package pl.sda.concurrent;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class DividersTest  {

    public static void main(String[] args) {
        dividersWithExecutorsSerice();

    }

    private static void dividersWithExecutorsSerice() {
        long start  = System.currentTimeMillis();
        ExecutorService executorService = Executors.newFixedThreadPool(6);
        executorService.execute(new Dividers(2500));
        executorService.shutdown();

        long stop  = System.currentTimeMillis();
        System.out.println("Time: " + (stop - start) + " ms.");
    }
}
