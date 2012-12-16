package us.kulba.monterey.dao.jpa;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;
import us.kulba.monterey.model.Email;
import us.kulba.monterey.model.HomeEmail;

/**
 * Junit test exercises Contact CRUD actions.
 *
 * @author James Kulba, jjkulba@yahoo.com
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:us/kulba/monterey/monterey-jpa.xml", "classpath:monterey-datasource-test.xml"})
@Transactional
public class EmailRepositoryTest {
    final Logger logger = LoggerFactory.getLogger(EmailRepositoryTest.class);

    @Autowired
    EmailRepository emailRepository;

    Email email;

    @Test
    public void sayHello() {
        logger.info("Hello Joe");
    }

    @Test
    public void saveEmail() {
        HomeEmail email = new HomeEmail();
        email.setEmailAddress("jjkulba@yahoo.com");
        email.setContactId(1L);
        email.setPreferred(true);

        emailRepository.save(email);

        logger.debug(email.toString());
    }
}
