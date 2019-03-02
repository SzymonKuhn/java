public class MyPoint {
    private double a;
    private double b;
    private String name;

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public String getName() {
        return name;
    }

    public MyPoint(double a, double b, String name) {
        this.a = a;
        this.b = b;
        this.name = name;
    }

    public void showDistance() {
        double c = (Math.pow(a, 2)) + (Math.pow(b, 2));
        System.out.println("Odległość punktu " + name + " od środka współrzędnych wynosi: " + (Math.sqrt(c)));
    }


}
