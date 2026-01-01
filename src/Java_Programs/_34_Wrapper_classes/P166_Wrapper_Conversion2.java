package Java_Programs._34_Wrapper_classes;

/**
 * Demonstrates different conversions using Wrapper classes.
 * Focuses on String, primitive, and Wrapper conversions.
 */
public class P166_Wrapper_Conversion2 {

    /**
     * Program execution starts here.
     */
    public static void main(String[] args) {

        // String containing a numeric value
        String num = "10";

        // Converting String to Wrapper using parseInt()
        // parseInt() converts String to primitive int,
        // which is then automatically boxed to Integer
        Integer a = Integer.parseInt(num); // Way 1

        // Converting String directly to Wrapper using valueOf()
        Integer b = Integer.valueOf(num);  // Way 2

        // Converting Wrapper to String using toString()
        System.out.println(a.toString());  
        // Output: "10"

        // Primitive integer value
        int a2 = 10; // (shown for understanding primitive usage)

        // Primitive to Wrapper (Autoboxing)
        int age = 10;
        Integer ageWrapper = age;

        // Converting Wrapper to String
        System.out.println(ageWrapper.toString()); 
        // Output: "10"
    }
}
