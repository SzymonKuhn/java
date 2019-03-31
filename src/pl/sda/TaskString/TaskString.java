package pl.sda.TaskString;

import java.lang.String;

public class TaskString {

    static void showNoBlankLowerCase(String a) {
        a = a.trim();
        a.toLowerCase();
        System.out.println(a);
    }

//    static boolean compareFirstLetter(String a, String b) {
//        a = a.trim();
//        b = b.trim();
//        return a.charAt(0).equals(b.charAt(0));
//    }

    static boolean compareThreeLastChar(String a, String b) {
        a = a.trim();
        b = b.trim();
        int aLength = a.length();
        int bLength = b.length();
        String lastThreeOfA = a.substring((aLength - 3), (aLength));
        String lastThreeOfB = b.substring((bLength - 3), (bLength));
        return lastThreeOfA.equals(lastThreeOfB);
    }

    public static void main(String[] args) {
        String s = "w szczebrzeszynie chrząszcz brzmi w trzcinie!";
        System.out.println(s.length());

        System.out.println(s.substring(1, 31));

        System.out.println(s.substring(10));

        System.out.println("" + s.charAt(10) + s.charAt(15));

        System.out.println(s.compareTo("w"));

        System.out.println(s.charAt(12));

        System.out.println(s.toUpperCase());

        System.out.println(s);

        String t = "Simon says: ";
        System.out.println(t);
        String t1 = new StringBuilder(t).append(" clap your hands").toString();
        System.out.println(t1);

        showNoBlankLowerCase("      raz dwa osiem   TUTJA SĄ WIELKIE LITERY      ");

//        System.out.println(compareFirstLetter("ale mam kota", "   ala ma kota"));

        System.out.println(compareThreeLastChar("lkakjfjjewofipppp   ", "afaeofijaf pppp"));


    }
}
