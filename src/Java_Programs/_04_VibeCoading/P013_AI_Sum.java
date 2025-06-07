package Java_Programs._04_VibeCoading;

//This code is automatically written by AI
//Not typed anything just pressed tab and wrriten my code
//just press cntl+L and give the prompt and see the magic

public class P013_AI_Sum {
    // Method to calculate sum of numbers from 1 to n
    public static int sum(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Sum is not defined for negative numbers");
        }
        return (n * (n + 1)) / 2;  // Using mathematical formula for sum of first n natural numbers
    }

    public static void main(String[] args) {
        // Test the sum method with a few numbers
        int[] numbers = {1, 5, 10, 100};
        
        for (int num : numbers) {
            System.out.println("Sum of numbers from 1 to " + num + " is: " + sum(num));
        }
    }
} 