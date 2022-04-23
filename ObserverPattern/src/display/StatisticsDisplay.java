package display;

import observer.Observer;
import weather.WeatherData;

import java.util.ArrayList;
import java.util.List;

public class StatisticsDisplay implements Display, Observer {
    List<WeatherData> weatherDataList;

    public StatisticsDisplay() {
        weatherDataList = new ArrayList<>();
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
    public void update(Object o) {
        weatherDataList.add((WeatherData) o);
        display();
    }
}
