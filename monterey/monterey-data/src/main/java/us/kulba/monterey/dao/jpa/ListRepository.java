package us.kulba.monterey.dao.jpa;

import org.springframework.data.repository.CrudRepository;
import us.kulba.monterey.model.List;

/**
 * Repository Interface for Event data.
 * @author James Kulba, jjkulba@yahoo.com
 */
public interface ListRepository extends CrudRepository<List, Long> {}
