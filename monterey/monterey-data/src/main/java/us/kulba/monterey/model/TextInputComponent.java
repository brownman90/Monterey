package us.kulba.monterey.model;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("textfield")
public class TextInputComponent extends InputComponent {

    @Column(name = "ALLOW_BLANK")
    private boolean allowBlank;

}
