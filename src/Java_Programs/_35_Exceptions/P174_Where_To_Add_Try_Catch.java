package Java_Programs._35_Exceptions;

/*
 * Demonstrates where to place try-catch blocks
 * to handle runtime exceptions safely.
 */
public class P174_Where_To_Add_Try_Catch {

    public static void main(String[] args) {

        // Variable used as divisor (set to 0 intentionally)
        int divisor = 0;

        // Variable to store the result
        int result = 0;

        /*
         * Try block is placed only around the risky code
         * that can throw an exception.
         */
        try {
            // This line throws ArithmeticException (division by zero)
            result = 10 / divisor;
        }
        /*
         * Catch block handles the exception and prevents
         * abnormal program termination.
         */
        catch (Exception e) {
            // Prints the exception message to the console
            System.out.println(e.getMessage()); // Output: / by zero
        }
    }
}
