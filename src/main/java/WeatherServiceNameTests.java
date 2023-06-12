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
        when(weatherServiceMock.getWeatherByCity("Gothenburg")).thenReturn(
                "Temperature: 10\nWeather Description: rainy");
    }

    /**
     * Test that "Gothenburg" returns the same String as the "expected".
     * @throws IOException
     */
    @Test
    public void testGetWeatherByCity() throws IOException {
        //Arrange
        String expected = "Temperature: 10\nWeather Description: rainy";
        //Act
        String actual = weatherServiceMock.getWeatherByCity("Gothenburg");
        //Assert
        assertEquals(expected, actual);
    }
    @Test
    public void testGetWeatherByCityFail() throws IOException {
        //Arrange
        String expected = "Temperature: 10\nWeather Description: rainy";
        //Act
        String actual = weatherServiceMock.getWeatherByCity("Hittepåstad");
        //Assert
        assertEquals(expected, actual);
    }
}
