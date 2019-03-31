package pl.sda.tables;

public class TablesTest {

    public static void main(String[] args) {

        int[] tableInt = {13,16,20,22};

        TablesMethod tablesMethod = new TablesMethod();
        tablesMethod.showContent("obiek1", "dkla", "obiekt 2", "tia");
        System.out.println(tablesMethod.sumTable(tableInt));
        System.out.println(tablesMethod.sumTable(12,22,29,33));

        int tabel1[] = tablesMethod.createTable(20);
        for (int i : tabel1) {
            System.out.print(i + ", ");
        }
        System.out.println("");


        float table2[] = tablesMethod.doubleTable(12, 22,33,44,55,66,7, 9);
        for (float i : table2){
            System.out.print(i + ", ");
        }





    }

}
