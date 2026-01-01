package Java_Programs._35_Exceptions;

/**
 * Demonstrates try-catch-finally behavior in Java.
 * 
 * The program intentionally causes a division by zero exception
 * to show how exceptions are caught and how the finally block
 * always executes regardless of exceptions.
 */
public class P180_GuessOutput {

    public static void main(String[] args) {
        // Declare a constant value for pi (not used in this program but final keyword demo)
        final double PI = 3.14;

        // Initialize a variable 'a' to 0, will be used to cause division by zero
        int a = 0;

        try {
            // Attempt to divide 10 by 'a' (0) – this will throw ArithmeticException
            int result = 10 / a;
        } catch (Exception e) {
            // Catch any exception (here it will catch ArithmeticException)
            // Print a simple message indicating division by zero
            System.out.println("div by Zero"); // Output: div by Zero
        } finally {
            // This block always executes, whether exception occurs or not
            System.out.println("I will be executed anyhow!"); // Output: I will be executed anyhow!
        }
    }
}
