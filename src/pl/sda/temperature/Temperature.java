package pl.sda.temperature;

public class Temperature {

    private String date;
    private String hour;
    private double temperature;

    public Temperature(String date, String hour, double temperature) {
        this.date = date;
        this.hour = hour;
        this.temperature = temperature;
    }

    public String getDate() {
        return date;
    }

    public String getHour() {
        return hour;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setHour(String hour) {
        this.hour = hour;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public void show() {
        System.out.println("W dniu " + date + " o godzinie " + hour + " temperatura wynosiła " + temperature + " stopni Celsjusza.");
    }

    public void showInFahrenheit() {
        temperature = TemperatureConverter.getFahrenheit(temperature);
        System.out.println("W dniu " + date + " o godzinie " + hour + " temperatura wynosiła " + temperature + " stopni Fahrenheita.");
    }

}


