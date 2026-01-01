package Java_Programs._35_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * Demonstrates a Checked Exception.
 * FileNotFoundException is known to the compiler (compile-time).
 */
public class P169_Checked_Exception {

    /**
     * Program execution starts here.
     */
    public static void main(String[] args) {

        try {
            // Attempting to open a file from the given path
            // This line causes a Checked Exception at compile time
            // if not handled or declared
            FileInputStream fileInputStream =
                    new FileInputStream("C://testdata.txt");

            // This line will execute only if the file exists
            System.out.println("File opened successfully");
            // Output: File opened successfully

        } catch (FileNotFoundException e) {

            // Handling the checked exception
            // JVM already creates the exception object
            System.out.println(e.getMessage());
            // Output example: C:\testdata.txt (The system cannot find the file specified)
        }
    }
}
