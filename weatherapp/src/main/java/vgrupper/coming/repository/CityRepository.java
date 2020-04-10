package vgrupper.coming.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import vgrupper.coming.entity.City;

@Repository
public interface CityRepository  extends CrudRepository<City,Long> {

    City findByName(String name);

    @Override
    Iterable<City> findAll();
}
