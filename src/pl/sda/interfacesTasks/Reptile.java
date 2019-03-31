package pl.sda.interfacesTasks;

public class Reptile implements Animal, Swimmable {

    @Override
    public String getName() {
        return "Wąż";
    }

    @Override
    public String speak() {
        return "sssssss..........!";
    }

    @Override
    public void fly() {
    }

    @Override
    public int getAge() {
        return 99;
    }
}
