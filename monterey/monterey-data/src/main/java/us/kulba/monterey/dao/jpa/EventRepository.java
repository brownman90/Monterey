package us.kulba.monterey.dao.jpa;

import org.springframework.data.repository.CrudRepository;
import us.kulba.monterey.model.Event;

/**
 * Repository Interface for Event data.
 * @author James Kulba, jjkulba@yahoo.com
 */
public interface EventRepository extends CrudRepository<Event, Long> {}
