package Java_Programs._35_Exceptions;

/*
 * Demonstrates handling multiple exceptions using OR (|) condition
 * in a single catch block.
 */
public class P173_ExpHandling_ORCondition {

    public static void main(String[] args) {

        try {
            // Assigning null to a String reference
            String text = null;

            // This line throws NullPointerException
            text.trim();

            // This line is never reached because exception occurs above
            int result = 10 / 0;
        }
        /*
         * Single catch block handling multiple specific exceptions
         * using OR (|) operator.
         */
        catch (NullPointerException | ArithmeticException e) {
            // Prints the message of the exception that occurred
            System.out.println(e.getMessage()); // Output: null
        }
        /*
         * Generic catch block for any other exception
         */
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
