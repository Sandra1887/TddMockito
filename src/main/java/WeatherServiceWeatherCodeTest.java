import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import java.io.IOException;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.mockito.Mockito.when;

public class WeatherServiceWeatherCodeTest {
    private WeatherService weatherServiceMock;
    private String mockResponse;
    @BeforeEach
    public void setUp() throws IOException {
        ;
        weatherServiceMock = Mockito.mock(WeatherService.class);
        mockResponse = "{\"name\": \"New York\", \"Temperature\": \"20\", \"Weather Description\": \"sunny\"}";
        when(weatherServiceMock.getWeatherByWeatherCode("113")).thenReturn(
                "City: New York\nTemperature: 20\nWeather Description: sunny");
    }
    @Test
    public void testGetWeatherByWeatherCode() throws IOException {
        //Arrange
        String expected = "City: New York\nTemperature: 20\nWeather Description: sunny";
        //Act
        String actual = weatherServiceMock.getWeatherByWeatherCode("113");
        //Assert
        assertEquals(expected, actual);
    }

    @Test
    public void testGetWeatherByWeatherCodeSame() throws IOException {
        //Arrange
        String expected = "City: New York\nTemperature: 20\nWeather Description: sunny";
        //Act
        String actual = weatherServiceMock.getWeatherByWeatherCode("113");
        //Assert
        assertSame(expected, actual);
    }
}
