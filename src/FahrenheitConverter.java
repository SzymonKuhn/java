import java.util.Scanner;

public class FahrenheitConverter {


    static int getFahrenheit(int a) {
        int b;
        b = 32 + (9 * a / 5);
        return b;
    }

    static int getCelsjus(int a) {
        int b;
        b = (5 * (a-32))/9;
        return b;
    }

    static int getTemp() {
        int a;
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        return a;
    }

    public static void main(String[] args) {
        int tempCIn;
        int tempFIn;
        int tempCOut;
        int tempFOut;

        System.out.println("Podaj temperaturę w stopniach Celsjusza:");
        tempCIn = getTemp();

        System.out.println("Podaj temperaturę w stopniach Fahrenheita: ");
        tempFIn = getTemp();

        tempFOut = getFahrenheit(tempCIn);
        tempCOut = getCelsjus(tempFIn);


        System.out.println(tempCIn + " stopni Celsjusza to " + tempFOut + " stopni Fahrenheita.");
        System.out.println(tempFIn + " stopni Fahrenheita to " + tempCOut + " stopni Celsjusza.");
    }
}
