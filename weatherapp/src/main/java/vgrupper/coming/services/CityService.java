package vgrupper.coming.services;


import vgrupper.coming.models.City;

public interface CityService {

    Iterable<City> listAllCities();


    City getCityByCityName(String name);

    City saveCity(City city);

    void deleteCity(String name);

}
