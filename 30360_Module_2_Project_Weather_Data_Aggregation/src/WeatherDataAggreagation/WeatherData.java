package WeatherDataAggreagation;

import java.time.LocalDate;

public class WeatherData {
    private final LocalDate localDate;
    private final double temperature;
    private final double humidity;
    private final double precipitation;

    public WeatherData(LocalDate localDate, double temperature, double humidity, double precipitation){
        this.localDate = localDate;
        this.temperature = temperature;
        this.humidity = humidity;
        this.precipitation = precipitation;
    }

    public LocalDate getLocalDate(){
        return localDate;
    }
    public double getTemperature(){
        return temperature;
    }
    public double getPrecipitation(){
        return precipitation;
    }

    public String toString(){
        return "Date: " + localDate + '\n' +
                "Temperature: " + temperature + '\n' +
                "Humidity: " + humidity + '\n' +
                "Precipitation: " + precipitation + '\n';
    }
}
