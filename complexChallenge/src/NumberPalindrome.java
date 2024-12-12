/**
 * The NumberPalindrome class contains a method to check if a given integer is a palindrome.
 * A palindrome is a number that remains the same when its digits are reversed.
 *
 * Example:
 * - 101 is a palindrome because its reverse is also 101.
 * - 10 is not a palindrome because its reverse is 01, which is not equal to 10.
 *
 * This class contains:
 * - A main method to test the isPalindrome method with sample inputs.
 * - A static method isPalindrome to check if a given number is a palindrome.
 */
public class NumberPalindrome {

    /**
     * Main method to test the isPalindrome method.
     * It calls the isPalindrome method with different integers and prints the results.
     *
     * @param args The command-line arguments (not used in this implementation).
     */
    public static void main(String[] args) {
        // Test cases to check if the numbers are palindromes
        System.out.println(isPalindrome(10));    // Expected: false
        System.out.println(isPalindrome(101));   // Expected: true
        System.out.println(isPalindrome(1010));  // Expected: false
        System.out.println(isPalindrome(1011));  // Expected: false
        System.out.println(isPalindrome(1012));  // Expected: false
        System.out.println(isPalindrome(-1013)); // Expected: false (negative numbers are not palindromes)
    }

    /**
     * Checks if a given integer is a palindrome.
     * A palindrome number reads the same backward as forward.
     *
     * @param number The integer to check.
     * @return true if the number is a palindrome, false otherwise.
     *
     * Example:
     * - isPalindrome(101) returns true because 101 is the same when reversed.
     * - isPalindrome(123) returns false because 123 is not the same when reversed (321).
     */
    public static boolean isPalindrome(int number) {
        // Variable to store the reversed number
        int reverse = 0;

        // Variable to store the original number for comparison
        int checkNumber = number;

        // While loop to reverse the digits of the number
        while (checkNumber != 0) {
            // Multiply reverse by 10 and add the last digit of checkNumber
            reverse = reverse * 10;
            reverse += checkNumber % 10;

            // Remove the last digit from checkNumber
            checkNumber = checkNumber / 10;
        }

        // Compare the reversed number with the original number
        if (number == reverse) {
            return true;  // The number is a palindrome
        } else {
            return false; // The number is not a palindrome
        }
    }
}
