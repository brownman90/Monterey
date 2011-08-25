package us.kulba.monterey.web.converter;


import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.map.DeserializationConfig;
import org.codehaus.jackson.map.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import us.kulba.monterey.model.Contact;

/**
 * Convenience class to convert JSON to Contact model object.
 *
 * @author James Kulba, jjkulba@yahoo.com
 */
public class ContactJsonConverter {

    static final Logger log = LoggerFactory.getLogger(ContactJsonConverter.class);

    public static Contact convertToContact(String json) {

        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(DeserializationConfig.Feature.FAIL_ON_UNKNOWN_PROPERTIES, false);

        try {
            JsonNode rootNode = mapper.readValue(json, JsonNode.class);
            JsonNode dataNode = rootNode.path("data");

            if (dataNode == null) {
                throw new RuntimeException("Unable to find Contact data!");
            }

            if (dataNode.isObject()) {
                return mapper.readValue(dataNode.toString(), Contact.class);

            } else {
                log.error(dataNode.toString());
                throw new RuntimeException("Data found was not an object suitable for conversion!");
            }

        } catch (Exception e) {
            log.error("Exception ", e.getMessage());
            e.printStackTrace();
            return null;
        }
    }
}
