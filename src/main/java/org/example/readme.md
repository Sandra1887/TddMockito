# TDD & Mock
by Sandra Jeppsson Kristansson w.23 - 2023

## Modules:
+ org.junit.jupiter:junit-jupiter:5.9.0
+ org.mockito:mockito-core:5.3.1
+ org.json:json:20230227

## Classes:
+ WeatherKeyReader 
    + WeatherKeyReader(String fileName)
    + getApiKey()
  

+ WeatherService
  + getWeatherByCity(String city)
  + getTemperatureByCity(String jsonCity)
  + getWeatherDescription(String jsonCity)
  + getCityTempDescription(String jsonCity)
  + getWeatherByWeatherCode(String weatherCode)


+ WeatherServiceNameTests
  + testGetWeatherByCity() - assertEqual
  + testGetWeatherByCityFail() - assertEqual


+ WeatherServiceTempTests
  + testGetTemperatureNotNull() - assertNotNull
  + testGetTemperatureNull() - assertNull


+ WeatherServiceDescriptionTests
  + testGetWeatherDescription() - assertEqual


+ WeatherServiceAllInfoTests
  + testGetCityTempDescription() - assertEqual


+ WeatherServiceCodeTests
  + testGetWeatherByWeatherCode() - assertEqual
  + testGetWeatherByWeatherCodeSame() - assertSame
  + testGetWeatherByWeatherCodeBoolean() - assertTrue & assertFalse


***JAVA***


***MIT***
