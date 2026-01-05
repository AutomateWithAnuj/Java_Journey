package Java_Programs._37_Collection_Framework_DSA.Map;

import java.util.HashMap;
import java.util.Map;

/**
 * Demonstrates how to iterate over a Map using an enhanced for-loop
 * and the entrySet() method.
 */
public class P213_Iterate_Over_Map {
    public static void main(String[] args) {
        // Create a HashMap with String keys and Integer values
        Map<String, Integer> map = new HashMap<>();
        map.put("id1", 1);     // Add key-value pair
        map.put("id2", 2);
        map.put("id3", 3);
        map.put("id4", null);  // Null values are allowed
        map.put("id5", null);
        map.put("id6", 100);

        // Iterate over the map using entrySet() and enhanced for-loop
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            // Print key and value of each map entry
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // Example Output (order may vary due to HashMap):
        // id1 -> 1
        // id2 -> 2
        // id3 -> 3
        // id4 -> null
        // id5 -> null
        // id6 -> 100
    }
}
