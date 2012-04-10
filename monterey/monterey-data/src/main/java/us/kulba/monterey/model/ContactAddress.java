package us.kulba.monterey.model;

import us.kulba.monterey.common.constants.AddressType;

import javax.persistence.*;

/**
 * Model object that represents the intersection between contact and address.
 *
 * @author James Kulba, jjkulba@yahoo.com
 */
@Entity
@Table(name = "CONTACT_ADDRESS")
public class ContactAddress extends BaseObject {

    @EmbeddedId
    private ContactAddressPK contactAddressPK;

    @JoinColumn(name = "ADDRESS_ID", referencedColumnName = "ADDRESS_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Address address;

    @JoinColumn(name = "CONTACT_ID", referencedColumnName = "CONTACT_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Contact contact;

    public ContactAddress() {}

    public ContactAddress(ContactAddressPK contactAddressPK) {
        this.contactAddressPK = contactAddressPK;
    }

    public ContactAddress(long contactId, long addressId, AddressType addressType) {
        this.contactAddressPK = new ContactAddressPK(contactId, addressId, addressType);
    }

    public ContactAddressPK getContactAddressPK() {
        return contactAddressPK;
    }

    public void setContactAddressPK(ContactAddressPK contactAddressPK) {
        this.contactAddressPK = contactAddressPK;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }
}
