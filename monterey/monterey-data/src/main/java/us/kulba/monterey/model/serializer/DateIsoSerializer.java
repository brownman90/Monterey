package us.kulba.monterey.model.serializer;

import org.codehaus.jackson.JsonGenerator;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.map.JsonSerializer;
import org.codehaus.jackson.map.SerializerProvider;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.ISODateTimeFormat;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.Date;

@Component
public class DateIsoSerializer extends JsonSerializer<Date> {

    private static final DateTimeFormatter dateFormatter = ISODateTimeFormat.dateTime();
    @Override
    public void serialize(Date date, JsonGenerator jsonGenerator, SerializerProvider provider)
            throws IOException, JsonProcessingException {

        String formattedDate = new DateTime(date).toString(dateFormatter);;

        jsonGenerator.writeString(formattedDate);
    }
}
