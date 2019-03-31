package pl.sda.interfacesTasks;

public class Mammal implements Animal {
    @Override
    public String getName() {
        return "Rumak";
    }

    @Override
    public String speak() {
        return "tup, tup, tup";
    }

    @Override
    public int getAge() {
        return 50;
    }

    @Override
    public boolean isAlive() {
        return false;
    }
}
