/**
 * Java program to test {@link StaticMember} class.
 *
 * @author solcanm
 * @version 1.0
 * @since 2019-08-04
 */
public class StaticTest {

    public static void main(String[] args) {

        // get the values of static member without create an object
        System.out.println("Value of x is: " + StaticMember.getIntValue());
        System.out.println("Value of STRING constant is: " + StaticMember.getStringValue());

        // fields declared as static use a single piece of memory, regardless how many objects of that class are created
        int initialValue = StaticMember.getIntValue();
        StaticMember.incrementIntValue();
        int finalValue = StaticMember.getIntValue();
        System.out.println("Initial vs Final Value of static member: " + initialValue + " vs " + finalValue);
    }
}
