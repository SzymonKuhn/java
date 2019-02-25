public class FamilyPerson {
    private String name;
    private String familyName;
    private int age;

    public FamilyPerson(String name, String familyName, int age) {
        this.name = name;
        this.familyName = familyName;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getFamilyName() {
        return familyName;
    }

    public int getAge() {
        return age;
    }

    public void introduce (String name, String familyName, int age) {
        System.out.println("Nazywam się " + name + " " + familyName + ". Mam " + age + " lat.");
    }

}
