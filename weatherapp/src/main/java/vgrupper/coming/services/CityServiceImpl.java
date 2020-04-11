package vgrupper.coming.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vgrupper.coming.models.City;
import vgrupper.coming.repositories.CityRepository;

/**
 * City service implement.
 */
@Service
public class CityServiceImpl implements CityService {

    @Autowired
    private CityRepository cityRepository;

    @Autowired
    public void setCityRepository(CityRepository cityRepository) {
        this.cityRepository = cityRepository;
    }

    @Override
    public Iterable<City> listAllCities() {
        return cityRepository.findAll();
    }

    @Override
    public City getCityByCityName(String name) {
        return cityRepository.findByCityName(name);
    }

    @Override
    public City saveCity(City city) {
        return cityRepository.save(city);
    }

    @Override
    public void deleteCity(String name) {
        cityRepository.delete(name);
    }

}
