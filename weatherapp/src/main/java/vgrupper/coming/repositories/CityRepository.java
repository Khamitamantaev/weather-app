package vgrupper.coming.repositories;


import org.springframework.data.repository.CrudRepository;
import vgrupper.coming.models.City;

public interface CityRepository extends CrudRepository<City, Integer> {

    City findOne(Integer id);

    void delete(Integer id);
}
