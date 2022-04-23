package display;

import observer.Observer;
import weather.WeatherData;
import weather.WeatherStation;

public class CurrentConditionsDisplay implements Display, Observer {
    private WeatherData weatherData;
    private WeatherStation weatherStation;

    public CurrentConditionsDisplay() {}
    public CurrentConditionsDisplay(WeatherStation weatherStation) {
        this.weatherStation = weatherStation;
    }

    @Override
    public void display() {
        System.out.println("==================");
        System.out.println(String.format("현재기온: %.0f", weatherData.getTemperature()));
        System.out.println(String.format("현재습도: %.2f", weatherData.getHumidity()));
        System.out.println(String.format("현재기압: %.3f", weatherData.getPressure()));
        System.out.println("==================");
    }

    @Override
    public void updatePush(Object o) {
        weatherData = (WeatherData) o;
        display();
    }

    @Override
    public void updatePull() {
        weatherData = weatherStation.getWeatherData();
        display();
    }
}
