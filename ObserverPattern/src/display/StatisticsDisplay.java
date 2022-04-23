package display;

import observer.Observer;
import weather.WeatherData;
import weather.WeatherStation;

import java.util.ArrayList;
import java.util.List;

public class StatisticsDisplay implements Display, Observer {
    private List<WeatherData> weatherDataList;
    private WeatherStation weatherStation;

    public StatisticsDisplay() {
        weatherDataList = new ArrayList<>();
    }
    public StatisticsDisplay(WeatherStation weatherStation) {
        weatherDataList = new ArrayList<>();
        this.weatherStation = weatherStation;
    }

    @Override
    public void display() {
        System.out.println("==================");
        System.out.println(String.format("평균기온: %.0f",weatherDataList.stream().mapToDouble(WeatherData::getTemperature).summaryStatistics().getAverage()));
        System.out.println(String.format("평균습도: %.2f",weatherDataList.stream().mapToDouble(WeatherData::getHumidity).summaryStatistics().getAverage()));
        System.out.println(String.format("평균기압: %.3f",weatherDataList.stream().mapToDouble(WeatherData::getPressure).summaryStatistics().getAverage()));
        System.out.println("==================");
    }

    @Override
    public void updatePush(Object o) {
        weatherDataList.add((WeatherData) o);
        display();
    }

    @Override
    public void updatePull() {
        weatherDataList.add(weatherStation.getWeatherData());
        display();
    }
}
