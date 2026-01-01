package Java_Programs._35_Exceptions;

import java.io.File;
import java.io.FileReader;

/**
 * Demonstrates the use of 'throws' keyword in Java.
 *
 * This program delegates exception handling to the JVM by using 'throws' in main().
 * It attempts to:
 * 1. Read a file from a given path (may throw FileNotFoundException)
 * 2. Read a command-line argument and parse it as an integer (may throw NumberFormatException or ArrayIndexOutOfBoundsException)
 * 3. Divide 100 by the parsed integer (may throw ArithmeticException)
 *
 * Any exception occurring in these operations will be thrown to the calling environment (JVM)
 * because we used 'throws Exception' in the main method.
 */
public class P182_Throws {

    public static void main(String[] args) throws Exception {
        // Attempt to open the file at "C://abc.txt"
        // FileNotFoundException can occur if the file does not exist
        FileReader fileReader = new FileReader(new File("C://abc.txt"));

        // Read the first command-line argument
        // Can throw ArrayIndexOutOfBoundsException if no argument is provided
        String input = args[0];

        // Convert the argument to an integer
        // Can throw NumberFormatException if input is not a valid integer
        int number = Integer.parseInt(input);

        // Divide 100 by the parsed number
        // Can throw ArithmeticException if number is 0
        int result = 100 / number;

        // Print the result (optional, will print if no exception occurs)
        System.out.println("Result: " + result); // Output: 100/input_value
    }
}
