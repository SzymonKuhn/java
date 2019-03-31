package pl.sda.concurrent;

public class CustomThread extends Thread {
    public CustomThread(String name) {
        super(name);
    }

    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}
