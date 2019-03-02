package pl.sda.myPoint;

import pl.sda.TypeIn;

public class MyPointCreator {

    private String name;
    private double a;

    public String createNameOfPoint() {
        System.out.println("Wpisz nazwę punktu: ");
        name = TypeIn.getString();
        return name;
    }

    public double createCoordinateOfPoint() {
        System.out.println("Wpisz współrzędną punktu " + name + ": ");
        a = TypeIn.getDouble();
        return a;
    }
}
