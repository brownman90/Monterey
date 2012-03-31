package us.kulba.monterey.dao.jpa;

import org.springframework.data.repository.CrudRepository;
import us.kulba.monterey.model.ContactGroup;

/**
 * Repository Interface for ContactGroup data.
 * @author James Kulba, jjkulba@yahoo.com
 */
public interface ContactGroupRepository extends CrudRepository<ContactGroup, Long> {}
