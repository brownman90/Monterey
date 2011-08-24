package us.kulba.monterey.dao.jpa;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;
import us.kulba.monterey.common.constants.ContactType;
import us.kulba.monterey.model.Contact;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Junit test exercises Contact CRUD actions.
 *
 * @author James Kulba, jjkulba@yahoo.com
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:monterey-jpa.xml")
@Transactional
public class ContactRepositoryTest {
    final Logger logger = LoggerFactory.getLogger(ContactRepositoryTest.class);

    @Autowired
    ContactRepository contactRepository;

    Contact contact;

    @Test
    public void sayHello() {
        logger.info("Hello Joe");
    }

    @Test
    public void saveContact() {
        contact = new Contact();
        contact.setFirstName("James");
        contact.setLastName("Kulba");
        contact.setContactType(ContactType.HOME);

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

        List<Contact> contacts = contactRepository.findByFirstName("James");

        for (Contact contact : contacts) {
            logger.info(contact.toString());
        }

    }

}
