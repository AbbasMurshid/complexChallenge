/**
 * The FirstLastDigits class contains a method to calculate the sum of the first and last digit of a given integer.
 *
 * The method sumFirstAndLastDigit takes a number, extracts its first and last digit, and returns their sum.
 * If the number is negative, it returns -1.
 *
 * Example:
 * - For 204, the first digit is 2, the last digit is 4, and the sum is 6.
 * - For 707, the first digit is 7, the last digit is 7, and the sum is 14.
 */
public class FirstLastDigits {

    /**
     * Main method to test the sumFirstAndLastDigit method.
     * It calls the sumFirstAndLastDigit method with different integers and prints the results.
     *
     * @param args The command-line arguments (not used in this implementation).
     */
    public static void main(String[] args) {

        // Test cases to check the sum of the first and last digit
        System.out.println(sumFirstAndLastDigit(204));  // Expected: 6 (2 + 4)
        System.out.println(sumFirstAndLastDigit(205));  // Expected: 7 (2 + 5)
        System.out.println(sumFirstAndLastDigit(706));  // Expected: 13 (7 + 6)
        System.out.println(sumFirstAndLastDigit(707));  // Expected: 14 (7 + 7)
    }

    /**
     * Calculates the sum of the first and last digit of a given integer.
     * If the number is negative, the method returns -1.
     *
     * @param number The integer to check.
     * @return The sum of the first and last digit, or -1 if the number is negative.
     *
     * Example:
     * - sumFirstAndLastDigit(204) returns 6 (first digit 2 + last digit 4).
     * - sumFirstAndLastDigit(205) returns 7 (first digit 2 + last digit 5).
     * - sumFirstAndLastDigit(-204) returns -1 because negative numbers are not valid.
     */
    public static int sumFirstAndLastDigit(int number) {

        // Variable to store the last digit
        int firstNumber = number % 10;

        // Variable to store the last digit after the loop
        int lastNumber = 0;

        // Variable to store the sum of first and last digits
        int sum = 0;

        // Check if the number is positive
        if (number >= 0) {
            // Loop to get the first digit
            while (number != 0) {
                lastNumber = number % 10;
                number = number / 10;
            }
        }
        // If the number is negative, return -1
        else {
            return -1;
        }

        // Sum the first and last digits
        sum = firstNumber + lastNumber;

        // Return the sum
        return sum;
    }
}
