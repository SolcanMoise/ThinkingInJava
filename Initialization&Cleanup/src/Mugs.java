/**
 * Java provides a similar syntax, called instance initialization, for initializing non-static
 * variables for each object.
 *
 * @author solcanm
 * @version 1.0
 * @since 2019-08-27
 */
public class Mugs {

    Mug mug1;
    Mug mug2;

    {
        mug1 = new Mug(1);
        mug2 = new Mug(2);
        System.out.println("Mug1 and Mug2 initialized");
    }

    public Mugs() {
        System.out.println("Mugs()");
    }

    Mugs(int i) {
        System.out.println("Mugs(int)");
    }

    public static void main(String[] args) {

        System.out.println("Inside main()");

        new Mugs();
        System.out.println("new Mucks() complete");

        new Mugs(1);
    }


}

class Mug {
    Mug(int marker) {
        System.out.println("Mug(" + marker + ")");
    }

    void f1(int marker) {
        System.out.println("f1(" + marker + ")");
    }
}
