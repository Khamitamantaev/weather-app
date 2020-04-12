package vgrupper.coming.repository;

import org.springframework.data.repository.CrudRepository;
import vgrupper.coming.entity.City;

public interface CityRepository extends CrudRepository<City,Long> {

    City findByCityName(String name);

    @Override
    Iterable<City> findAll();
}
