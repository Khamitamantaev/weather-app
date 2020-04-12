package vgrupper.coming.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import vgrupper.coming.entity.City;
import vgrupper.coming.repository.CityRepository;

@Service
public class WeatherService {

    @Autowired
    private CityRepository cityRepository;



    public City saveCity(City city) {

        //сюда надо записать логику по API чтобы создать city с привязанными
        return cityRepository.save(city);
    }


    public ResponseEntity<City> findByCityName(String name) {
        City city = cityRepository.findByCityName(name);
        return new ResponseEntity<>(city, HttpStatus.OK);
    }
}
