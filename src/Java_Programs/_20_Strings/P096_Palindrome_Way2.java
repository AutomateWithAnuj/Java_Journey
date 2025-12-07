package Java_Programs._20_Strings;

import java.util.Scanner;

public class P096_Palindrome_Way2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Text: ");

        // Taking user input
        String userInput = sc.next();

        // Calling method to get the reversed string
        String newString = reverseString(userInput);

        // Checking palindrome (ignoring case differences)
        if (newString.equalsIgnoreCase(userInput)) {
            System.out.println("Yes, it is a palindrome");
            // Output Example: Input -> "Madam" → reversed -> "madaM" → equalsIgnoreCase returns true
        } else {
            System.out.println("It is not a palindrome");
            // Output Example: Input -> "Hello" → reversed -> "olleH" → not equal
        }
    }

    // Method to reverse a string manually using a loop
    public static String reverseString(String s) {

        // Empty string to store reversed characters
        String s2 = "";

        // Loop starts from the last character and goes backwards
        for (int i = s.length() - 1; i >= 0; i--) {
            s2 += s.charAt(i);  // Adding each character to s2
        }

        // Returning reversed string
        return s2;
    }
}
