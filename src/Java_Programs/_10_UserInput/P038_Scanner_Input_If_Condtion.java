package Java_Programs._10_UserInput;

import java.util.Scanner;

public class P038_Scanner_Input_If_Condtion {
    public static void main(String[] args) {

        // Creating Scanner object to read input from keyboard (System.in)
        Scanner sc = new Scanner(System.in);

        // Asking user to enter the age
        System.out.print("Enter your age: ");

        // nextInt() reads an integer from the user
        int age = sc.nextInt();

        // Printing the entered age
        System.out.println(age);
        // Output:
        // If user enters 25 → prints 25

        // Best practice: close the scanner after use (optional here)
        sc.close();
    }
}
