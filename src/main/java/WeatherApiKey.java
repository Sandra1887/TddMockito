import java.io.FileInputStream;
import java.util.Properties;

public class WeatherApiKey {
    Properties prop;

    public WeatherApiKey(String file) {
        prop = new Properties();
        String userHome = System.getProperty("user.home");
        try {
            FileInputStream input = new FileInputStream(userHome + "/Documents/API-keys/" + file + ".txt");
            prop.load(input);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    public String getApiKey() {
        return prop.getProperty("apiKey");
    }
}
