/**
 * Java program used to demonstrate static keyword.
 * When a member is declared static, it means that particular field or method is not tied to any
 * particular object instance of that class.
 *
 * @author solcanm
 * @version 1.0
 * @since 2019-08-04
 */
class StaticMember {

    private double z;

    private static int x = 23;

    // this is a constant
    private static final String STRING = "Static field";

    double getDoubleValue() {
        return z;
    }

    static int getIntValue() {
        return x;
    }

    static String getStringValue() {
        return STRING;
    }

    /**
     * increment the value of x by 1
     */
    static void incrementIntValue() {
        x++;
    }

}
