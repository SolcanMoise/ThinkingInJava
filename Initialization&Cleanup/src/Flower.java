/**
 * The this keyword.
 * When you write several constructors for a class, there are times when you'd like to call
 * one constructor from another to avoid duplicate code. You can make such a call by
 * using the this keyword.
 *
 * @author solcanm
 * @version 1.0
 * @since 2019-08-17
 */
public class Flower {

    private int petalCount = 0;
    private String name = "initial value";

    private Flower(int petals) {
        petalCount = petals;
    }

    private Flower(String shortName) {
        name = shortName;
    }

    private Flower(String name, int petals) {
        this(petals);
        // this(name); !can't call twice
        this.name = name;
    }

    private Flower() {
        this("Rose", 11);
    }

    @Override
    public String toString() {
        return "Flower{" + "petalCount=" + petalCount +
                ", name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Flower rose = new Flower(); // call default constructor
        System.out.println(rose);

        Flower tulip = new Flower("tulip");
        System.out.println(tulip);
    }
}
