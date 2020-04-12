package vgrupper.coming.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import vgrupper.coming.entity.City;
import vgrupper.coming.repository.CityRepository;
import vgrupper.coming.service.WeatherService;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/weather")
public class WeatherApiController {

    @Autowired
    private WeatherService weatherService;

    @PostMapping("")
    public ResponseEntity<?>  createNewCity(@RequestBody City city) {

//        City city1 = weatherService.saveCity(city);

        return new ResponseEntity<City>( city, HttpStatus.CREATED);

    }

    @GetMapping("/city/{name}")
    public ResponseEntity<City> getCityName(@PathVariable String name){
        ResponseEntity<City> cityResponseEntity = weatherService.findByCityName(name);
        return cityResponseEntity;
    }

//    @PostMapping("/city")
//    public City create(@RequestBody Map<String, String> body){
//        String title = body.get("title");
//        String content = body.get("content");
//        return blogRespository.save(new Blog(title, content));
//    }


}
