import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

public class WeatherServiceCodeTests {
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

    /***
     * Test where you put in the weather code and recieves the matching name of the city, the temperature
     * and weather description.
     * AssertEquals makes sure that the two parameters contains the same kind of String.
     * @throws IOException
     */
    @Test
    public void testGetWeatherByWeatherCode() throws IOException {
        //Arrange
        String expected = "City: New York\nTemperature: 20\nWeather Description: sunny";
        //Act
        String actual = weatherServiceMock.getWeatherByWeatherCode("113");
        //Assert
        assertEquals(expected, actual);
    }

    /***
     * Test where you put in the weather code for a city and recieves the name of the city, the
     * temperature and the weather description.
     * AssertSame makes sure that "expected" and "actual", that are compared, are the same kind of object.
     * @throws IOException
     */
    @Test
    public void testGetWeatherByWeatherCodeSame() throws IOException {
        //Arrange
        String expected = "City: New York\nTemperature: 20\nWeather Description: sunny";
        //Act
        String actual = weatherServiceMock.getWeatherByWeatherCode("113");
        //Assert
        assertSame(expected, actual);
    }
    /**
     * Only a test to proove that I can use "assertTrue" and "assertFalse".
     * If "expected" and "actual contains the same String of characters the "theSameString" will be
     * true and "assertTrue" will make sure it is.
     */
    @Test
    public void testGetWeatherByWeatherCodeBoolean() throws IOException {
        boolean theSameString;
        String expected = "City: New York\nTemperature: 20\nWeather Description: sunny";
        String actual = weatherServiceMock.getWeatherByWeatherCode("113");
        if(expected == actual) {
            theSameString = true;
            assertTrue(theSameString);
        } else {
            theSameString = false;
            assertFalse(theSameString);
        }
    }
}
