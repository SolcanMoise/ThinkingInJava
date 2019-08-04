/**
 * Java program to demonstrate aliasing during method calls.
 *
 * @author solcanm
 * @version 1.0
 * @since 2019-08-04
 */
public class PassObject {

    /**
     * Objects are passed by reference
     *
     * @param letter the object that will be modified
     */
    private static void pass(Letter letter) {
        letter.c = 'Z';
    }

    public static void main(String[] args) {
        Letter letterA = new Letter();
        letterA.c = 'A';
        System.out.println("Initial letterA.c = " + letterA.c);
        pass(letterA);
        System.out.println("Final letterA.c = " + letterA.c);
    }
}

class Letter {
    char c;
}
