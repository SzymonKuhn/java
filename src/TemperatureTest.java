public class TemperatureTest {


    public static void main(String[] args) {

        Temperature temperature = new Temperature("2018-02-25", "17:28", -11);
        Temperature temperature1 = new Temperature("2019-01-15", "15:22", -8);

        System.out.println(temperature);
        System.out.println(temperature1);

        temperature.show();
        temperature1.show();

        temperature.showInFahrenheit();
        temperature1.showInFahrenheit();

    }





}
