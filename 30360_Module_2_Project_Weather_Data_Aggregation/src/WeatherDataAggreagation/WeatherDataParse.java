package WeatherDataAggreagation;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class WeatherDataParse {
    public static List<WeatherData> parseDate(String filePath) {
        List<WeatherData> weatherData = new ArrayList<>();

        try(BufferedReader reader = new BufferedReader(new FileReader(filePath))){
            String line;

            while((line = reader.readLine()) != null){
                String[] data = line.split(",");
                LocalDate localDate = LocalDate.parse(data[0]);
                double temperature = Double.parseDouble(data[1]);
                double humidity = Double.parseDouble(data[2]);
                double precipitation = Double.parseDouble(data[3]);
                weatherData.add(new WeatherData(localDate, temperature, humidity, precipitation));
            }
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
        return weatherData;
    }
}
