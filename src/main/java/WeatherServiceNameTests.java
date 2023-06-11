import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class WeatherServiceNameTests {
    private WeatherService weatherServiceMock;
    private String mockResponse;
    @BeforeEach
    public void setUp() throws IOException {
        weatherServiceMock = Mockito.mock(WeatherService.class);
        mockResponse = "{\"temperature\": 10, \"weather_description\": \"rainy\"}";
        when(weatherServiceMock.getWeatherByCity("Gothenburg")).thenReturn("{\"temperature\": 10, \"weather_description\": \"rainy\"}");
    }
    @Test
    public void testGetWeatherByCity() {

    }
}
