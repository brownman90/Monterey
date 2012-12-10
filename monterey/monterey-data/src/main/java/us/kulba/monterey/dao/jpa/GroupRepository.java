package us.kulba.monterey.dao.jpa;

import org.springframework.data.repository.CrudRepository;
import us.kulba.monterey.model.Group;

/**
 * Repository Interface for Contact Group data.
 *
 * @author James Kulba, jjkulba@yahoo.com
 */
public interface GroupRepository extends CrudRepository<Group, Long> {}
