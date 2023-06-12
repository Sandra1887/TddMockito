import org.json.JSONObject;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

/**
 * This class contains the different methods and is a bit more developed due to personallu be able to
 * visualise the tests.
 */
public class WeatherService {
    WeatherKeyReader wAK;

    public String getWeatherByCity(String city) throws IOException {
        String encodedQuery = URLEncoder.encode(city, "UTF-8");
        String apiUrl = "https://api.weatherstack.com/current?access_key=" + wAK.getApiKey() + "&query=" +
                encodedQuery;
        URL url = new URL(apiUrl);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");

        int responseCode = connection.getResponseCode();
        if (responseCode == HttpURLConnection.HTTP_OK) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String line;
            StringBuilder response = new StringBuilder();
            while ((line = reader.readLine()) != null) {
                response.append(line);
            }
            reader.close();
            return response.toString();
        } else {
            throw new IOException("Error: Could not find that city " + responseCode);
        }
    }
    public String getTemperatureByCity(String jsonCity) {
        try {
            JSONObject jsonString = new JSONObject(jsonCity);
            int temperature = jsonString.getInt("temperature");
            return "Temperature: " + temperature;
        } catch (Exception e) {
            System.out.println("Error:" + e.getMessage());
        }
        return null;
    }
    public String getWeatherDescription(String jsonCity) {
        try {
            JSONObject jsonString = new JSONObject(jsonCity);
            String weatherDescription = jsonString.getString("weather_description");
            return "Weather Description: " + weatherDescription;
        } catch (Exception e) {
            System.out.println("Error:" + e.getMessage());
        }
        return null;
    }
    public String getCityTempDescription(String jsonCity) {
        try {
            JSONObject jsonString = new JSONObject(jsonCity);
            String city = jsonString.getString("name");
            int temperature = jsonString.getInt("temperature");
            String weatherDescription = jsonString.getString("weather_description");
            return "City: " + city + "\nTemperature: " + temperature + "\nWeather Description: " + weatherDescription;
        } catch (Exception e) {
            System.out.println("Error:" + e.getMessage());
        }
        return null;
    }
    public String getWeatherByWeatherCode(String weatherCode) throws IOException {
        //Exempelkod endast
        String encodedQuery = URLEncoder.encode(weatherCode, "UTF-8");
        String apiUrl = "https://api.weatherstack.com/current?access_key=" + wAK.getApiKey() + "&query=" +
                encodedQuery;
        URL url = new URL(apiUrl);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");

        int responseCode = connection.getResponseCode();
        if (responseCode == HttpURLConnection.HTTP_OK) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String line;
            StringBuilder response = new StringBuilder();
            while ((line = reader.readLine()) != null) {
                response.append(line);
            }
            reader.close();
            return response.toString();
        } else {
            throw new IOException("Error: " + responseCode);
        }
    }
}
