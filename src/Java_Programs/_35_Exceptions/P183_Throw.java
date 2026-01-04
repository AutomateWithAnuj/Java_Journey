package Java_Programs._35_Exceptions;

/**
 * Demonstrates the use of 'throw' keyword in Java.
 *
 * The program defines a method that explicitly throws an exception
 * when an invalid operation (division by zero) is attempted.
 */
public class P183_Throw {

    public static void main(String[] args) {
        // Example usage of the divideByZero method
        // Uncomment the line below to see the exception being thrown
        // divideByZero(0); // This will throw ArithmeticException
    }

    /**
     * Method to check division by zero.
     * Throws ArithmeticException explicitly if 'a' is zero.
     *
     * @param a integer value to check
     */
    static void divideByZero(int a) {
        if (a == 0) {
            // Explicitly throwing an ArithmeticException
            // Exception is thrown when Java cannot continue normal execution safely.
            // Java throws an exception to:
            // Prevent wrong results
            // Prevent undefined behaviour
            // Force the developer to handle abnormal situations
            throw new ArithmeticException("Cannot divide by zero!"); // Output: Exception thrown if a=0
        }
    }
}
