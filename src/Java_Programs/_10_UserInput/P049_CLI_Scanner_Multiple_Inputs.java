package Java_Programs._10_UserInput;

import java.util.Scanner;

public class P049_CLI_Scanner_Multiple_Inputs {
    public static void main(String[] args) {

        /*
        // CLI argument version (runs through Edit Configurations)
        System.out.println("Enter name, age, salary");
        String name = args[0];                      // takes name from CLI
        int age = Integer.parseInt(args[1]);        // converts string → int
        double salary = Double.parseDouble(args[2]);// converts string → double

        System.out.println(name);
        System.out.println(age);
        System.out.println(salary);
        */

        // Scanner version → takes inputs from keyboard
        Scanner sc = new Scanner(System.in);

        // Asking user to enter multiple inputs
        System.out.println("Enter the name, age, salary");

        // nextLine() → reads full string including spaces
        String name = sc.nextLine();

        // nextInt() → reads integer input
        int age = sc.nextInt();

        // nextDouble() → reads decimal number
        double salary = sc.nextDouble();

        // Printing the user-provided values
        System.out.println("User Information");
        System.out.println("Name: " + name);     // Output example: Name: Anuj Rajput
        System.out.println("Age: " + age);       // Output example: Age: 24
        System.out.println("Salary: " + salary); // Output example: Salary: 35000.0

        // Closing scanner (best practice)
        sc.close(); 
        // Think of it like closing a running water tap to save resources
    }
}
