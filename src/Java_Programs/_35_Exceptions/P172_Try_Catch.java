package Java_Programs._35_Exceptions;

/*
 * Demonstrates multiple catch blocks and the importance
 * of catching specific exceptions before generic ones.
 */
public class P172_Try_Catch {

    public static void main(String[] args) {

        // Simple print to show normal program flow before exception
        System.out.println("1"); // Output: 1

        try {
            // This line throws ArithmeticException (division by zero)
            int value = 10 / 0;
        }
        /*
         * Always catch more specific (smaller) exceptions first.
         * If Exception is placed before ArithmeticException,
         * the specific catch block becomes unreachable.
         */
        catch (ArithmeticException e) {
            // Handles only ArithmeticException
            System.out.println("Hit Spray for killing a cockroach"); // Output executes here
        }
        catch (Exception e) {
            // Handles any other exception not caught above
            System.out.println("Rocket Launcher for killing a cockroach");
        }
    }
}
