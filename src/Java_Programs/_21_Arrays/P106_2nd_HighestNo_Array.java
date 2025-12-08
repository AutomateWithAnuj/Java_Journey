package Java_Programs._21_Arrays;

import java.util.Arrays;

public class P106_2nd_HighestNo_Array {
    public static void main(String[] args) {
        
        int[] numbers = {12, 34, 10, 1, 100, 3, 4, 32};
        
        
        // -------------------- Approach 1: Using Arrays.sort() --------------------
        // Sorting the array in ascending order
        Arrays.sort(numbers);
        
        // The second highest element will be at: length - 2
        System.out.println("Second highest (using sorting): " + numbers[numbers.length - 2]);
        // Output: 34  (Because sorted array becomes: 1 3 4 10 12 32 34 100)
        
        
        
        // -------------------- Approach 2: Without Sorting --------------------
        // Finding second-highest manually
        
        int max = numbers[0];
        int secondMax = Integer.MIN_VALUE;  // Smallest possible value that an int can take
        
        
        // Step 1: Find the maximum value
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        
        // Step 2: Find the second-highest value (value < max)
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > secondMax && numbers[i] != max) {
                secondMax = numbers[i];
            }
        }
        
        System.out.println("Second highest (without sorting): " + secondMax);
        // Output: 34
    }
}
