import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

public class WeatherServiceTempTests {
    private WeatherService weatherServiceMock;
    private String mockResponse;
    @BeforeEach
    public void setUp() throws IOException {;
        weatherServiceMock = Mockito.mock(WeatherService.class);
        mockResponse = "{\"temperature\": \"10\"}";
        when(weatherServiceMock.getTemperatureByCity("Gothenburg")).thenReturn("Temperature: 10");
    }

    @Test
    public void testGetTemperatureNotNull() throws IOException {
        //Arrange
        String expectedTemperature = "Temperature: 10";
        //Act
        String actual = weatherServiceMock.getTemperatureByCity("Gothenburg");
        //Assert
        assertNotNull(expectedTemperature, actual);
    }
    @Test
    public void testGetTemperatureNull() throws IOException {
        //Arrange
        String expectedTemperature = null;
        //Act
        String actual = weatherServiceMock.getTemperatureByCity("Stockholm");
        //Assert
        assertNull(expectedTemperature, actual);
    }
}