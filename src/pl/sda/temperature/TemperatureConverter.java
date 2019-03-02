package pl.sda.temperature;

public class TemperatureConverter {

        static double getFahrenheit(double a) {
            double b;
            b = 32 + (9 * a / 5);
            return b;
        }

        static double getCelsjus(double a) {
            double b;
            b = (5 * (a-32))/9;
            return b;
        }
}
