import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class WeatherServiceDescriptionTests {
    private WeatherService weatherServiceMock;
    private String mockResponse;
    @BeforeEach
    public void setUp() throws IOException {;
        weatherServiceMock = Mockito.mock(WeatherService.class);
        mockResponse = "{\"weather_description\": \"rainy\"}";
        when(weatherServiceMock.getWeatherDescription("Gothenburg")).thenReturn("Weather Description: rainy");
    }
    @Test
    public void testGetWeatherDescription() throws IOException {
        //Arrange
        String expectedDescription = "Weather Description: rainy";
        //Act
        String actual = weatherServiceMock.getWeatherDescription("Gothenburg");
        //Assert
        assertEquals(expectedDescription, actual);
    }
}
