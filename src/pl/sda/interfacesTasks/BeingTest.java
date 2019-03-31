package pl.sda.interfacesTasks;

public class BeingTest {
    public static void main(String[] args) {
        Animal bird = new Bird();
        Animal mammal = new Mammal();
        Animal insect = new Insects();
        Animal fish = new Fish();
        Animal reptile = new Reptile();

        Animal[] animals = {bird, mammal, insect, fish, reptile};

        for (Animal animal : animals) {
            System.out.println(animal.getName() + " says: " + animal.speak() + " age: " + animal.getAge() + " is alive: " + animal.isAlive());
        }
    }
}
