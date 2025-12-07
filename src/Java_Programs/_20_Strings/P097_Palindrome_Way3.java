package Java_Programs._20_Strings;

import java.util.Scanner;

public class P097_Palindrome_Way3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the text: ");

        // Taking the user input
        String userInput = sc.next();

        // Creating a StringBuilder to reverse the input
        StringBuilder stringBuilder = new StringBuilder(userInput);

        // reverse() modifies the same StringBuilder object and then we convert it to String
        String reversedText = stringBuilder.reverse().toString();

        // Comparing original and reversed values (ignoring case)
        if (reversedText.equalsIgnoreCase(userInput)) {
            System.out.println("Yes, it is a palindrome");
            // Example: Input -> "RaceCar" → reversed -> "raCecaR" → equalsIgnoreCase() returns true
        } else {
            System.out.println("No, it is not a palindrome");
            // Example: Input -> "Hello" → reversed -> "olleH" → not equal
        }
    }
}
