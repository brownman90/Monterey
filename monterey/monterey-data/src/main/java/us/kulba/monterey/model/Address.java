package us.kulba.monterey.model;

import javax.persistence.*;
import java.util.Calendar;
import java.util.Date;

/**
 * Model object that represents an Address.
 *
 * @author James Kulba, jjkulba@yahoo.com
 */
@Entity
@Table(name = "ADDRESS")
public class Address extends BaseObject {
    @Id
    @Column(name = "ADDRESS_ID")
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "AddressTable")
    @TableGenerator(name = "AddressTable", table = "ID_GEN",
            pkColumnName = "ID_NAME", valueColumnName = "ID_VAL", allocationSize = 5)
    private Long addressId;
    @Column(name = "ADDRESS_LINE1")
    private String addressLine1;
    @Column(name = "ADDRESS_LINE2")
    private String addressLine2;
    @Column(name = "ADDRESS_CITY")
    private String addressCity;
    @Column(name = "ADDRESS_STATE")
    private String addressState;
    @Column(name = "ZIP_CODE")
    private String zipCode;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DATE_ENTERED")
    private Date dateEntered;

    @Version
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DATE_UPDATED")
    private Date dateUpdated;

    public Address() {
        Calendar calendar = Calendar.getInstance();
        this.setDateEntered(calendar.getTime());
    }

    public Long getAddressId() {
        return addressId;
    }

    public void setAddressId(Long addressId) {
        this.addressId = addressId;
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    public String getAddressCity() {
        return addressCity;
    }

    public void setAddressCity(String addressCity) {
        this.addressCity = addressCity;
    }

    public String getAddressState() {
        return addressState;
    }

    public void setAddressState(String addressState) {
        this.addressState = addressState;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public Date getDateEntered() {
        return dateEntered;
    }

    public void setDateEntered(Date dateEntered) {
        this.dateEntered = dateEntered;
    }

    public Date getDateUpdated() {
        return dateUpdated;
    }

    public void setDateUpdated(Date dateUpdated) {
        this.dateUpdated = dateUpdated;
    }
}
