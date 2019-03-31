package pl.sda.interfacesTasks;

public class Bird implements Animal, Flyable {
    public String getName() {
        return "Ćwirek";
    }

    @Override
    public String speak() {
        return "Ćwir ćwir!";
    }

    @Override
    public void fly() {

    }

    @Override
    public int getAge() {
        return 10;
    }
}
