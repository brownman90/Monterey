package us.kulba.monterey.model;

import org.hibernate.validator.constraints.Length;
import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * Model object that represents a Event.
 *
 * @author James Kulba, jjkulba@yahoo.com
 */
@Entity
@Table(name = "EVENT")
public class Event extends AbstractPersistable<Long> {

    private static final long serialVersionUID = 1L;

    @NotNull
    @Length(max = 50)
    private String name;

    @NotNull
    private Date eventDate;

    @Length(max = 254)
    private String description;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getEventDate() {
        return eventDate;
    }

    public void setEventDate(Date eventDate) {
        this.eventDate = eventDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
