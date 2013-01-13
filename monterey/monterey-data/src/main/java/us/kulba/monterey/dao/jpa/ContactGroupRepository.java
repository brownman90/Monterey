package us.kulba.monterey.dao.jpa;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import us.kulba.monterey.model.Contact;
import us.kulba.monterey.model.ContactGroup;

import java.util.List;

/**
 * Repository Interface for Contact ContactGroup data.
 *
 * @author James Kulba, jjkulba@yahoo.com
 */
public interface ContactGroupRepository extends CrudRepository<ContactGroup, Long> {

    @Query("select g from ContactGroup g where g.isActive = ?")
    List<ContactGroup> findByIsActive(boolean  isActive);

}
