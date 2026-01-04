package Java_Programs._36_Generics;

/*
 * This class demonstrates a **generic method**.
 * Generic methods allow the method to work with any reference type.
 */
public class P187_Generics {

    /*
     * Generic method declaration
     * <T>  → declares a type parameter T for this method
     * T    → return type of the method
     * a,b  → parameters of the same generic type
     */
    static <T> T temp_sum(T a, T b) {

        // Prints first argument
        System.out.println(a); // Output: value of 'a'

        // Prints second argument
        System.out.println(b); // Output: value of 'b'

        // Returning null because no actual operation (like sum) is performed
        // This preserves the original logic and intent
        return null;
    }
}
