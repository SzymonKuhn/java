public class MyPointTest {

    public static void main(String[] args) {
        double a;
        double b;
        String name;


//        System.out.println("Wpisz nazwę drugiego punktu: ");
//        name2 = TypeIn.getString();
//        System.out.println("Wpisz pierwszą współrzędną punkt " + name2 + ": ");
//        x2 = TypeIn.getDouble();
//        System.out.println("Wpisz drugą współrzędną punktu " + name2 + ": ");
//        y2 = TypeIn.getDouble();

        MyPointCreator pointCreator = new MyPointCreator();
        name = pointCreator.createNameOfPoint();
        a = pointCreator.createCoordinateOfPoint();
        b = pointCreator.createCoordinateOfPoint();
        MyPoint point1 = new MyPoint(a, b, name);

        name = pointCreator.createNameOfPoint();
        a = pointCreator.createCoordinateOfPoint();
        b = pointCreator.createCoordinateOfPoint();
        MyPoint point2 = new MyPoint(a, b, name);

        point1.showDistance();
        point2.showDistance();
    }
}
