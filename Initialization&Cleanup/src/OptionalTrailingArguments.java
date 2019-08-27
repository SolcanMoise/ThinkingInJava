/**
 * @author solcanm
 * @version 1.0
 * @since 2019-08-27
 */
public class OptionalTrailingArguments {

    static void f(int required, String... trailing) {

        System.out.println("Required " + required);
        for (String str : trailing) {
            System.out.println("Optional: " + str);
        }
    }

    public static void main(String[] args) {
        f(1, "a", "b", "c");
    }
}
