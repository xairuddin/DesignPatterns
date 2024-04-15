package observer;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);

        weatherData.setMeasurementsChanged(80,60, 100);
        weatherData.setMeasurementsChanged(515,82, 48);
        weatherData.setMeasurementsChanged(48,35, 95);
    }
}
