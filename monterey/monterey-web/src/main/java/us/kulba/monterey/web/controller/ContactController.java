package us.kulba.monterey.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.ModelMap;
import us.kulba.monterey.model.Contact;
import us.kulba.monterey.model.ContactGroup;
import us.kulba.monterey.service.ContactManager;

import java.util.List;

/**
 * Restful controller to handle client requests.
 *
 * @author James Kulba, jjkulba@yahoo.com
 */
@Controller
public class ContactController {
    static final Logger log = LoggerFactory.getLogger(ContactController.class);

    @Autowired
    ContactManager contactManager;

    @RequestMapping(value = "contact", method = RequestMethod.POST)
    public
    @ResponseBody
    ModelMap createContactHandler(ModelMap model, @RequestBody Contact contact) {
        log.debug("Hit Create Contact controller handler method.");
        log.debug(contact.toString());
        contact = contactManager.createContact(contact);
        log.debug(contact.toString());
        model.addAttribute("contact", contact);
        model.addAttribute("success", true);

        return model;
    }


    @RequestMapping(value = "contact/{contactId}", method = RequestMethod.GET)
    public
    @ResponseBody
    ModelMap viewContactHandler(ModelMap model, @PathVariable Long contactId) {
        log.debug("Hit View Contact controller handler method.", contactId);

        Contact contact = contactManager.getContact(contactId);

          if (contact != null) {
              model.addAttribute("data", contact);
              model.addAttribute("success", true);
          } else {
              model.addAttribute("success", false);
              model.addAttribute("message", "Contact record not found with id: " + contactId);
              log.warn("Contact record not found with id: " + contactId);
          }

        return model;
    }

    @RequestMapping(value = "contact/{contactId}", method = RequestMethod.PUT)
    public
    @ResponseBody
    ModelMap updateContactHandler(ModelMap model, @PathVariable Long contactId, @RequestBody Contact contact) {
        log.debug("Hit Update Contact controller handler method.");

        contact = contactManager.updateContact(contact);
        log.debug(contact.toString());
        model.addAttribute("contact", contact);
        model.addAttribute("success", true);

        return model;
    }

    @RequestMapping(value = "contact_groups", method = RequestMethod.GET)
    public
    @ResponseBody
    ModelMap viewContactGroupsHandler(ModelMap model) {

        List<ContactGroup> list = contactManager.findActiveContactGroups();

        if (!list.isEmpty()) {
            model.addAttribute("data", list);
            model.addAttribute("success", true);
        } else {
            model.addAttribute("success", false);
            model.addAttribute("message", "No contact groups were found.");
            log.warn("No contact groups were found.");
        }

        return model;
    }


}
