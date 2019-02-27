public class IloscCukierkow {

    public static void main(String[] args) {
        int group1;
        int group2;
        int maks;

        System.out.println("Podaj liczbę dzieci w pierwszej grupie: ");
        group1 = TypeIn.getInt();
        System.out.println("Podaj liczbę dzieci w drugiej grupie: ");
        group2 = TypeIn.getInt();

        maks = group1 * group2;

        for (int i = 1; i <= maks; i++ ) {
            if (((i % group1) == 0) && (( i % group2 ) == 0)) {
                System.out.println("Trzeba kupić " + i + " cukierków.");
                break;
            }
        }

    }
}
