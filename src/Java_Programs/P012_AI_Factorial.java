package Java_Programs;

//This code is automatically written by AI
//Not typed anything just pressed tab and wrriten my code
//just press cntl+L and give the prompt and see the magic

public class P012_AI_Factorial {
    // Method to calculate factorial
    public static long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers");
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        // Test the factorial method with a few numbers
        int[] numbers = {0, 1, 5, 10};
        
        for (int num : numbers) {
            System.out.println("Factorial of " + num + " is: " + factorial(num));
        }
    }
}
