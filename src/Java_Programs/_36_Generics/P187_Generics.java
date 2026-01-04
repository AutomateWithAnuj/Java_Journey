package Java_Programs._36_Generics;

/*
 * This class demonstrates a **generic method**.
 * The same method works with Integer, Double, and String.
 */
public class P187_Generics {

    /*
     * Generic method declaration
     * <T> declares type parameter for this method
     * T is used as parameter type and return type
     */
    static <T> T temp_sum(T a, T b) {

        // Prints first value
        System.out.println(a); // prints value of a

        // Prints second value
        System.out.println(b); // prints value of b

        // return a + b; // ❌ compile-time error Because T does NOT know how to add (+) values.
        //it can add int, double, string, but not any other custom type object
        
        // No actual addition logic, so returning null
        return null;
    }
        public static void main(String[] args) {

        // Calling generic method with Integer values
        temp_sum(10, 20);
        // Output:
        // 10
        // 20

        // Calling generic method with Double values
        temp_sum(3.5, 4.5);
        // Output:
        // 3.5
        // 4.5

        // Calling generic method with String values
        temp_sum("Anuj", "Rajput");
        // Output:
        // Anuj
        // Rajput
    }
}
