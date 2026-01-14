package Java_Programs._37_Collection_Framework_DSA.Map;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

/**
 * Demonstrates basic usage of Hashtable in Java using Iterator.
 * Key points:
 * - Hashtable is synchronized (thread-safe) but slower than HashMap.
 * - Null keys or null values are NOT allowed.
 * - Legacy class, mostly replaced by HashMap in modern code.
 * - Iterator is preferred over Enumeration in modern Java.
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

        // Iterate over keys using Iterator
        Set<Integer> keys = ht.keySet();       // get all keys
        Iterator<Integer> itr = keys.iterator();
        while (itr.hasNext()) {
            Integer key = itr.next();
            System.out.println("Key: " + key);
        }

        // Example Output (order not guaranteed):
        // Key: 4
        // Key: 3
        // Key: 2
        // Key: 1
    }
}
