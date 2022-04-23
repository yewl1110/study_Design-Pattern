import display.CurrentConditionsDisplay;
import display.ForecastDisplay;
import display.StatisticsDisplay;
import weather.WeatherData;
import weather.WeatherStation;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        WeatherStation weatherStation = WeatherStation.getInstance();

        /* subject -> observer push */
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay();
        ForecastDisplay forecastDisplay = new ForecastDisplay();
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay();

        /* subject -- observer pull */
         currentConditionsDisplay = new CurrentConditionsDisplay(weatherStation);
         forecastDisplay = new ForecastDisplay(weatherStation);
         statisticsDisplay = new StatisticsDisplay(weatherStation);

        weatherStation.registerObserver(currentConditionsDisplay);
        weatherStation.registerObserver(forecastDisplay);
        weatherStation.registerObserver(statisticsDisplay);

        try {
            while(true) {
                System.out.println("#####################");
                Thread.sleep(5000);
                weatherStation.measurementsChange(measureWeather());
            }
        } catch (Exception e) {

        }
    }

    static WeatherData measureWeather() {
        Random random = new Random();
        float temperature = random.nextFloat() * 100 % 40;
        float humidity = random.nextFloat() * 100;
        float pressure = 1F + ((float)random.nextDouble() / 10F);
        return new WeatherData(temperature, humidity, pressure);
    }
}