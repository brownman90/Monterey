package us.kulba.monterey.common.constants;

/**
 * Enum that describes the allowed phone types.
 *
 * @author James Kulba, jjkulba@yahoo.com
 */
public enum PhoneType {
    HOME("Home") {

        @Override
        public String getDescription() {
            return "Home phone type";
        }

        @Override
        public boolean display() {
            return true;
        }
    },
    MOBILE("Mobile") {

        @Override
        public String getDescription() {
            return "Mobile phone type";
        }

        @Override
        public boolean display() {
            return true;
        }
    },
    WORK("Work") {

        @Override
        public String getDescription() {
            return "Work phone type";
        }
        @Override
        public boolean display() {
            return true;
        }
    };
    private final String strValue;

    private PhoneType(final String strValue) {
        this.strValue = strValue;
    }

    public String getDescription() {
        return "";
    }

    public boolean display() {
        return false;
    }

    @Override
    public String toString() {
        return this.strValue;
    }
}
