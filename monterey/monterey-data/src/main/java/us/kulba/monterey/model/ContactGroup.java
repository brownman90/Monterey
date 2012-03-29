package us.kulba.monterey.model;

import org.hibernate.validator.constraints.Length;
import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 * Model object that represents a group.
 *
 * @author James Kulba, jjkulba@yahoo.com
 */
@Entity
@Table(name = "CONTACT_GROUP")
public class ContactGroup extends AbstractPersistable<Long> {

	private static final long serialVersionUID = 1L;

	@NotNull
	@Length(max = 30)
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}