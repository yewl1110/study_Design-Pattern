package display;

import observer.Observer;
import weather.WeatherData;

public class ForecastDisplay implements Display, Observer {
    WeatherData weatherData;

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
    public void update(Object o) {
        weatherData = (WeatherData) o;
        display();
    }
}
