import java.util.Arrays;
import java.util.Random;

/**
 * @author solcanm
 * @version 1.0
 * @since 2019-11-06
 */
public class ArraysOfPrimitives {

    public static void main(String[] args) {
        int[] a1 = {1, 2, 3, 4, 5};
        int[] a2;
        a2 = a1; // copy by reference
        for (int i = 0; i < a2.length; i++) {
            a2[i] = a2[i] + 1; // this changes affect a1
            System.out.println(a1[i] + " ");
        }
    }
}

/**
 * Creating arrays with new
 */
class ArrayNew {

    public static void main(String[] args) {
        int[] a;
        Random random = new Random();
        a = new int[random.nextInt(20)];
        System.out.println("Length of a is: " + a.length);
        for (int value : a) {
            System.out.println("a[i] = " + value);
        }
    }
}

/**
 * Creating an array of non-primitive objects
 */
class ArrayClassObj {

    public static void main(String[] args) {
        final Random random = new Random();
        Integer[] integers = new Integer[random.nextInt(20)];
        for (int i = 0; i < integers.length; i++) {
            integers[i] = random.nextInt(500); // Autoboxing
        }
        System.out.println(Arrays.toString(integers));
    }
}

class OverloadingVarargs {

    private static void f(Character... characters) {
        for (Character character : characters) {
            System.out.print(character + " ");
        }
    }

    private static void f(Integer... integers) {
        for (Integer integer : integers) {
            System.out.print(integer + " ");
        }
    }

    private static void f(Long... longs) {
        for (Long longValue : longs) {
            System.out.print(longValue + " ");
        }
    }

    public static void main(String[] args) {
        f('a', 'b', 'c');
        f(1, 2, 3);
        f(4L, 5L);
    }
}