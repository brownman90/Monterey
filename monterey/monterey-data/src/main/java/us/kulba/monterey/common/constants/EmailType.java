package us.kulba.monterey.common.constants;

/**
 * Enum that describes the allowed email types.
 *
 * @author James Kulba, jjkulba@yahoo.com
 */
public enum EmailType {
    HOME("Home") {

        @Override
        public String getDescription() {
            return "Home Email";
        }

        @Override
        public boolean display() {
            return true;
        }
    },
    WORK("Work") {

        @Override
        public String getDescription() {
            return "Work Email";
        }
        @Override
        public boolean display() {
            return true;
        }
    };
    private final String strValue;

    private EmailType(final String strValue) {
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
