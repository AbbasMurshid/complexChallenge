/**
 * The FlourPacker class contains a method to check if it's possible to pack a given goal weight
 * using a combination of big and small bags of flour.
 */
public class FlourPacker {

    /**
     * Determines if it's possible to pack the goal weight using the given number of big and small bags.
     *
     * @param bigCount The number of big bags (each bag holds 5 units).
     * @param smallCount The number of small bags (each bag holds 1 unit).
     * @param goal The total weight to be packed.
     * @return True if it's possible to pack the goal weight, otherwise false.
     */
    public static boolean canPack(int bigCount, int smallCount, int goal) {

        // Step 1: Check for invalid input
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false; // Invalid input; all counts and goal must be non-negative
        }

        // Step 2: Handle big bags
        int bigPack = goal / 5; // How many big bags are needed
        int resultBig = bigCount; // Remaining big bags available

        for (int i = 1; resultBig > 0 && bigPack > 0; i++) {
            resultBig--; // Use one big bag
            bigPack--;   // Decrease the need for big bags
            goal -= 5;   // Reduce the goal by 5 for each big bag used
        }

        // Step 3: Handle remainder if big bags were insufficient
        int remainder = goal;

        // Step 4: Use small bags to fulfill the remainder
        for (int i = 0; smallCount > 0 && remainder > 0; i++) {
            smallCount--; // Use one small bag
            remainder--;  // Reduce the remainder by 1
        }

        // Step 5: Check if the goal is met
        return remainder == 0;
    }

    /**
     * Main method to test the canPack method.
     * It calls the canPack method with various test cases and prints the results.
     *
     * @param args The command-line arguments (not used in this implementation).
     */
    public static void main(String[] args) {

        // Test cases for the canPack method
        System.out.println("Test 1: " + canPack(2, 5, 11)); // Expected: true (2 big bags and 1 small bag)
        System.out.println("Test 2: " + canPack(1, 5, 7)); // Expected: true (1 big bag and 2 small bags)
        System.out.println("Test 3: " + canPack(0, 5, 6)); // Expected: false (not enough big bags for 5)
        System.out.println("Test 4: " + canPack(1, 0, 6)); // Expected: false (1 big bag and no small bags)
        System.out.println("Test 5: " + canPack(3, 6, 18)); // Expected: true (3 big bags)
        System.out.println("Test 6: " + canPack(2, 3, 13)); // Expected: false (not enough small bags after big bags)
        System.out.println("Test 7: " + canPack(2, 1, 12)); // Expected: true (2 big bags and 2 small bags)
    }
}

