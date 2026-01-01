package Java_Programs._35_Exceptions;

/*
 * Demonstrates basic exception handling using try-catch.
 * Shows how an ArithmeticException is caught and handled
 * without crashing the program.
 */
public class P171_Handling_Exceptions {

    public static void main(String[] args) {

        int result = 0; // Variable initialized to avoid using an unassigned value

        try {
            // This line causes ArithmeticException (division by zero)
            result = 10 / 0;
        } catch (Exception e) {
            /*
             * Catching the exception so the program does not terminate abnormally.
             * 'e' holds the exception object thrown by the JVM.
             */
            System.out.println(e.getMessage()); // Output: / by zero
        }

        // This line executes even after exception handling
        System.out.println(result); // Output: 0 (unchanged because exception occurred)
    }
}
