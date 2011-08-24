package us.kulba.monterey.dao.jpa;


import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import us.kulba.monterey.model.Contact;

import java.util.List;

public interface ContactRepository extends CrudRepository<Contact, Long> {

    /**
     * Crud method used to find Contacts by firstName.
     *
     * @param firstName
     * @return
     */
    @Query("select c from Contact c where c.firstName = ?")
    List<Contact> findByFirstName(String firstName);

}
