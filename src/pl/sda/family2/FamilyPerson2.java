package pl.sda.family2;

public class FamilyPerson2 {

    private String name;
    private String familyName;
    private int age;

    public FamilyPerson2(String name, String familyName, int age) {
        this.name = name;
        this.familyName = familyName;
        this.age = age;
    }

    @Override
    public String toString() {
        return "pl.sda.family2.FamilyPerson2{" +
                "name='" + name + '\'' +
                ", familyName='" + familyName + '\'' +
                ", age=" + age +
                '}';
    }
}
