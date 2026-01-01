package Java_Programs._34_Wrapper_classes;

/**
 * Demonstrates Boxing and Unboxing using Wrapper classes.
 */
public class P165_Wrapper_Conversion {

    /**
     * Program execution starts here.
     */
    public static void main(String[] args) {

        // Primitive variable
        int a = 10;

        // Boxing (Autoboxing)
        // Primitive value is automatically converted into a Wrapper object
        Integer b = 10;

        // Using a behaviour (method) of the Wrapper class
        System.out.println(b.intValue()); 
        // Output: 10 (Wrapper Integer converted back to primitive int)

        // Accessing a constant provided by the Wrapper class
        System.out.println(Integer.MIN_VALUE); 
        // Output: -2147483648 (minimum value of int)

        // Wrapper object holding an int value
        Integer a2 = 42;

        // Unboxing (Auto-unboxing)
        // Wrapper object is automatically converted into a primitive value
        // Attributes and behaviours of the wrapper are no longer available
        int v = a2;

        System.out.println(v); 
        // Output: 42
    }
}
