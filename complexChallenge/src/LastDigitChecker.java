/**
 * The LastDigitChecker class contains methods to validate numbers and check if three numbers
 * share the same last digit.
 *
 * The methods are:
 * - `isValid()`: Checks if a number is within the valid range (10 to 1000).
 * - `hasSameLastDigit()`: Checks if three given numbers share the same last digit.
 */
public class LastDigitChecker {

    /**
     * Checks if a number is within the valid range (10 to 1000).
     *
     * @param number The number to validate.
     * @return true if the number is within the range [10, 1000], false otherwise.
     */
    public static boolean isValid(int number){
        return number >= 10 && number <= 1000;
    }

    /**
     * Checks if three numbers have the same last digit.
     * The numbers must be within the range of 10 to 1000.
     *
     * @param number1 The first number.
     * @param number2 The second number.
     * @param number3 The third number.
     * @return true if any two numbers share the same last digit, false otherwise.
     */
    public static boolean hasSameLastDigit(int number1, int number2, int number3){

        // Extract the last digit of each number
        int check1 = number1 % 10;
        int check2 = number2 % 10;
        int check3 = number3 % 10;

        // Check if all numbers are valid
        if ((number1 >= 10 && number1 <= 1000) &&
                (number2 >= 10 && number2 <= 1000) &&
                (number3 >= 10 && number3 <= 1000)) {

            // Compare the last digits of the numbers
            if (check1 == check2 || check1 == check3 || check2 == check3) {
                return true;
            }
        }

        // Return false if the numbers don't share the same last digit
        return false;
    }

    /**
     * Main method to test the isValid and hasSameLastDigit methods.
     * It tests different sets of numbers and prints the results.
     *
     * @param args The command-line arguments (not used in this implementation).
     */
    public static void main(String[] args) {

        // Test cases for isValid method
        System.out.println(isValid(5));      // Expected: false (outside range)
        System.out.println(isValid(50));     // Expected: true (valid)
        System.out.println(isValid(1000));   // Expected: true (valid)
        System.out.println(isValid(1001));   // Expected: false (outside range)

        // Test cases for hasSameLastDigit method
        System.out.println(hasSameLastDigit(23, 43, 53));  // Expected: true (same last digit 3)
        System.out.println(hasSameLastDigit(23, 44, 56));  // Expected: false (no same last digit)
        System.out.println(hasSameLastDigit(123, 223, 323)); // Expected: true (same last digit 3)
        System.out.println(hasSameLastDigit(87, 90, 87));   // Expected: true (same last digit 7)
    }
}

