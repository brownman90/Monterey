package us.kulba.monterey.model;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import java.util.Calendar;

/**
 * HomeEmail email type.
 *
 * @author James Kulba, jjkulba@yahoo.com
 */
@Entity
@DiscriminatorValue("HOME")
public class HomeEmail extends Email {

    @Column(name = "CONTACT_ID")
    private Long contactId;

    @Column(name = "PREFERRED")
    private boolean preferred;

    public HomeEmail() {
        Calendar calendar = Calendar.getInstance();
        this.setDateEntered(calendar.getTime());
    }

    public Long getContactId() {
        return contactId;
    }

    public void setContactId(Long contactId) {
        this.contactId = contactId;
    }

    public boolean isPreferred() {
        return preferred;
    }

    public void setPreferred(boolean preferred) {
        this.preferred = preferred;
    }
}
