package pl.sda;

public class CubeTest {

    public static void main(String[] args) {

        TypeIn typeIn = new TypeIn();
        System.out.println("Podaj pierwszy wymiar bryły: ");
        int a = typeIn.getInt();
        System.out.println("Podaj drugi wymiar bryły: ");
        int b = typeIn.getInt();
        System.out.println("Podaj trzeci wymiar bryły: ");
        int c = typeIn.getInt();


        Cube cube = new Cube(a, b, c);
        System.out.println("Kubatura to: " + cube.Volume());

        TypeIn typeIn1 = new TypeIn();
        System.out.println("Podaj pierwszy wymiar bryły: ");
        int d = typeIn1.getInt();
        System.out.println("Podaj drugi wymiar bryły: ");
        int e = typeIn1.getInt();
        System.out.println("Podaj trzeci wymiar bryły: ");
        int f = typeIn1.getInt();


        Cube cube1 = new Cube(d, e, f);
        System.out.println("Kubatura to: " + cube1.Volume());

    }
}
