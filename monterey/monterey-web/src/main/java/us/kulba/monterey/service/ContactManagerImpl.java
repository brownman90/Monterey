package us.kulba.monterey.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import us.kulba.monterey.model.Contact;

@Service
public class ContactManagerImpl implements ContactManager{
    static final Logger log = LoggerFactory.getLogger(ContactManagerImpl.class);

    @Override
    public Contact getContact(Long contactId) {

        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Contact updateContact(Contact contact) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Contact createContact(Contact contact) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void removeContact(Long contactId) {
        //To change body of implemented methods use File | Settings | File Templates.
    }
}
