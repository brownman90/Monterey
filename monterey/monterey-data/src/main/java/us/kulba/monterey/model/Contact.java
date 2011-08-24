package us.kulba.monterey.model;

import org.hibernate.validator.constraints.Length;
import us.kulba.monterey.common.constants.ContactType;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * Model object that represents a contact.
 *
 * @author James Kulba, jjkulba@yahoo.com
 */
@Entity
@Table(name = "CONTACT")
public class Contact extends BaseObject {

    @Id
    @Column(name = "CONTACT_ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull
    @Length(max = 50)
    @Column(name = "FIRST_NAME")
    private String firstName;

    @NotNull
    @Length(max = 50)
    @Column(name = "LAST_NAME")
    private String lastName;

    @Column(name = "CONTACT_TYPE")
    private ContactType contactType;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DATE_OF_BIRTH")
    private Date dateOfBirth;

    public Long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public ContactType getContactType() {
        return contactType;
    }

    public void setContactType(ContactType contactType) {
        this.contactType = contactType;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}
