package Java_Programs._37_Collection_Framework_DSA.Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * Demonstrates different Map implementations in Java:
 * HashMap, LinkedHashMap, and TreeMap
 */
public class P210_Maps {

    public static void main(String[] args) {

        // ---------------- HashMap ----------------
        // Stores key-value pairs without any guaranteed order
        Map<String, String> hashMap = new HashMap<>();
        hashMap.put("name", "Anuj");
        hashMap.put("age", "24");
        hashMap.put("rollNo", "1");
        hashMap.put("PhoneNo", "9171167945");
        System.out.println("HashMap: " + hashMap);
        // Output example: {rollNo=1, age=24, name=Anuj, PhoneNo=9171167945}
        // Note: order of keys may vary

        // ---------------- LinkedHashMap ----------------
        // Maintains insertion order of keys
        Map<String, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("name", "Anuj");
        linkedHashMap.put("age", "24");
        linkedHashMap.put("rollNo", "1");
        linkedHashMap.put("PhoneNo", "9171167945");
        System.out.println("LinkedHashMap: " + linkedHashMap);
        // Output: {name=Anuj, age=24, rollNo=1, PhoneNo=9171167945}
        // Keys appear in the order they were added

        // ---------------- TreeMap ----------------
        // Sorts keys in natural order (alphabetical for Strings)
        Map<String, String> treeMap = new TreeMap<>();
        treeMap.put("Name", "Anuj");
        treeMap.put("Age", "24");
        treeMap.put("RollNo", "1");
        treeMap.put("PhoneNo", "9171167945");
        System.out.println("TreeMap: " + treeMap);
        // Output: {Age=24, Name=Anuj, PhoneNo=9171167945, RollNo=1}
        // Keys are sorted alphabetically
    }
}
