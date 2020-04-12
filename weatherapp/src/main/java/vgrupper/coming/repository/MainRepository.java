package vgrupper.coming.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import vgrupper.coming.entity.Main;

@Repository
public interface MainRepository  extends CrudRepository<Main,Long> {
}
