/**
 * The GreatestCommonDivisor class contains a method to find the greatest common divisor (GCD)
 * of two given numbers.
 *
 * The method `getGreatestCommonDivisor` takes two numbers as input and returns their GCD
 * if both numbers are greater than or equal to 10. If either number is less than 10, it returns -1.
 */
public class GreatestCommonDivisor {

    /**
     * Calculates the greatest common divisor (GCD) of two numbers.
     * The GCD is the largest positive integer that divides both numbers without leaving a remainder.
     *
     * @param first The first number.
     * @param second The second number.
     * @return The GCD of the two numbers if both are greater than or equal to 10, or -1 if either is less than 10.
     */
    public static int getGreatestCommonDivisor(int first, int second) {

        // Check if either of the numbers is less than 10
        if (first < 10 || second < 10) {
            return -1; // Return -1 if either number is less than 10
        }

        // Iterate from the smaller number down to 1
        for (int i = Math.min(first, second); i >= 1; i--) {
            // Check if both numbers are divisible by i
            if (first % i == 0 && second % i == 0) {
                return i; // Return the first common divisor found (which is the greatest)
            }
        }

        return -1; // Return -1 if no common divisor is found (shouldn't happen unless inputs are invalid)
    }

    /**
     * Main method to test the getGreatestCommonDivisor method.
     * It calls the getGreatestCommonDivisor method with various test cases and prints the results.
     *
     * @param args The command-line arguments (not used in this implementation).
     */
    public static void main(String[] args) {

        // Test cases for the getGreatestCommonDivisor method
        System.out.println("GCD of 12 and 30: " + getGreatestCommonDivisor(12, 30)); // Expected: 6
        System.out.println("GCD of 100 and 250: " + getGreatestCommonDivisor(100, 250)); // Expected: 50
        System.out.println("GCD of 9 and 18: " + getGreatestCommonDivisor(9, 18)); // Expected: -1 (9 is less than 10)
        System.out.println("GCD of 15 and 45: " + getGreatestCommonDivisor(15, 45)); // Expected: 15
        System.out.println("GCD of 7 and 1: " + getGreatestCommonDivisor(7, 1)); // Expected: -1 (1 is less than 10)
    }
}

