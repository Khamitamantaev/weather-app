package vgrupper.coming.service;


import java.util.Map;

public interface WeatherService {


    Map<String, Object> openweathermap(String lat, String longi);

    Map<String, Object> weatherbit(String lat, String longi);

    Map<String, Object> accuweather(String lat, String longi);
}
