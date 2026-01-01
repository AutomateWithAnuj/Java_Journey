package Java_Programs._35_Exceptions;

/*
 * Junior QA–style exception handling (single try-catch).
 * Used when we are not sure which exception may occur.
 */
public class P178_JrQA_ExcpHandling_2 {

    public static void main(String[] args) {

        try {
            // Read first command-line argument
            String input = args[0];
            // Possible issue: ArrayIndexOutOfBoundsException

            // Convert String input to integer
            int value = Integer.parseInt(input);
            // Possible issue: NumberFormatException

            // Perform division
            int result = 100 / value;
            // Possible issue: ArithmeticException (/ by zero)

            System.out.println(result); 
            // Output: division result if no exception occurs

        } catch (Exception e) {
            // Generic catch block used when exact exception is unknown
            System.out.println(e.getMessage()); 
            // Prints the reason of failure (exception message)
        }
    }
}
