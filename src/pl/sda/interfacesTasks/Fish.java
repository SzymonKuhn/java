package pl.sda.interfacesTasks;

public class Fish implements Animal, Swimmable {
    @Override
    public String getName() {
        return "Ryba";
    }

    @Override
    public String speak() {
        return "Bul, bul!";
    }

    @Override
    public void fly() {
    }

    @Override
    public int getAge() {
        return 120;
    }
}
