package us.kulba.monterey.model;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.codehaus.jackson.annotate.JsonIgnore;

import javax.persistence.*;

/**
 * BaseObject used to define basic methods used by all model objects.
 *
 * @author James Kulba, jjkulba@yahoo.com
 */
@MappedSuperclass
public class BaseObject implements Serializable {

    private static final long serialVersionUID = 1L;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DATE_ENTERED")
    private Date dateEntered;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DATE_UPDATED")
    private Date dateUpdated;

    @PrePersist
    protected void onPersist() {
        Calendar calendar = Calendar.getInstance();
        this.setDateEntered(calendar.getTime());
    }

    @PreUpdate
    protected void onUpdate() {
        Calendar calendar = Calendar.getInstance();
        this.setDateUpdated(calendar.getTime());
    }

    public Date getDateEntered() {
        return dateEntered;
    }

    @JsonIgnore
    public void setDateEntered(Date dateEntered) {
        this.dateEntered = dateEntered;
    }

    public Date getDateUpdated() {
        return dateUpdated;
    }

    @JsonIgnore
    public void setDateUpdated(Date dateUpdated) {
        this.dateUpdated = dateUpdated;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this,
                ToStringStyle.MULTI_LINE_STYLE);
    }

}
