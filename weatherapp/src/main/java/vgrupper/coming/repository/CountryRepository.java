package vgrupper.coming.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import vgrupper.coming.entity.Country;

@Repository
public interface CountryRepository extends CrudRepository<Country, Long> {

}
