package Java_Programs._37_Collection_Framework_DSA.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 * Demonstrates taking multiple user inputs
 * and storing them in ArrayLists
 */
public class P200_UserInput_List {

    public static void main(String[] args) {

        // Scanner to take input from user
        Scanner scanner = new Scanner(System.in);

        // ArrayLists to store names and ages separately
        ArrayList<String> names = new ArrayList<>();
        ArrayList<Integer> ages = new ArrayList<>();

        // Control variable to continue or stop input loop
        String continueInput = "Yes";

        // Loop to take multiple inputs
        while (continueInput.equalsIgnoreCase("Yes")) {

            // Taking name input
            System.out.print("Enter Name: ");
            String name = scanner.next();

            // Taking age input
            System.out.print("Enter Age: ");
            int age = scanner.nextInt();

            // Storing inputs into respective lists
            names.add(name);
            ages.add(age);

            // Asking user whether to continue
            System.out.print("Do you want to input more names & their age (Yes/No): ");
            continueInput = scanner.next();
        }

        // Printing names list using Iterator
        System.out.print("Your Name Array is: ");
        Iterator<String> nameIterator = names.iterator();
        while (nameIterator.hasNext()) {
            System.out.print(nameIterator.next() + " ");
            // Output example: Anuj Amit Rahul
        }

        System.out.println(); // Line break for better output formatting

        // Printing ages list using Iterator
        System.out.print("Your Ages Array is: ");
        Iterator<Integer> ageIterator = ages.iterator();
        while (ageIterator.hasNext()) {
            System.out.print(ageIterator.next() + " ");
            // Output example: 24 30 28
        }

        // Closing scanner resource
        scanner.close();
    }
}
