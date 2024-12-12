/**
 * The NumberToWords class contains methods to convert a number into words and perform related operations.
 * It includes methods for:
 * - Counting the number of digits in a number.
 * - Reversing the digits of a number.
 * - Converting a number into words.
 */
public class NumberToWords {

    /**
     * Gets the number of digits in a given number.
     *
     * @param number The number whose digits are to be counted.
     * @return The number of digits in the number, or -1 if the number is negative.
     */
    public static int getDigitCount(int number) {
        if (number < 0) {
            return -1; // Invalid value for negative numbers
        }
        if (number == 0) {
            return 1; // Special case for zero
        }

        int count = 0;
        while (number > 0) {
            count++;
            number = number / 10; // Remove the last digit
        }
        return count;
    }

    /**
     * Reverses the digits of a given number.
     *
     * @param number The number to be reversed.
     * @return The reversed number.
     */
    public static int reverse(int number) {
        int reversed = 0;
        int sign = (number < 0) ? -1 : 1; // Track the sign
        number = (number < 0) ? -number : number; // Convert to positive for processing

        while (number > 0) {
            int lastDigit = number % 10; // Get the last digit
            reversed = reversed * 10 + lastDigit; // Build the reversed number
            number = number / 10; // Remove the last digit
        }
        return reversed * sign; // Restore the sign
    }

    /**
     * Converts a given number into its word representation.
     *
     * @param number The number to be converted to words.
     */
    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value"); // Invalid value for negative numbers
            return;
        }

        if (number == 0) { // Special case for zero
            System.out.println("Zero");
            return;
        }

        int reversed = reverse(number);
        int originalDigitCount = getDigitCount(number);
        int reversedDigitCount = getDigitCount(reversed);

        // Print each digit as a word
        while (reversed > 0) {
            int lastDigit = reversed % 10;

            // Map digits to words
            switch (lastDigit) {
                case 0 -> System.out.println("Zero");
                case 1 -> System.out.println("One");
                case 2 -> System.out.println("Two");
                case 3 -> System.out.println("Three");
                case 4 -> System.out.println("Four");
                case 5 -> System.out.println("Five");
                case 6 -> System.out.println("Six");
                case 7 -> System.out.println("Seven");
                case 8 -> System.out.println("Eight");
                case 9 -> System.out.println("Nine");
            }

            reversed = reversed / 10; // Remove the last digit
        }

        // Print any trailing zeroes
        for (int i = 0; i < originalDigitCount - reversedDigitCount; i++) {
            System.out.println("Zero");
        }
    }

    /**
     * Main method to test the numberToWords method.
     * It calls the numberToWords method with various test cases and prints the results.
     *
     * @param args The command-line arguments (not used in this implementation).
     */
    public static void main(String[] args) {

        // Test cases for the numberToWords method
        System.out.println("Testing numberToWords with 123:");
        numberToWords(123); // Expected: One, Two, Three

        System.out.println("\nTesting numberToWords with 1000:");
        numberToWords(1000); // Expected: One, Zero, Zero, Zero

        System.out.println("\nTesting numberToWords with 0:");
        numberToWords(0); // Expected: Zero

        System.out.println("\nTesting numberToWords with -5:");
        numberToWords(-5); // Expected: Invalid Value
    }
}
