/**
 * Guaranteed initialization with the constructor.
 *
 * @author solcanm
 * @version 1.0
 * @since 2019-08-17
 */
public class Rock {

    Rock(int i) {
        System.out.println("Rock " + i);
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Rock(i);
        }
    }
}

