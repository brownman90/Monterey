package us.kulba.monterey.model;

import org.codehaus.jackson.map.annotate.JsonDeserialize;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.springframework.data.jpa.domain.AbstractPersistable;
import us.kulba.monterey.model.serializer.DateIsoDeSerializer;
import us.kulba.monterey.model.serializer.DateIsoSerializer;

import javax.persistence.*;
import java.util.Calendar;
import java.util.Date;

@Entity
@Table(name = "EMAIL")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="EMAIL_TYPE", discriminatorType=DiscriminatorType.STRING)
public abstract class Email extends AbstractPersistable<Long> {

    @Column(name = "EMAIL_ADDRESS", nullable = false)
    private String emailAddress;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DATE_ENTERED")
    private Date dateEntered;

    @Version
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DATE_UPDATED")
    private Date dateUpdated;

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
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
}
