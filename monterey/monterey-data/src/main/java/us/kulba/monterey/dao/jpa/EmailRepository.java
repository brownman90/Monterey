package us.kulba.monterey.dao.jpa;

import org.springframework.data.repository.CrudRepository;
import us.kulba.monterey.model.Email;

public interface EmailRepository extends CrudRepository<Email, Long> {}
