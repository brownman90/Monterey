package us.kulba.monterey.service;

import us.kulba.monterey.model.Contact;

public interface ContactManager {

    public Contact getContact(Long contactId);
    public Contact updateContact(Contact contact);
    public Contact createContact(Contact contact);
    public void removeContact(Long contactId);

}
