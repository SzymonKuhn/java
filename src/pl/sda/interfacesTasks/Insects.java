package pl.sda.interfacesTasks;

public class Insects implements Animal, Flyable {
    @Override
    public String getName() {
        return "Mucha";
    }

    @Override
    public String speak() {
        return "Bzzzzzz....!";
    }

    @Override
    public void fly() {
    }

    @Override
    public int getAge() {
        return 110;
    }
}
