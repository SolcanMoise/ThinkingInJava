/**
 * The this keyword.
 *
 * @author solcanm
 * @version 1.0
 * @since 2019-08-17
 */
class Banana {

    void peel(int i) {
        System.out.println("Call peel() for " + this + " with arg: " + i);
    }
}

public class BananaPeel {

    public static void main(String[] args) {
        Banana a = new Banana(),
                b = new Banana();

        /*
        There's a secret first argument passed to the method peel(), and that argument is the reference to
        the object that's being manipulated.
         */
        a.peel(1);
        b.peel(2);
    }
}
