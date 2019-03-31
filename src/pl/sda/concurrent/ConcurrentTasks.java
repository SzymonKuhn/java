package pl.sda.concurrent;

public class ConcurrentTasks {

    public static void main(String[] args) {
        System.out.println("Main thread open");

        CustomThread customThread = new CustomThread("my custom thread");
        customThread.start();

        CustomRunnable customRunnable = new CustomRunnable();
        Thread thread = new Thread(customRunnable);
        Thread thread2 = new Thread(customRunnable);
        Thread thread3 = new Thread(customRunnable);
        Thread thread4 = new Thread(customRunnable);
        Thread thread5 = new Thread(customRunnable);

        thread.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();

        System.out.println("Main thread close");



    }
}
