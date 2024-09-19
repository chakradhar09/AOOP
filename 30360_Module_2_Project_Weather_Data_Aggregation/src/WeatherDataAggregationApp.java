import WeatherDataAggreagation.WeatherAggregator;
import WeatherDataAggreagation.WeatherData;
import WeatherDataAggreagation.WeatherDataParse;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class WeatherDataAggregationApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("File Path: ");
        String filePath = input.next();
        List<WeatherData> weatherData = WeatherDataParse.parseDate(filePath);
        WeatherAggregator weatherAggregator = new WeatherAggregator();

        Map<LocalDate, Double> averageTemperature = weatherAggregator.calculateAverageTemperature(weatherData);
        Map<LocalDate, Double> totalPrecipitation = weatherAggregator.calculateTotalPrecipitation(weatherData);

        System.out.println("Average Temperature: ");
        averageTemperature.forEach((date, temperature) -> System.out.println(date + ": " + temperature));

        System.out.println("\nTotal Precipitation: ");
        totalPrecipitation.forEach((date, precipitation) -> System.out.println(date + ": " + precipitation));
    }
}
