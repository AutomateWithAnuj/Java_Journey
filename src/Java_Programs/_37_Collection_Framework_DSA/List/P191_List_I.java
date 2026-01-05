package Java_Programs._37_Collection_Framework_DSA.List;

import java.util.List;

/**
 * Demonstrates usage and limitations of List.of()
 */
public class P191_List_I {

    public static void main(String[] args) {

        // List fruits = new List(); 
        // ❌ Not allowed: List is an interface, cannot be instantiated

        // Creating an immutable List using List.of()
        // List.of() is a static method available in List interface (Java 9+)
        List<String> fruits = List.of("orange", "apple", "banana", "mango", "watermelon");

        // Printing the list
        System.out.println(fruits);
        // Output: [orange, apple, banana, mango, watermelon]

        // Attempting to modify the list
        fruits.add("chiku");
        // ❌ Runtime Error: UnsupportedOperationException
        // Reason: List created using List.of() is immutable (cannot be changed)

        System.out.println(fruits); // This line will not execute due to exception

        fruits.remove("banana");
        // ❌ Runtime Error: UnsupportedOperationException
        // Reason: Removal is also not allowed on immutable lists

        System.out.println(fruits); // This line will not execute due to exception

        /*
         * Conclusion:
         * - List.of() creates a fixed-size, immutable list
         * - add(), remove(), update operations are NOT supported
         *
         * To perform modification operations, use concrete classes:
         * ArrayList, LinkedList, Vector, Stack
         */
    }
}
