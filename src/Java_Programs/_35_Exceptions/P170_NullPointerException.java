package Java_Programs._35_Exceptions;

/**
 * Demonstrates a NullPointerException.
 */
public class P170_NullPointerException {

    /**
     * Program execution starts here.
     */
    public static void main(String[] args) {

        // Declaring a String reference and assigning null
        // The object is not created in memory
        String name = null;

        // Calling a method on a null reference
        // This will cause a NullPointerException at runtime
        name.trim(); 
        // Output: java.lang.NullPointerException
    }
}
