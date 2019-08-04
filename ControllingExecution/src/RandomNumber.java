import java.util.Random;

/**
 * This Java program is used to generate random numbers.
 *
 * @author solcanm
 * @version 1.0
 * @since 2019-08-04
 */
public class RandomNumber {

    private Random random;

    /**
     * Create a new object of type Random
     */
    public void initializeRandom() {
        random = new Random();
    }

    /**
     * Get the next double random number
     *
     * @return the generated number
     */
    public double getNextRandNumb() {
        return random.nextDouble();
    }

    /**
     * Compare two double numbers {@param actual} and a new random double number
     *
     * @param actual the actual double number
     * @return {String} equal, greater or less
     */
    public String compareWithTheNextGenOne(double actual) {
        double randNum = random.nextDouble();
        if (actual > randNum) {
            return "greater";
        } else if (actual == randNum) {
            return "equals";
        } else {
            return "less";
        }
    }
}

