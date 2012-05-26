package us.kulba.monterey.dao.jpa;

import org.springframework.data.repository.CrudRepository;
import us.kulba.monterey.model.Address;

/**
 * Repository Interface for Contact data.
 * @author James Kulba, jjkulba@yahoo.com
 */
public interface AddressRepository extends CrudRepository<Address, Long> {
}
