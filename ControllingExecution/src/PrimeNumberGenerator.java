/**
 * This is a Java program to generate prime numbers less than a given number
 *
 * @author solcanm
 * @version 1.0
 * @since 2019-08-04
 */
public class PrimeNumberGenerator {

    public static void main(String[] args) {
        GeneratePrime generatePrime = new GeneratePrime();
        generatePrime.generate(100);
    }

}

class GeneratePrime {

    private Integer[] numbers;

    /**
     * Start the program
     * @param n the prime numbers to be generated
     */
    private void start(int n) {
        for (int i = 0; i < n; i++) {
            if(isPrimeNumber(i))
                System.out.println(i + " ");
        }
    }

    /**
     * Verify if {@param number} is prime
     * @param value the given number
     * @return true, if the number is prime, false otherwise
     */
    private boolean isPrimeNumber(int value) {
        for (int i = 2; i < value; i++) {
            if (value % i == 0)
                return false;
        }
        return true;
    }


    void generate(int number) {
        start(number);
    }
}

