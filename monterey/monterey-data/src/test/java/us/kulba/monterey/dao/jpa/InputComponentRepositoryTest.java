package us.kulba.monterey.dao.jpa;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;
import us.kulba.monterey.model.TextInputComponent;

/**
 * Junit test exercises Contact CRUD actions.
 *
 * @author James Kulba, jjkulba@yahoo.com
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:us/kulba/monterey/monterey-jpa.xml")
@Transactional
public class InputComponentRepositoryTest {
    final Logger logger = LoggerFactory.getLogger(InputComponentRepositoryTest.class);

    @Autowired
    InputComponentRepository inputComponentRepository;

    @Test
    public void sayHello() {
        logger.info("Hello Joe");
    }

    @Test
    public void saveInputComponet() {

        TextInputComponent inputComponent = new TextInputComponent();

        inputComponent.setName("firstName");
        inputComponent.setFieldLabel("Yuck");
        inputComponent.setDisplayLabel(false);

        inputComponentRepository.save(inputComponent);

        logger.debug(inputComponent.toString());

    }


}
