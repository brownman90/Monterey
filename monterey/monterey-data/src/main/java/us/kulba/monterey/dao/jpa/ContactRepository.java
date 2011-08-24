package us.kulba.monterey.dao.jpa;


import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import us.kulba.monterey.model.Contact;

import java.util.List;

/**
 * Repository Interface for Contact data.
 * @author James Kulba, jjkulba@yahoo.com
 */
public interface ContactRepository extends CrudRepository<Contact, Long> {

    @Query("select c from Contact c where c.firstName = ?")
    List<Contact> findByFirstName(String firstName);

}
