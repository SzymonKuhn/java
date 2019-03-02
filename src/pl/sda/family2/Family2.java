package pl.sda.family2;

public class Family2 {

    FamilyPerson2 dad;
    FamilyPerson2 mom;
    FamilyPerson2 child;
    String name;

    public Family2(FamilyPerson2 dad, FamilyPerson2 mom, FamilyPerson2 child, String name) {
        this.dad = dad;
        this.mom = mom;
        this.child = child;
        this.name = name;
    }

    @Override
    public String toString() {
        return "pl.sda.family2.family2{" +
                "dad=" + dad +
                ", mom=" + mom +
                ", child=" + child +
                ", name='" + name + '\'' +
                '}';
    }
}
