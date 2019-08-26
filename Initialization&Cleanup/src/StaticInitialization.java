/**
 * Specifying initial values in a class definition.
 *
 * @author solcanm
 * @version 1.0
 * @since 2019-08-27
 */
public class StaticInitialization {

    public static void main(String[] args) {

        System.out.println("Create new Cupboard()");
        new Cupboard();

        System.out.println("Create new Cupboard()");
        new Cupboard();

        table.f2(1);
        cupboard.f3(1);
    }

    private static Table table = new Table();
    private static Cupboard cupboard = new Cupboard();
}

class Bowl {

    Bowl(int marker) {
        System.out.println("Bowl(" + marker + ")");
    }

    void f1(int marker) {
        System.out.println("f1(" + marker + ")");
    }
}

class Table {

    private static Bowl bowl2 = new Bowl(1);

    Table() {
        System.out.println("Table()");
        bowl2.f1(1);
    }

    void f2(int marker) {
        System.out.println("f2(" + marker + ")");
    }

    static Bowl bowl1 = new Bowl(2);
}


class Cupboard {

    Bowl bowl3 = new Bowl(3);
    private static Bowl bowl4, bowl5;

    /* explicit static initialization */
    static {
        bowl4 = new Bowl(4);
        bowl5 = new Bowl(5);
    }

    Cupboard() {
        System.out.println("Cupboard()");
        bowl4.f1(2);
    }

    void f3(int marker) {
        System.out.println("f3(" + marker + ")");
    }
}