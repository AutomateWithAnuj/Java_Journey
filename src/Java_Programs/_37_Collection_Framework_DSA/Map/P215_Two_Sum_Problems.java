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
     */
    private static void twoSums(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>(); // Store index -> value pairs

        // Brute-force nested loop to check all pairs of elements
        // Outer loop picks the first element in the pair
        for (int i = 0; i < nums.length - 1; i++) {
            // Inner loop picks the second element in the pair
            // Start from i+1 to avoid repeating the same pair or using same element twice
            for (int j = i + 1; j < nums.length; j++) {
                
                // Check if the sum of nums[i] and nums[j] equals the target
                if (target == nums[i] + nums[j]) {
                    // If yes, store the indices and their values in the map
                    // Key = index, Value = number at that index
                    map.put(i, nums[i]); // i-th element
                    map.put(j, nums[j]); // j-th element
                    // Now the map contains the two numbers that sum up to the target
                }
            }
        }

        // Print the map showing which indices matched
        System.out.println("Two sum pairs (index -> value): " + map);
        // Example Output for nums = [2,7,11,15], target = 9:
        // Two sum pairs (index -> value): {0=2, 1=7}
    }
}
