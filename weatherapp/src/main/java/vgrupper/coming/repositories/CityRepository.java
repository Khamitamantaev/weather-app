package vgrupper.coming.repositories;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import vgrupper.coming.models.City;

@Repository
public interface CityRepository extends CrudRepository<City, Integer> {

    City findByCityName(String name);

    void delete(String name);
}
