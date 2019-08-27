import static java.lang.System.*;

/**
 * Using array to create variable argument list.
 *
 * @author solcanm
 * @version 1.0
 * @since 2019-08-27
 */
public class VarArgs {

    static void printArray(Object[] arg) {
        for (Object x : arg) {
            out.print(x + " ");
        }
        out.println();
    }

    public static void main(String[] args) {
        printArray(new Object[]{47, 2.3, "asd"});
        printArray(new Object[]{new A(), new A()});
    }
}

class A {
}
