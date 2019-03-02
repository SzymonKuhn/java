package pl.sda.family;

public class FamilyTest {

    public static void main(String[] args) {
        Family kowalscy = new Family ("Kowalski", "Jan", "Ewa", "Michał", "Ania", 45, 48, 12, 13);
        kowalscy.familyIntroduce();

        Family nowak = new Family ("Nowak", "Bogdan", "Janina", "Paweł", "Basia", 57, 53, 25, 31);
        nowak.familyIntroduce();
    }
}
