package us.kulba.monterey.dao.jpa;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

/**
 * Junit test exercises Contact Group CRUD actions.
 *
 * @author James Kulba, jjkulba@yahoo.com
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:us/kulba/monterey/monterey-jpa.xml")
@Transactional
public class ContactGroupRepositoryTest {
    final Logger logger = LoggerFactory.getLogger(ContactGroupRepositoryTest.class);

    @Test
    public void sayHello() {
        logger.info("Hello Joe");
    }

}
