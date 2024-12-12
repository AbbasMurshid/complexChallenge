/**
 * The SharedDigit class contains a method to check whether two given integers
 * share any common digit.
 *
 * The method hasSharedDigit takes two integers and checks if they both have any digit in common.
 * If they share at least one digit, the method returns true; otherwise, it returns false.
 *
 * Example:
 * - For (67, 44), the shared digit is 4, so the result is true.
 * - For (46, 47), the shared digit is 4, so the result is true.
 * - For (67, 848), no common digits exist, so the result is false.
 */
public class SharedDigit {

    /**
     * Main method to test the hasSharedDigit method.
     * It calls the hasSharedDigit method with different pairs of integers and prints the results.
     *
     * @param args The command-line arguments (not used in this implementation).
     */
    public static void main(String[] args) {

        // Test cases to check if the numbers share any digit
        System.out.println(hasSharedDigit(67, 44));   // Expected: true (common digit 4)
        System.out.println(hasSharedDigit(46, 47));   // Expected: true (common digit 4)
        System.out.println(hasSharedDigit(67, 848));  // Expected: false (no common digits)
        System.out.println(hasSharedDigit(56, 86));   // Expected: true (common digit 6)
    }

    /**
     * Checks if two integers share any digit.
     * The method returns true if there is any common digit between the two numbers; otherwise, it returns false.
     * The numbers must be in the range from 10 to 99 (inclusive).
     *
     * @param number1 The first integer to check.
     * @param number2 The second integer to check.
     * @return true if the numbers share at least one common digit, false otherwise.
     *
     * Example:
     * - hasSharedDigit(67, 44) returns true because both numbers share the digit 4.
     * - hasSharedDigit(46, 47) returns true because both numbers share the digit 4.
     * - hasSharedDigit(67, 848) returns false because there are no common digits.
     * - hasSharedDigit(56, 86) returns true because both numbers share the digit 6.
     */
    public static boolean hasSharedDigit(int number1, int number2) {

        int checkNumber = 0;  // To store the last digit of number1
        int checkNumber1 = 0; // To store the last digit of number2

        // Check if both numbers are within the valid range (10 to 99)
        if ((number1 >= 10 && number1 <= 99) && (number2 >= 10 && number2 <= 99)) {

            // Iterate through the digits of number1
            while (number1 != 0) {
                checkNumber = number1 % 10; // Get the last digit of number1
                number1 = number1 / 10;     // Remove the last digit from number1

                int tempnumber = number2;  // Use a temporary variable to check digits of number2

                // Iterate through the digits of number2
                while (tempnumber != 0) {
                    checkNumber1 = tempnumber % 10; // Get the last digit of number2

                    // If a common digit is found, return true
                    if (checkNumber == checkNumber1) {
                        return true;
                    }
                    tempnumber /= 10; // Remove the last digit from number2
                }
            }
        }

        // Return false if no common digits are found
        return false;
    }
}
