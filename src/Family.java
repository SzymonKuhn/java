public class Family {

    private String familyName;

    private String dadName;
    private String momName;
    private String sonName;
    private String doughterName;
    private int dadAge;
    private int momAge;
    private int sonAge;
    private int doughterAge;

    FamilyPerson dad = new FamilyPerson(familyName, dadName, dadAge);
    FamilyPerson mom = new FamilyPerson(familyName, momName, momAge);
    FamilyPerson son = new FamilyPerson(familyName, sonName, sonAge);
    FamilyPerson doughter = new FamilyPerson(familyName, doughterName, doughterAge);

    public Family(String familyName, String dadName, String mumName, String sonName, String doughterName, int dadAge, int mumAge, int sonAge, int doughterAge) {
        this.familyName = familyName;
        this.dadName = dadName;
        this.momName = mumName;
        this.sonName = sonName;
        this.doughterName = doughterName;
        this.dadAge = dadAge;
        this.momAge = mumAge;
        this.sonAge = sonAge;
        this.doughterAge = doughterAge;
    }

    public void familyIntroduce() {
        System.out.println("Rodzina ma na nazwisko: " + familyName);
        System.out.println();
        System.out.println("Tata nazywa się " +  dadName + " " + familyName + " i ma " + dadAge + " lat.");
        System.out.println("Mama nazywa się " + momName + " " + familyName + " i ma " + momAge + " lat.");
        System.out.println("Syn nazywa się " +  sonName + " " + familyName + " i ma " + sonAge + " lat.");
        System.out.println("Córka nazywa się " +  doughterName + " " + familyName + " i ma " + doughterAge + " lat.");
        System.out.println();
        System.out.print("Tata mówi: ");
        dad.introduce(dadName, familyName, dadAge);
        System.out.print("Mama mówi: ");
        mom.introduce(momName, familyName, momAge);
        System.out.print("Syn mówi: ");
        son.introduce(sonName, familyName, sonAge);
        System.out.print("Córka mówi: ");
        doughter.introduce(doughterName, familyName, doughterAge);
        System.out.println();

    }

}
