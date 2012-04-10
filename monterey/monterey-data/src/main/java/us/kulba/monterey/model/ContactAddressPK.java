package us.kulba.monterey.model;

import us.kulba.monterey.common.constants.AddressType;

import javax.persistence.*;

/**
 * Model object that represents a the ContactAddress compound key.
 *
 * @author James Kulba, jjkulba@yahoo.com
 */
@Embeddable
public class ContactAddressPK extends BaseObject {

    @Basic(optional = false)
    @Column(name = "ADDRESS_ID")
    private long addressId;
    @Basic(optional = false)
    @Column(name = "CONTACT_ID")
    private long contactId;
    @Basic(optional = false)
    @Column(name = "ADDRESS_TYPE")
    @Enumerated(EnumType.STRING)
    private AddressType addressType;

    public ContactAddressPK() {}

    public ContactAddressPK(long contactId, long addressId, AddressType addressType) {
        this.contactId = contactId;
        this.addressId = addressId;
        this.setAddressType(addressType);
    }

    public long getContactId() {
        return contactId;
    }

    public void setContactId(long contactId) {
        this.contactId = contactId;
    }

    public long getAddressId() {
        return addressId;
    }

    public void setAddressId(long addressId) {
        this.addressId = addressId;
    }

    public AddressType getAddressType() {
        return addressType;
    }

    public void setAddressType(AddressType addressType) {
        this.addressType = addressType;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) contactId;
        hash += (int) addressId;
        hash += (getAddressType() != null ? getAddressType().hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof ContactAddressPK)) {
            return false;
        }
        ContactAddressPK other = (ContactAddressPK) object;
        if (this.contactId != other.contactId) {
            return false;
        }
        if (this.addressId != other.addressId) {
            return false;
        }
        if ((this.getAddressType() == null && other.getAddressType() != null) || (this.getAddressType() != null && !this.getAddressType().equals(other.getAddressType()))) {
            return false;
        }
        return true;
    }

}
