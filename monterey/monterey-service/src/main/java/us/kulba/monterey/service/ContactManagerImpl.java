package us.kulba.monterey.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import us.kulba.monterey.dao.jpa.ContactGroupRepository;
import us.kulba.monterey.dao.jpa.ContactRepository;
import us.kulba.monterey.model.Contact;
import us.kulba.monterey.model.ContactGroup;

import java.util.Calendar;
import java.util.List;

@Service
@Transactional(readOnly = true)
public class ContactManagerImpl implements ContactManager{
    static final Logger log = LoggerFactory.getLogger(ContactManagerImpl.class);

    @Autowired
    ContactRepository contactRepository;
    @Autowired
    ContactGroupRepository contactGroupRepository;

    @Override
    public Contact getContact(Long contactId) {
        return contactRepository.findOne(contactId);
    }

    @Override
    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
    public Contact updateContact(Contact contact) {
        Contact _contact = contactRepository.findOne(contact.getId());
        contact.setDateEntered(_contact.getDateEntered());
        Calendar calendar = Calendar.getInstance();
        contact.setDateUpdated(calendar.getTime());
        return contactRepository.save(contact);
    }

    @Override
    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
    public Contact createContact(Contact contact) {
        return contactRepository.save(contact);
    }

    @Override
    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
    public void removeContact(Long contactId) {
        contactRepository.delete(contactId);
    }

    @Override
    public List<ContactGroup> findActiveContactGroups() {
        return contactGroupRepository.findByIsActive(true);
    }
}
