/**
 * The LargestPrime class contains a method to find the largest prime factor of a given number.
 */
public class LargestPrime {

    /**
     * Finds the largest prime factor of a given number.
     *
     * @param number The number whose largest prime factor is to be found.
     * @return The largest prime factor of the number, or -1 if the number is less than or equal to 1.
     */
    public static int getLargestPrime(int number) {
        // Step 1: Validate input
        if (number <= 1) {
            return -1; // Invalid input (no prime factors for numbers <= 1)
        }

        int largestPrime = 0; // Variable to store the largest prime factor

        // Step 2: Loop through all numbers from 2 to the given number to find factors
        for (int i = 2; i <= number; i++) {
            while (number % i == 0) { // If 'i' divides 'number' perfectly
                largestPrime = i; // Update the largest prime factor
                number /= i; // Reduce 'number' by dividing it by 'i'
            }
        }

        return largestPrime; // Return the largest prime factor
    }

    /**
     * Main method to test the getLargestPrime method.
     * It calls the method with various test cases and prints the results.
     *
     * @param args Command-line arguments (not used in this implementation).
     */
    public static void main(String[] args) {
        // Test cases to validate the getLargestPrime method
        System.out.println("Test 1: " + getLargestPrime(12)); // Expected: 3 (largest prime factor of 12 is 3)
        System.out.println("Test 2: " + getLargestPrime(28)); // Expected: 7 (largest prime factor of 28 is 7)
        System.out.println("Test 3: " + getLargestPrime(45)); // Expected: 5 (largest prime factor of 45 is 5)
        System.out.println("Test 4: " + getLargestPrime(100)); // Expected: 5 (largest prime factor of 100 is 5)
        System.out.println("Test 5: " + getLargestPrime(13));  // Expected: 13 (13 is a prime number)
        System.out.println("Test 6: " + getLargestPrime(1));   // Expected: -1 (1 has no prime factors)
        System.out.println("Test 7: " + getLargestPrime(19));  // Expected: 19 (19 is prime)
    }
}

