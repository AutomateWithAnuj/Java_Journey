package Java_Programs._35_Exceptions;

/*
 * Junior QA–style exception handling example.
 * Demonstrates handling multiple exceptions step-by-step
 * without stopping the program flow.
 */
public class P177_JrQA_ExcpHandling_1 {

    public static void main(String[] args) {

        // Step 1: Read input from command-line arguments
        String input = null; // May remain null if no argument is passed

        try {
            input = args[0]; 
            // Reads first command-line argument
        } catch (ArrayIndexOutOfBoundsException e) {
            // Happens when no argument is provided
            System.out.println(e.getMessage()); 
            // Output example: Index 0 out of bounds for length 0
        }

        // Step 2: Convert String input to integer
        int parsedValue = 0;

        try {
            parsedValue = Integer.parseInt(input); 
            // Converts String to int
        } catch (NumberFormatException e) {
            // Happens when input is null or not a valid integer
            System.out.println(e.getMessage()); 
            // Output example: For input string: "abc"
        }

        // Step 3: Perform division operation
        int result = 0;

        try {
            result = 100 / parsedValue; 
            // Risky if parsedValue is 0
        } catch (ArithmeticException e) {
            // Happens when dividing by zero
            System.out.println(e.getMessage()); 
            // Output example: / by zero
        }

        // Final output (executes regardless of exceptions)
        System.out.println(result); 
        // Output: 0 (if any exception occurred earlier)
    }
}
