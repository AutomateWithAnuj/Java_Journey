package Java_Programs._35_Exceptions;

/*
 * Demonstrates try-catch-finally behavior.
 * The finally block executes regardless of whether
 * an exception occurs or not.
 */
public class P175_Try_Catch_Finally {

    public static void main(String[] args) {

        int numerator = 1;   // Declared for completeness (not used in calculation)
        int result = 0;      // Variable to store division result

        try {
            // Risky operation: change divisor to 0 to see exception scenario
            result = 10 / 2;                      // Successful division
            System.out.println(result);           // Output: 5
        }
        catch (Exception e) {
            // Executes only if an exception occurs in try block
            System.out.println(e.getMessage());   // Output example: / by zero
        }
        finally {
            // Always executes whether exception occurs or not
            System.out.println("I will be always executed!"); // Output always printed
        }
    }
}
