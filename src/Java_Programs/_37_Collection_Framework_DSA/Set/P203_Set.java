package Java_Programs._37_Collection_Framework_DSA.Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * Demonstrates different types of Sets in Java.
 * Sets do not allow duplicate elements.
 */
public class P203_Set {
    public static void main(String[] args) {
        // HashSet: No guaranteed order, duplicates not allowed
        Set<String> hashSet = new HashSet<>();
        hashSet.add("anuj");
        hashSet.add("anuj"); // duplicate ignored
        System.out.println("HashSet: " + hashSet); // Output: [anuj]

        // LinkedHashSet: Maintains insertion order, duplicates not allowed
        Set<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("anuj");
        linkedHashSet.add("rajput");
        System.out.println("LinkedHashSet: " + linkedHashSet); // Output: [anuj, rajput]

        // TreeSet: Stores elements in sorted order, duplicates not allowed
        Set<String> treeSet = new TreeSet<>();
        treeSet.add("rajput");
        treeSet.add("anuj");
        System.out.println("TreeSet: " + treeSet); // Output: [anuj, rajput] (sorted)
    }
}
