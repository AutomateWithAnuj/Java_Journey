package Java_Programs._35_Exceptions;

import java.util.Scanner;

/*
 * Real-life example of try-catch-finally.
 * Demonstrates why finally is used to close resources
 * like Scanner, regardless of exception occurrence.
 */
public class P176_TryCatchFinally_Real {

    public static void main(String[] args) {

        Scanner scanner = null;                 // Scanner reference declared outside
        scanner = new Scanner(System.in);        // Scanner initialized to take user input

        int userValue = scanner.nextInt();       // Reads integer input from user

        try {
            // Risky operation: division can fail if user enters 0
            int result = 10 / userValue;         
            System.out.println("Result: " + result); 
            // Output example: Result: 5
        }
        catch (ArithmeticException e) {
            // Handles divide-by-zero scenario
            System.out.println(e.getMessage());  
            // Output example: / by zero
        }
        finally {
            // Always executed: used for resource cleanup
            scanner.close();                     
            System.out.println("end of program sc is closed"); 
            // Output: end of program sc is closed
        }
    }
}
