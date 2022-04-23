package display;

import observer.Observer;
import weather.WeatherData;

public class CurrentConditionsDisplay implements Display, Observer {
    WeatherData weatherData;

    @Override
    public void display() {
        System.out.println("==================");
        System.out.println(String.format("현재기온: %.0f", weatherData.getTemperature()));
        System.out.println(String.format("현재습도: %.2f", weatherData.getHumidity()));
        System.out.println(String.format("현재기압: %.3f", weatherData.getPressure()));
        System.out.println("==================");
    }

    @Override
    public void update(Object o) {
        weatherData = (WeatherData) o;
        display();
    }
}
