
/**
 * The FactorPrinter class contains a method to print all the factors of a given number.
 * A factor is any number that divides the given number without leaving a remainder.
 *
 * The method printFactors takes a number and prints all its factors in ascending order.
 * If the number is invalid (i.e., less than or equal to 0), it prints "Invalid Value".
 */
public class FactorPrinter {

    /**
     * Prints all factors of a given number.
     * The method checks if the number is greater than 0 before proceeding.
     * If the number is invalid (<= 0), it prints "Invalid Value".
     *
     * @param number The number whose factors are to be printed.
     */
    public static void printFactors(int number) {

        // Check if the number is valid
        if (number <= 0) {
            System.out.println("Invalid Value");
            return; // Exit the method if the number is invalid
        }

        // Loop through all numbers from 1 to the given number
        for (int i = 1; i <= number; i++) {
            // Check if the current number is a factor
            if (number % i == 0) {
                System.out.println(i); // Print the factor
            }
        }
    }

    /**
     * Main method to test the printFactors method.
     * It calls the printFactors method with various test cases and prints the results.
     *
     * @param args The command-line arguments (not used in this implementation).
     */
    public static void main(String[] args) {

        // Test cases for the printFactors method
        System.out.println("Factors of 12:");
        printFactors(12);  // Expected: 1, 2, 3, 4, 6, 12

        System.out.println("\nFactors of 28:");
        printFactors(28);  // Expected: 1, 2, 4, 7, 14, 28

        System.out.println("\nFactors of -5:");
        printFactors(-5);  // Expected: Invalid Value (since the number is negative)

        System.out.println("\nFactors of 0:");
        printFactors(0);  // Expected: Invalid Value (since the number is 0)

        System.out.println("\nFactors of 1:");
        printFactors(1);  // Expected: 1 (only 1 is the factor of 1)
    }
}

