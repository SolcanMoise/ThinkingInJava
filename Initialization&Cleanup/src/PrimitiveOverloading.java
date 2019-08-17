import static java.lang.System.out;

/**
 * @author solcanm
 * @version 1.0
 * @since 2019-08-17
 */
public class PrimitiveOverloading {

    private void f1(char x) {
        out.println("f1(char)");
    }

    private void f1(byte x) {
        out.println("f1(byte)");
    }

    private void f1(short x) {
        out.println("f1(short)");
    }

    private void f1(int x) {
        out.println("f1(int)");
    }

    private void f1(long x) {
        out.println("f1(long)");
    }

    private void f1(float x) {
        out.println("f1(float)");
    }

    private void f1(double x) {
        out.println("f1(double)");
    }


    private void f2(byte x) {
        out.println("f2(byte)");
    }

    private void f2(short x) {
        out.println("f2(short)");
    }

    private void f2(int x) {
        out.println("f2(int)");
    }

    private void f2(long x) {
        out.println("f2(long)");
    }

    private void f2(float x) {
        out.println("f2(float)");
    }

    private void f2(double x) {
        out.println("f2(double)");
    }

    private void f3(short x) {
        out.println("f3(short)");
    }

    private void f3(int x) {
        out.println("f3(int)");
    }

    private void f3(long x) {
        out.println("f3(long)");
    }

    private void f3(float x) {
        out.println("f3(float)");
    }

    private void f3(double x) {
        out.println("f3(double)");
    }

    private void f4(int x) {
        out.println("f4(int)");
    }

    private void f4(long x) {
        out.println("f4(long)");
    }

    private void f4(float x) {
        out.println("f4(float)");
    }

    private void f4(double x) {
        out.println("f4(double)");
    }

    private void f5(long x) {
        out.println("f5(long)");
    }

    private void f5(float x) {
        out.println("f5(float)");
    }

    private void f5(double x) {
        out.println("f5(double)");
    }

    private void f6(float x) {
        out.println("f6(float)");
    }

    private void f6(double x) {
        out.println("f6(double)");
    }

    private void f7(double x) {
        out.println("f7(double)");
    }


    /**
     * Test methods.
     */
    private void testConstVal() {
        out.println("5: ");
        f1(5);
        f2(5);
        f3(5);
        f4(5);
        f5(5);
        f6(5);
        f7(5);
        out.println();
    }

    private void testChar() {
        char x = 'x';
        out.println("char: ");
        f1(x);
        f2(x);
        f3(x);
        f4(x);
        f5(x);
        f6(x);
        f7(x);
        out.println();
    }


    private void testByte() {
        byte x = 0;
        out.println("byte: ");
        f1(x);
        f2(x);
        f3(x);
        f4(x);
        f5(x);
        f6(x);
        f7(x);
        out.println();
    }


    private void testShort() {
        short x = 0;
        out.println("short: ");
        f1(x);
        f2(x);
        f3(x);
        f4(x);
        f5(x);
        f6(x);
        f7(x);
        out.println();
    }


    private void testInt() {
        int x = 0;
        out.println("int: ");
        f1(x);
        f2(x);
        f3(x);
        f4(x);
        f5(x);
        f6(x);
        f7(x);
        out.println();
    }


    private void testLong() {
        long x = 0;
        out.println("long: ");
        f1(x);
        f2(x);
        f3(x);
        f4(x);
        f5(x);
        f6(x);
        f7(x);
        out.println();
    }


    private void testFloat() {
        float x = 'x';
        out.println("float: ");
        f1(x);
        f2(x);
        f3(x);
        f4(x);
        f5(x);
        f6(x);
        f7(x);
        out.println();
    }


    private void testDouble() {
        double x = 'x';
        out.println("double: ");
        f1(x);
        f2(x);
        f3(x);
        f4(x);
        f5(x);
        f6(x);
        f7(x);
        out.println();
    }

    public static void main(String[] args) {

        PrimitiveOverloading po = new PrimitiveOverloading();
        po.testConstVal();
        po.testChar();
        po.testByte();
        po.testShort();
        po.testInt();
        po.testLong();
        po.testFloat();
        po.testDouble();
    }
}
