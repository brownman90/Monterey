package us.kulba.monterey.dao.jpa;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import us.kulba.monterey.model.List;

/**
 * Junit test exercises Contact CRUD actions.
 *
 * @author James Kulba, jjkulba@yahoo.com
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:us/kulba/monterey/monterey-jpa.xml")
@Transactional
public class ListRepositoryTest {
    final Logger logger = LoggerFactory.getLogger(ListRepositoryTest.class);

    @Autowired
    private ListRepository listRepository;

    @Test
    public void sayHello() {
        logger.info("Hello Joe");
    }

    @Test
    public void save() {
        List list = new List();
        list.setName("Family");
        list.setActive(true);
        listRepository.save(list);

        logger.info(list.toString());
    }


}
