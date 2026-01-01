package Java_Programs._35_Exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * Demonstrates handling checked exceptions in Java.
 * 
 * The program attempts to read a file from a given path.
 * If the file does not exist, a FileNotFoundException is thrown
 * and caught to prevent the program from crashing.
 */
public class P181_GuessOutput {

    public static void main(String[] args) {
        try {
            // Create a File object pointing to the path "C://abc.txt"
            File file = new File("C://abc.txt");

            // Attempt to create a FileReader to read the file
            // This may throw FileNotFoundException if the file doesn't exist
            FileReader fileReader = new FileReader(file);

        } catch (FileNotFoundException e) {
            // Catch the exception if the file is not found
            // Print the exception message to understand what went wrong
            System.out.println("Exception: " + e.getMessage()); // Output: C:\abc.txt (or system-specific error message)
        }
    }
}
