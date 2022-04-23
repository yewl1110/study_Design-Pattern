package weather;

import observer.Observer;
import subject.Subject;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Subject {
    static WeatherStation weatherStation;
    public static WeatherStation getInstance() {
        if(weatherStation == null) {
            weatherStation = new WeatherStation();
        }
        return weatherStation;
    }
    private WeatherStation() {
        observers = new ArrayList<>();
    }

    private List<Observer> observers;
    WeatherData weatherData;

    public void measurementsChange(WeatherData weatherData) {
        this.weatherData = weatherData;
        notifyObserver();
    }

    public WeatherData getWeatherData() {
        return weatherData;
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        if(weatherData != null) {
            for(Observer o : observers) {
//                o.updatePush(this.weatherData);
                o.updatePull();
            }
        }
    }
}
