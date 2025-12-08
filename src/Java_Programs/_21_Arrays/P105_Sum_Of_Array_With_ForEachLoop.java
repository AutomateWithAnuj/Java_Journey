package Java_Programs._21_Arrays;

public class P105_Sum_Of_Array_With_ForEachLoop {
    public static void main(String[] args) {
        
        // Array of integers
        int[] numbers = {12, 34, 10};
        
        // ----------------- Method 1: Using Normal for Loop -----------------
        int sum = 0;
        
        // Loop will iterate from index 0 to numbers.length-1
        // And add each element into the 'sum' variable
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }
        
        System.out.println("Sum using normal for loop: " + sum); 
        // Output: 56  (because 12 + 34 + 10 = 56)
        
        
        
        // ----------------- Method 2: Using Enhanced For Loop -----------------
        // Also known as "For-Each Loop"
        int enhancedSum = 0;
        
        // Here 'e' will automatically take each value from the array one by one
        for (int e : numbers) {
            enhancedSum = enhancedSum + e;
        }
        
        System.out.println("Sum using enhanced for loop: " + enhancedSum);
        // Output: 56 (Same result as above)
    }
}
