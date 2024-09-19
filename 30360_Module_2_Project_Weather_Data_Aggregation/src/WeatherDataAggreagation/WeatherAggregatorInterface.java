package WeatherDataAggreagation;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

public interface WeatherAggregatorInterface {
    Map<LocalDate, Double> calculateAverageTemperature(List<WeatherData> weatherData);
    Map<LocalDate, Double> calculateTotalPrecipitation(List<WeatherData> weatherData);
}
