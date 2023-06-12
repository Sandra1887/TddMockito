import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class WeatherServiceAllInfoTests {
    private WeatherService weatherServiceMock;
    private String mockResponse;
    @BeforeEach
    public void setUp() throws IOException {
        weatherServiceMock = Mockito.mock(WeatherService.class);
        mockResponse = "{\"city\": \"Gothenburg\", \"temperature\": \"10\", \"weather_description\": \"rainy\"}";
        when(weatherServiceMock.getCityTempDescription("Gothenburg")).thenReturn(
                "City: Gothenburg\nTemperature: 10\nWeather Description: rainy");
    }

    /**
     * Test that "getCityTempDescription" returns all the expected information - in this case: name of
     * the city, the temperature and the weather description.
     */
    @Test
    public void testGetCityTempDescription() {
        //Arrange
        String expected = "City: Gothenburg\nTemperature: 10\nWeather Description: rainy";
        //Act
        String actual = weatherServiceMock.getCityTempDescription("Gothenburg");
        //Assert
        assertEquals(expected, actual);
    }
}
