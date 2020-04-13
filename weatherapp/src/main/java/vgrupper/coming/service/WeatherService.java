package vgrupper.coming.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import vgrupper.coming.entity.City;
import vgrupper.coming.entity.Main;
import vgrupper.coming.entity.Weather;
import vgrupper.coming.repository.CityRepository;

//@Service
public class WeatherService {

    @Autowired
    private CityRepository cityRepository;



    public City saveCity(City city) {

        Main main = new Main();
        Weather weather = new Weather();
        weather.setMain(main);
        weather.setCity(city);
        city.setWeather(weather);

        //сюда надо записать логику по API чтобы создать city с привязанными
        return cityRepository.save(city);
    }


    public ResponseEntity<City> findByCityName(String name) {
        City city = cityRepository.findByName(name);
        return new ResponseEntity<>(city, HttpStatus.OK);
    }
}
//    String apiKey = "11036907f2957aadaad2ba384c675d32";
//    //api.openweathermap.org/data/2.5/weather?q={city name}&appid={your api key}
//    String url = "https://api.openweathermap.org/data/2.5/weather?q=" + "Moscow" +"&APPID=" +apiKey+"";
//    //сюда надо записать логику по API чтобы создать city с привязанными
//    RestTemplate restTemplate = new RestTemplate();
//    ResponseEntity<City> response = restTemplate
//            .getForEntity(url, City.class);
//
//
//    Weather weather = new Weather();
//    Main main = new Main();
//
//    double temperatura = response.getBody().getWeather().getMain().getTemp();
//
//        main.setTemp(temperatura);
//                weather.setMain(main);
//                city.setWeather(weather);
//                cityRepository.save(city);