package vgrupper.coming.controller;


import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import vgrupper.coming.entity.City;
import vgrupper.coming.entity.Weather;
import vgrupper.coming.service.WeatherService;

@RestController
@RequestMapping("/api/weather")
public class WeatherApiController {

    private final WeatherService weatherService;

    public WeatherApiController(WeatherService weatherService) {
        this.weatherService = weatherService;
    }

    @RequestMapping("/now/{country}/{city}")
    public Weather getWeather(@PathVariable String country,
                              @PathVariable String city) {
        return this.weatherService.getWeather(country, city);
    }
