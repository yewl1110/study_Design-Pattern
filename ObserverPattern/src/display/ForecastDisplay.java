package display;

import observer.Observer;
import weather.WeatherData;
import weather.WeatherStation;

public class ForecastDisplay implements Display, Observer {
    private WeatherData weatherData;
    private WeatherStation weatherStation;

    public ForecastDisplay() {}
    public ForecastDisplay(WeatherStation weatherStation) {
        this.weatherStation = weatherStation;
    }

    @Override
    public void display() {
        System.out.println("==================");
        if(weatherData.getTemperature() < 10F) {
            System.out.println("춥다");
        }
        if(10F <= weatherData.getTemperature() && weatherData.getTemperature() < 25F) {
            System.out.println("시원하다");
        }
        if(25F <= weatherData.getTemperature()) {
            System.out.println("덥다");
        }
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
