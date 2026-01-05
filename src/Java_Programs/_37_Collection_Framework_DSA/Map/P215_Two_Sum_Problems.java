package Java_Programs._37_Collection_Framework_DSA.Map;

import java.util.HashMap;
import java.util.Map;

/**
 * Demonstrates a simple Two Sum problem solution using brute-force approach.
 * Finds pairs of indices whose elements sum up to the target value.
 */
public class P215_Two_Sum_Problems {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15}; // input array
        int target = 9;              // target sum

        // Call the method to find pairs
        twoSums(nums, target);
    }

    /**
     * Finds all index pairs in the array whose sum equals the target
     * and stores them in a map for demonstration.
     * 
     * @param nums   Input array
     * @param target Target sum
     * @return void
     */
    private static void twoSums(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>(); // Store index -> value pairs
        int c = 0; // Counter for demonstration

        // Brute-force nested loop to check all pairs
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) { // j starts from i+1 to avoid duplicates
                if (target == nums[i] + nums[j]) {
                    // Store the indices and corresponding numbers
                    map.put(i, nums[c++]); 
                    map.put(j, nums[c++]);
                }
            }
        }

        // Print the map showing which indices matched (example output)
        System.out.println("Two sum pairs (index -> value): " + map);
        // Example Output for nums = [2,7,11,15], target = 9:
        // Two sum pairs (index -> value): {0=2, 1=7}
    }
}
