package vgrupper.coming.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import vgrupper.coming.entityweather.Weather;
import vgrupper.coming.entityweather.WeatherPrognoz;
import vgrupper.coming.service.WeatherService;

@RestController
@RequestMapping("/api/weather")
public class WeatherController {

    private final WeatherService weatherService;

    public WeatherController(WeatherService weatherService) {
        this.weatherService = weatherService;
    }

    @RequestMapping("/now/{country}/{city}")
    public Weather getWeather(@PathVariable String country,
                              @PathVariable String city) {
        return this.weatherService.getWeather(country, city);
    }

    @RequestMapping("/weekly/{country}/{city}")
    public WeatherPrognoz getWeatherPrognoz(@PathVariable String country,
                                             @PathVariable String city) {
        return this.weatherService.getWeatherPrognoz(country, city);
    }


}
