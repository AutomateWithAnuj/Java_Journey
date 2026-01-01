package Java_Programs._35_Exceptions;

import java.util.Scanner;

/**
 * Demonstrates creating and throwing a custom exception in Java.
 * 
 * The program asks the user to enter their age. 
 * If the age is less than 18, a custom exception is thrown to prevent further action.
 */
public class P184_Throw_New_Exception {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create Scanner object to read input
        System.out.print("Enter your age: "); // Prompt user for age
        int age = scanner.nextInt(); // Read the age input

        try {
            // Validate the age; may throw an exception if age < 18
            validateAge(age);
            System.out.println("You are allowed to go!"); // Output if age >= 18
        } catch (Exception e) {
            // Catch the exception and print its message
            System.out.println(e.getMessage()); // Output if age < 18
        }
    }

    /**
     * Method to validate age.
     * Throws an Exception if age is less than 18.
     *
     * @param age User's age
     * @throws Exception Custom message if age < 18
     */
    public static void validateAge(int age) throws Exception {
        if (age < 18) {
            // Throw an Exception with a custom message
            throw new Exception("You cannot go else you will be out of house!"); 
        }
    }
}
