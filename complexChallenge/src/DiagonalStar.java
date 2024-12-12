/**
 * The DiagonalStar class contains a method to print a square pattern of stars.
 * The square contains stars along the borders and diagonals.
 */
public class DiagonalStar {

    /**
     * Prints a square pattern of stars based on the input number.
     * The square includes stars along the borders and diagonals.
     *
     * @param number The size of the square (must be 5 or greater).
     * @throws IllegalArgumentException If the input number is less than 5.
     */
    public static void printSquareStar(int number) {
        // Step 1: Validate input
        if (number < 5) {
            System.out.println("Invalid Value");
            return;
        }

        // Step 2: Loop through rows
        for (int r = 1; r <= number; r++) {
            System.out.print("\n");

            // Step 3: Loop through columns for each row
            for (int c = 1; c <= number; c++) {

                // Step 4: Check for border or diagonal conditions
                if (r == 1 || r == number || c == 1 || c == number || r == c || c == number - r + 1) {
                    System.out.print("*"); // Print star
                } else {
                    System.out.print(" "); // Print space
                }
            }
        }
    }

    /**
     * Main method to test the printSquareStar method with various test cases.
     * It calls the method with different input values and prints the results.
     *
     * @param args Command-line arguments (not used in this implementation).
     */
    public static void main(String[] args) {
        // Test cases to validate the printSquareStar method
        System.out.println("Test 1 (number = 5):");
        printSquareStar(5); // Expected: A 5x5 star square with borders and diagonals
        System.out.println("\nTest 2 (number = 6):");
        printSquareStar(6); // Expected: A 6x6 star square with borders and diagonals
        System.out.println("\nTest 3 (number = 7):");
        printSquareStar(7); // Expected: A 7x7 star square with borders and diagonals
        System.out.println("\nTest 4 (number = 4):");
        printSquareStar(4); // Expected: "Invalid Value"
    }
}

