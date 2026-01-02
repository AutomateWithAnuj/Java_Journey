package Java_Programs._35_Exceptions;

/**
 * Demonstrates how multiple runtime exceptions
 * can be handled using a single try-catch block.
 */
public class P168_Exception_Explained {

    /**
     * Program execution starts here.
     * Command-line arguments are used as input.
     */
    public static void main(String[] args) {

        try {
            // Indicates the start of program execution
            System.out.println("Starting the program");
            // Output: Starting the program

            // Reading first command-line argument
            // May throw ArrayIndexOutOfBoundsException if no input is provided
            String userInput = args[0];

            // Converting String input to integer
            // May throw NumberFormatException if input is not a valid number
            int a = Integer.parseInt(userInput);

            // Performing division
            // May throw ArithmeticException if a is 0
            int output = 100 / a;

            // Printing final result if no exception occurs
            System.out.println(output);
            // Output: result of 100 / a

        } catch (ArrayIndexOutOfBoundsException 
               | ArithmeticException 
               | NumberFormatException e) {

            // catch (ArrayIndexOutOfBoundsException || ArithmeticException e) // ❌
            // || is a logical OR operator, used in conditions (if, while), not for types.
            // catch (ArrayIndexOutOfBoundsException OR ArithmeticException e) // ❌
            // OR is not a keyword or operator in Java.

            // JVM automatically creates the exception object
            // e.getMessage() gives a clear reason for the failure
            System.out.println(e.getMessage());
            // Possible Outputs:
            // - Index 0 out of bounds for length 0
            // - / by zero
            // - For input string: "abc"
        }
    }
}
