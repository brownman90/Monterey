package us.kulba.monterey.dao.jpa;

import org.springframework.data.repository.CrudRepository;

import us.kulba.monterey.model.InputComponent;

/**
 * Repository for InputComponent data.
 *
 * @author James Kulba, jjkulba@yahoo.com
 */
public interface InputComponentRepository extends CrudRepository<InputComponent, Long> {
}
