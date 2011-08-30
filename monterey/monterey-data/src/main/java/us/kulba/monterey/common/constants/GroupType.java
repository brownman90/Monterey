package us.kulba.monterey.common.constants;

/**
 * Enum that describes the allowed group types.
 *
 * @author James Kulba, jjkulba@yahoo.com
 */
public enum GroupType {
    FAMILY("Family") {

        @Override
        public String getDescription() {
            return "Family group type";
        }

        @Override
        public boolean display() {
            return true;
        }
    },
    FRIENDS("Friends") {

        @Override
        public String getDescription() {
            return "Friends group type";
        }

        @Override
        public boolean display() {
            return true;
        }
    },
    COLLEAGUE("Colleague") {

        @Override
        public String getDescription() {
            return "Colleague group type";
        }
        @Override
        public boolean display() {
            return true;
        }
    };
    private final String strValue;

    private GroupType(final String strValue) {
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
