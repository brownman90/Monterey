package us.kulba.monterey.common.constants;

/**
 * Enum that describes the allowed contact types.
 *
 * @author James Kulba, jjkulba@yahoo.com
 */
public enum ContactType {
    HOME("Home") {

        @Override
        public String getDescription() {
            return "Home address type";
        }

        @Override
        public boolean display() {
            return true;
        }
    },
    SCHOOL("School") {

        @Override
        public String getDescription() {
            return "School address type";
        }

        @Override
        public boolean display() {
            return true;
        }
    },
    WORK("Work") {

        @Override
        public String getDescription() {
            return "Work address type";
        }
        @Override
        public boolean display() {
            return true;
        }
    };
    private final String strValue;

    private ContactType(final String strValue) {
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
