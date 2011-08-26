package us.kulba.monterey.web.controller;

import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.map.DeserializationConfig;
import org.codehaus.jackson.map.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import sun.org.mozilla.javascript.internal.ContextAction;
import us.kulba.monterey.model.Contact;
import us.kulba.monterey.service.ContactManager;

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
    ModelMap updateContactHandler(ModelMap model, @PathVariable Long contactId, @RequestBody String json) {
        log.debug("Hit Update Contact controller handler method.");

        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(DeserializationConfig.Feature.FAIL_ON_UNKNOWN_PROPERTIES, false);

        try {
            JsonNode rootNode = mapper.readValue(json, JsonNode.class);
            JsonNode dataNode = rootNode.path("Contact");
            if (dataNode.isObject()) {
                Contact contact = mapper.readValue(dataNode.toString(), Contact.class);

                log.debug(contact.toString());

                contact = contactManager.updateContact(contact);

                log.debug(contact.toString());

                model.addAttribute("contact", contact);
                model.addAttribute("success", true);
            } else {
                log.error("Expected data format was not found.");
                model.addAttribute("success", false);
                model.addAttribute("message", "Expected data format was not found.");
            }
        } catch (Exception e) {
            log.error("Error occurred while consuming JSON request from client.", e);
            model.addAttribute("success", false);
            model.addAttribute("message", "Error occurred while consuming JSON request from client.\n" + e.getMessage());
        }

        return model;
    }

}
