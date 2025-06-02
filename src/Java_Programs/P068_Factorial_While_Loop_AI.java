package Java_Programs;

// Import Scanner class from java.util package to read user input
import java.util.Scanner;

// Class definition - name must match the file name
public class P068_Factorial_While_Loop_AI {
    // Main method - entry point of the program
    public static void main(String[] args) {
        //Nowadays, we are using AI like Cursor.AI
        // press cntrl + k/l 
        //then go to composer and add this file
        //Now we can ask the AI to explain the code inside that file
        //It can also make changes to the code if you want just we have to click accept after asking
        //It can also create a new file
        // Create a Scanner object to read input from the console
        //we can also ask for the output from the code if n=5
        //it can also setup the framework for us just we have to ask
        Scanner sc = new Scanner(System.in);
        
        // Prompt user to enter a number
        System.out.print("Enter a number: ");
        
        // Read the integer input from user and store it in variable 'n'
        int n = sc.nextInt();
        
        // Store the input number in a temporary variable 'temp'
        // We use temp because we need to decrement it in the loop
        int temp = n;
        
        // Initialize factorial result 'f' to 1
        // We start with 1 because multiplying by 1 doesn't change the result
        int f = 1;
        
        // While loop continues as long as temp is greater than or equal to 1
        while (temp >= 1) {
            // Multiply current factorial (f) with temp
            // For example: if n=5, then:
            // First iteration: f = 1 * 5 = 5
            // Second iteration: f = 5 * 4 = 20
            // Third iteration: f = 20 * 3 = 60
            // Fourth iteration: f = 60 * 2 = 120
            // Fifth iteration: f = 120 * 1 = 120
            f = f * temp;
            
            // Decrease temp by 1 in each iteration
            temp--;
        }
        
        // Print the result using printf for formatted output
        // %d is a placeholder for integers
        // First %d is replaced by n (input number)
        // Second %d is replaced by f (factorial result)
        System.out.printf("Factorial of the %d is %d", n, f);
        
        // Note: Scanner should be closed in a real application
        // sc.close();
    }
}
