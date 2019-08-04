/**
 * Java program to demonstrate the assignment operator on objects
 *
 * @author solcanm
 * @version 1.0
 * @since 2019-08-04
 */
public class Assignment {

    public static void main(String[] args) {
        Tank t1 = new Tank(3);
        Tank t2 = new Tank(12);

        System.out.println("T1.level: " + t1.getLevel());
        System.out.println("T2.level: " + t2.getLevel());

        t1 = t2;
        System.out.println("Perform objects assignment: t1 = t2");

        System.out.println("T1.level: " + t1.getLevel());
        System.out.println("T2.level: " + t2.getLevel());
    }
}

class Tank {
    private int level;

    Tank(int level) {
        this.level = level;
    }

    int getLevel() {
        return level;
    }
}
