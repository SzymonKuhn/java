package pl.sda.timeTasks;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class TimeTasks {
    public static void main(String[] args) {
        LocalDate actualDate = LocalDate.now();
        LocalDate birthday = LocalDate.of(1984, 8, 3);
        System.out.println(actualDate);
        System.out.println(birthday);
        String actualDateAsString = actualDate.format(DateTimeFormatter.ofPattern("d MMMM yyyy EEE"));
        String birthdayAsString = birthday.format(DateTimeFormatter.ofPattern("d MMMM yyyy EEE"));
        System.out.println(actualDateAsString);
        System.out.println(birthdayAsString);
        System.out.println(actualDate.getDayOfWeek());
        System.out.println(birthday.getDayOfWeek());
        System.out.println(birthday);
//        ZoneId zoneTokio = new ZoneId.



    }
}
