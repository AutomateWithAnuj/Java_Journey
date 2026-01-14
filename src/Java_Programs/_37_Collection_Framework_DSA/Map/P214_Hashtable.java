package Java_Programs._37_Collection_Framework_DSA.Map;

import java.util.Enumeration;
import java.util.Hashtable;

/**
 * Demonstrates basic usage of Hashtable in Java.
 * Key points:
 * - Hashtable is synchronized (thread-safe) but slower than HashMap.
 * - Null keys or null values are NOT allowed.
 * - Legacy class, mostly replaced by HashMap in modern code.
 */
public class P214_Hashtable {
    public static void main(String[] args) {
        // Create a Hashtable with Integer keys and String values
        Hashtable<Integer, String> ht = new Hashtable<>();

        // Adding key-value pairs
        ht.put(1, "one");
        ht.put(2, "one");   // duplicate value is allowed
        ht.put(3, "three");
        ht.put(4, "four");
        ht.put(4, "five");  // duplicate key overwrites previous value

        // ht.put(5, null); // Null values not allowed -> would throw NullPointerException
        System.out.println("Hashtable: " + ht); 
        // Example Output (order not guaranteed): {4=five, 3=three, 2=one, 1=one}

        // Iterate over keys using Enumeration
        Enumeration<Integer> keys = ht.keys();
        while (keys.hasMoreElements()) {
            System.out.println("Key: " + keys.nextElement());
        }

        // Example Output (order not guaranteed):
        // Key: 4
        // Key: 3
        // Key: 2
        // Key: 1
    }
}
