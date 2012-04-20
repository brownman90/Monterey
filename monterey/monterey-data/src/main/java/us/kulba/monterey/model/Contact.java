package us.kulba.monterey.model;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.map.annotate.JsonDeserialize;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.hibernate.validator.constraints.Length;
import org.springframework.data.jpa.domain.AbstractPersistable;
import us.kulba.monterey.model.serializer.DateIsoDeSerializer;
import us.kulba.monterey.model.serializer.DateIsoSerializer;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Calendar;
import java.util.Date;

/**
 * Model object that represents a contact.
 *
 * @author James Kulba, jjkulba@yahoo.com
 */
@Entity
@Table(name = "CONTACT")
public class Contact extends AbstractPersistable<Long> {

    private static final long serialVersionUID = 1L;

    @NotNull
    @Length(max = 50)
    @Column(name = "FIRST_NAME")
    private String firstName;

    @NotNull
    @Length(max = 50)
    @Column(name = "LAST_NAME")
    private String lastName;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DATE_OF_BIRTH")
    private Date dateOfBirth;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DATE_ENTERED")
    private Date dateEntered;

    @Version
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DATE_UPDATED")
    private Date dateUpdated;

    public Contact() {
        Calendar calendar = Calendar.getInstance();
        this.setDateEntered(calendar.getTime());
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

    @JsonSerialize(using= DateIsoSerializer.class)
    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    @JsonDeserialize(using=DateIsoDeSerializer.class)
    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @JsonSerialize(using= DateIsoSerializer.class)
    public Date getDateEntered() {
        return dateEntered;
    }

    @JsonDeserialize(using=DateIsoDeSerializer.class)
    public void setDateEntered(Date dateEntered) {
        this.dateEntered = dateEntered;
    }

    @JsonSerialize(using= DateIsoSerializer.class)
    public Date getDateUpdated() {
        return dateUpdated;
    }

    @JsonDeserialize(using=DateIsoDeSerializer.class)
    public void setDateUpdated(Date dateUpdated) {
        this.dateUpdated = dateUpdated;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this,
                ToStringStyle.MULTI_LINE_STYLE);
    }

}
