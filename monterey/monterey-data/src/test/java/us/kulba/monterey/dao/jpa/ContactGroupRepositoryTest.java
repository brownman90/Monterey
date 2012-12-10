package us.kulba.monterey.dao.jpa;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import us.kulba.monterey.model.ContactGroup;

/**
 * Junit test exercises Contact ContactGroup CRUD actions.
 *
 * @author James Kulba, jjkulba@yahoo.com
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:us/kulba/monterey/monterey-jpa.xml")
@Transactional
public class ContactGroupRepositoryTest {
    final Logger logger = LoggerFactory.getLogger(ContactGroupRepositoryTest.class);

    @Autowired
    ContactGroupRepository contactGroupRepository;

    @Test
    public void sayHello() {
        logger.info("Hello Joe");
    }

    @Test
    public void saveContactGroup() {

        ContactGroup contactGroup = new ContactGroup();
        contactGroup.setActive(true);
        contactGroup.setName("Family");
        contactGroupRepository.save(contactGroup);

        logger.info(contactGroup.toString());
    }

}
