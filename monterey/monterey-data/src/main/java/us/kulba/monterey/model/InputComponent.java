package us.kulba.monterey.model;

import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.*;

/**
 * InputComponent contains the common attributes to a form control.
 *
 * @author James Kulba, jjkulba@yahoo.com
 */
@Entity
@Table(name = "INPUT_COMPONENT")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="XTYPE", discriminatorType=DiscriminatorType.STRING)
public abstract class InputComponent extends AbstractPersistable<Long> {

    @Column(name = "NAME", nullable = false)
    private String name;

    @Column(name = "FIELD_LABEL", nullable = false)
    private String fieldLabel;

    @Column(name = "DISPLAY_LABEL")
    private boolean displayLabel;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFieldLabel() {
        return fieldLabel;
    }

    public void setFieldLabel(String fieldLabel) {
        this.fieldLabel = fieldLabel;
    }

    public boolean isDisplayLabel() {
        return displayLabel;
    }

    public void setDisplayLabel(boolean displayLabel) {
        this.displayLabel = displayLabel;
    }
}
