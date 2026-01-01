package Java_Programs._34_Wrapper_classes;

/**
 * Demonstrates the difference between primitive data types
 * and their corresponding wrapper classes.
 */
public class P163_Primitive_Wrapper {

    /**
     * Entry point of the program.
     */
    public static void main(String[] args) {

        // Primitive local variable
        // Defined inside a method, so it is a local variable
        // Primitive types are NOT objects and have no methods
        int a = 10;

        // Example of a Wrapper class object
        // Integer is the wrapper class for int
        // Wrapper objects have attributes and behaviors (methods)
        Integer age = 65;

        // Primitive variables do not support methods
        // a.toString();  // ❌ Not allowed (primitive has no behavior)

        // Using a wrapper class method
        System.out.println(age.toString()); 
        // Output: "65" (Integer object converted to String)

        // Accessing predefined constants from wrapper class
        System.out.println(Integer.MIN_VALUE); 
        // Output: -2147483648 (minimum value of int)

        System.out.println(Integer.MAX_VALUE); 
        // Output: 2147483647 (maximum value of int)

        // Wrapper objects can be printed directly
        System.out.println(age); 
        // Output: 65
    }
}
