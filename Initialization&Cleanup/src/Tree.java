import static java.lang.System.out;

/**
 * Demonstration of both constructor and ordinary method overloading.
 *
 * @author solcanm
 * @version 1.0
 * @since 2019-08-17
 */
class Tree {

    private int height;

    Tree() {
        out.println("Planting a seedling");
        height = 0;
    }

    /**
     * Constructor overloading
     */
    Tree(int initialHeight) {
        this.height = initialHeight;
        out.println("Creating a new Tree that is " + height + " feet tall");
    }

    void info() {
        out.println("Tree is " + height + " feet tall");
    }

    /**
     * Method overloading
     */
    void info(String s) {
        out.println(s + " Tree is " + height + " feet tall");
    }
}

class Overloading {

    public static void main(String[] args) {
        Tree q = new Tree();
        q.info();
        q.info("Q");

        Tree w = new Tree(10);
        w.info();
        w.info("W");
    }
}
