package Java_Programs._35_Exceptions;

/**
 * Demonstrates handling multiple exceptions in a single catch block.
 * 
 * The program takes a command-line argument, converts it to an integer,
 * and divides 100 by that integer. It handles potential runtime exceptions:
 * - No argument provided (ArrayIndexOutOfBoundsException)
 * - Invalid number format (NumberFormatException)
 * - Division by zero (ArithmeticException)
 */
public class P179_SrQA_ExcpHandling {

    public static void main(String[] args) {
        try {
            // Read the first command-line argument
            String input = args[0];

            // Convert the string input to an integer
            int number = Integer.parseInt(input);

            // Divide 100 by the integer value
            int result = 100 / number;

            // Print the result
            System.out.println("Result: " + result); // Output if no exception occurs

        } catch (ArrayIndexOutOfBoundsException | NumberFormatException | ArithmeticException e) {
            // Handle three possible exceptions in one catch block
            // Print the exception message to understand the error
            System.out.println("Exception occurred: " + e.getMessage()); // Output if exception occurs
        }
    }
}
