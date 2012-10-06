package us.kulba.monterey.dao.jpa;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import us.kulba.monterey.model.Address;
import us.kulba.monterey.model.Contact;
import us.kulba.monterey.model.ContactAddress;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


/**
 * Junit test exercises Contact CRUD actions.
 *
 * @author James Kulba, jjkulba@yahoo.com
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:us/kulba/monterey/monterey-jpa.xml")
@Transactional
public class ContactAddressTest {
    final Logger logger = LoggerFactory.getLogger(ContactAddressTest.class);

    @Autowired
    private AddressRepository addressRepository;
    @Autowired
    private ContactRepository contactRepository;

    @Test
    public void sayHello() {
        logger.info("Hello Joe");
    }

    @Test
    public void saveContactAddress() {
        Contact contact = new Contact();
        contact.setFirstName("James");
        contact.setLastName("Kulba");

        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy h:m:s");

        Date birthDate = null;
        try {
            birthDate = sdf.parse("12/06/1967 06:00:00");
        } catch (ParseException ex) {
            logger.error("Error parsing birthdate.", ex);
        }
        contact.setDateOfBirth(birthDate);

        contact = contactRepository.save(contact);
        logger.info(contact.toString());

        Address address = new Address();
        address.setActive(true);
        address.setAddressCity("Los Angeles");
        address.setAddressLine1("120 E Main Street");
        address.setAddressLine2("Suite 500");
        address.setAddressState("CA");
        address.setZipCode("92001");
        address = addressRepository.save(address);

        logger.info(address.toString());





    }


}
