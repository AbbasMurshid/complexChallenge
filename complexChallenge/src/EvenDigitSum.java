/**
 * The EvenDigitSum class contains a method to calculate the sum of even digits of a given integer.
 *
 * The method getEvenDigitSum extracts each digit of the number and checks if it is even.
 * If the digit is even, it is added to the sum. The method returns the sum of even digits.
 * If the number is negative, the method returns -1.
 *
 * Example:
 * - For 123456, the even digits are 2, 4, and 6, and their sum is 12.
 * - For 111, there are no even digits, so the sum is 0.
 */
public class EvenDigitSum {

    /**
     * Main method to test the getEvenDigitSum method.
     * It calls the getEvenDigitSum method with different integers and prints the results.
     *
     * @param args The command-line arguments (not used in this implementation).
     */
    public static void main(String[] args) {

        // Test cases to check the sum of even digits
        System.out.println(getEvenDigitSum(5));   // Expected: 0 (no even digits)
        System.out.println(getEvenDigitSum(6));   // Expected: 6 (even digit 6)
        System.out.println(getEvenDigitSum(7));   // Expected: 0 (no even digits)
        System.out.println(getEvenDigitSum(8));   // Expected: 8 (even digit 8)
        System.out.println(getEvenDigitSum(9));   // Expected: 0 (no even digits)
        System.out.println(getEvenDigitSum(10));  // Expected: 0 (even digit 0)
    }

    /**
     * Calculates the sum of even digits of a given integer.
     * If the number is negative, the method returns -1.
     *
     * @param number The integer to check.
     * @return The sum of the even digits, or -1 if the number is negative.
     *
     * Example:
     * - getEvenDigitSum(123456) returns 12 (even digits: 2, 4, 6).
     * - getEvenDigitSum(111) returns 0 because there are no even digits.
     * - getEvenDigitSum(-123) returns -1 because negative numbers are not valid.
     */
    public static int getEvenDigitSum(int number) {

        // Variable to store the sum of even digits
        int evenSum = 0;

        // Variable to store the current digit being checked
        int checkEven = 0;

        // Check if the number is non-negative
        if (number >= 0) {

            // Loop through the digits of the number
            while (number != 0) {
                // Extract the last digit of the number
                checkEven = number % 10;

                // Remove the last digit from the number
                number = number / 10;

                // Check if the current digit is even
                if (checkEven % 2 == 0) {
                    // Add the even digit to the sum
                    evenSum += checkEven;
                }
            }
        } else {
            // Return -1 for negative numbers
            return -1;
        }

        // Return the sum of even digits
        return evenSum;
    }
}
