package WeatherDataAggreagation;

import java.time.LocalDate;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class WeatherAggregator implements WeatherAggregatorInterface{

    public Map<LocalDate, Double> calculateAverageTemperature(List<WeatherData> weatherData){
        return weatherData.stream()
                .collect(Collectors.groupingBy(WeatherData::getLocalDate,
                        Collectors.averagingDouble(WeatherData::getTemperature)));
    }

    public Map<LocalDate, Double> calculateTotalPrecipitation(List<WeatherData> weatherData){
        return weatherData.stream()
                .collect(Collectors.groupingBy(WeatherData::getLocalDate,
                        Collectors.summingDouble(WeatherData::getPrecipitation)));
    }
}
