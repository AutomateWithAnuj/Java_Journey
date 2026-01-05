package Java_Programs._37_Collection_Framework_DSA.Map;

import java.util.HashMap;
import java.util.Map;

/**
 * Demonstrates HashMap behaviour with keys, values, and null handling
 */
public class P211_HashMaps {

    public static void main(String[] args) {

        // Creating a HashMap (keys unique, values can be duplicates, allows null key/value)
        Map<Object, Object> map = new HashMap<>();

        // Adding key-value pairs
        map.put("id", 1);
        map.put("id", 2);       // Duplicate key, value will be updated to 2
        map.put("id2", 2);      // Duplicate value allowed
        map.put("id3", 34);
        map.put("id4", 34);     // Duplicate value allowed
        map.put("id4", null);   // Overwrites previous value, null is allowed
        map.put("id5", null);   // Null value allowed
        map.put(null, 2);       // Null key allowed
        map.put(null, 3);       // Null key updated, only last value remains

        // Printing the map
        System.out.println("HashMap: " + map);
        // Example Output: {id=id2, id2=2, id3=34, id4=null, id5=null, null=3}

        // Number of key-value pairs in the map
        System.out.println("Size: " + map.size()); // Output: 6

        // Check if the map is empty
        System.out.println("Is Empty? " + map.isEmpty()); // Output: false

        // Check if a key exists
        System.out.println("Contains key 'id'? " + map.containsKey("id")); // true
        System.out.println("Contains key 99? " + map.containsKey(99));     // false

        // Get all keys
        System.out.println("All Keys: " + map.keySet());
        // Example Output: [id, id2, id3, id4, id5, null]

        // Get all values
        System.out.println("All Values: " + map.values());
        // Example Output: [2, 2, 34, null, null, 3]
    }
}
