package us.kulba.monterey.common.constants;

/**
 * Enum that describes the allowed address types.
 *
 * @author James Kulba, jjkulba@yahoo.com
 */
public enum AddressType {
    HOME("Home") {

        @Override
        public String getDescription() {
            return "Home Address";
        }

        @Override
        public boolean display() {
            return true;
        }
    },
    SCHOOL("School") {

        @Override
        public String getDescription() {
            return "School Address";
        }

        @Override
        public boolean display() {
            return true;
        }
    },
    WORK("Work") {

        @Override
        public String getDescription() {
            return "Work Address";
        }
        @Override
        public boolean display() {
            return true;
        }
    };
    private final String strValue;

    private AddressType(final String strValue) {
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
