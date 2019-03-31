package pl.sda.tables;

public class TablesMethod {

    public void showContent (String... table) {
        for (String i : table) {
            System.out.println(i);
        }

        for (int i=0; i < table.length; i++) {
            System.out.println(table[i]);
        }
    }

    public int sumTable (int... table) {
        int result = 0;
        for (int i=0; i<table.length; i++) {
            result = result + (table[i]);
        }
        return result;
    }

    public int[] createTable (int count) {
        int[] table = new int[count];
        int x = 2;
        for (int i = 0; i < table.length; i++) {
            table[i] = x;
            x = x+2;
        }
        return table;
    }

    public float[] doubleTable (float ... table) {
        float[] table2 = new float[table.length];
        for (int i = 0; i < table.length; i++){
            table2[i] = table[i] * 2;
        }
        return table2;
    }

    public void showFirstAndOthers (double[] table) {
        double x;
        double y;
        double z;
        double middle;
    }
}
