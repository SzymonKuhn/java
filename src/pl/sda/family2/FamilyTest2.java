package pl.sda.family2;

public class FamilyTest2 {

    public static void main(String[] args) {
        FamilyPerson2 dad1 = new FamilyPerson2("Jan", "Kowalski", 43);
        System.out.println("dad1 = " + dad1);
        FamilyPerson2 mom1 = new FamilyPerson2("Maria", "Kowalska", 45);
        FamilyPerson2 child1 = new FamilyPerson2("Jaś", "Kowalski", 12);

        Family2 family1 = new Family2(dad1, mom1, child1, "Rodzina Kowalskich");
        System.out.println(family1);

    }
}
