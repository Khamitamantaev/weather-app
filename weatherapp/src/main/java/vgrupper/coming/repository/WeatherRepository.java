package vgrupper.coming.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import vgrupper.coming.entity.WeatherEntity;

@Repository
public interface WeatherRepository extends CrudRepository<WeatherEntity,Long> {
}
