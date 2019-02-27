public class MyPointTest {

    public static void main(String[] args) {
        double x1;
        double y1;
        double x2;
        double y2;
        String name1;
        String name2;

        System.out.println("Wpisz nazwę pierwszego punktu: ");
        name1 = TypeIn.getString();
        System.out.println("Wpisz pierwszą współrzędną punktu " + name1 + ": ");
        x1 = TypeIn.getDouble();
        System.out.println("Wpisz drugą współrzędną punktu " + name1 + ": ");
        y1 = TypeIn.getDouble();
        System.out.println("Wpisz nazwę drugiego punktu: ");
        name2 = TypeIn.getString();
        System.out.println("Wpisz pierwszą współrzędną punkt " + name2 + ": ");
        x2 = TypeIn.getDouble();
        System.out.println("Wpisz drugą współrzędną punktu " + name2 + ": ");
        y2 = TypeIn.getDouble();

        MyPoint point1 = new MyPoint(x1, y1, name1);
        MyPoint point2 = new MyPoint(x2, y2, name2);

        MyPoint.ShowDistance(point1.getA(), point1.getB(), point1.getName());
        MyPoint.ShowDistance(point2.getA(), point2.getB(), point2.getName());

    }
}
