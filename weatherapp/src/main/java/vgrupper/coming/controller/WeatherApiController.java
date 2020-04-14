package vgrupper.coming.controller;

import org.springframework.web.bind.annotation.*;
import vgrupper.coming.integrations.Weather;
import vgrupper.coming.integrations.WeatherService;

import java.text.ParseException;

@RestController
@RequestMapping("/api/weather")
public class WeatherApiController {


    private final WeatherService weatherService;

    public WeatherApiController(WeatherService weatherService) {
        this.weatherService = weatherService;
    }

//    @PostMapping("")
//    public ResponseEntity<?>  createNewCity(@RequestBody City city) {
//
//       City city1 = weatherService.saveCity(city);
//
//    return new ResponseEntity<City>( city1, HttpStatus.CREATED);
//
//    }

    @RequestMapping("/now/{country}/{city}")
    public Weather getWeather(@PathVariable String country,
                              @PathVariable String city) throws ParseException {
        return this.weatherService.getWeather(country, city);
    }



//    @GetMapping("/city/{name}")
//    public ResponseEntity<City> getCityName(@PathVariable String name){
//        ResponseEntity<City> cityResponseEntity = weatherService.findByCityName(name);
//        return cityResponseEntity;
//    }

//    @PostMapping("/city")
//    public City create(@RequestBody Map<String, String> body){
//        String title = body.get("title");
//        String content = body.get("content");
//        return blogRespository.save(new Blog(title, content));
//    }


}
