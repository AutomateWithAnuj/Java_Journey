package Java_Programs._37_Collection_Framework_DSA.Set;

import java.util.*;

/**
 * Demonstrates differences between HashSet, LinkedHashSet, and TreeSet.
 * Highlights uniqueness, ordering, and null behavior.
 */
public class P204_HS_LHS_TS {
    public static void main(String[] args) {
        // ----------------- HashSet -----------------
        Set<String> hashSet = new HashSet<>(); // Stores elements using hashing, no order guaranteed
        hashSet.add("Apple");
        hashSet.add("Orange");
        hashSet.add("WaterMelon");
        hashSet.add("WaterMelon"); // Duplicate ignored
        hashSet.add(null);          // null allowed
        hashSet.add(null);          // Duplicate null ignored
        System.out.println("HashSet: " + hashSet); // Output: order not guaranteed

        // Iterate HashSet
        System.out.println("Iterating HashSet:");
        Iterator<String> hsIterator = hashSet.iterator();
        while (hsIterator.hasNext()) {
            System.out.println(hsIterator.next());
        }

        // ----------------- LinkedHashSet -----------------
        Set<String> linkedHashSet = new LinkedHashSet<>(); // Maintains insertion order
        linkedHashSet.add("Apple");
        linkedHashSet.add("Orange");
        linkedHashSet.add("WaterMelon");
        linkedHashSet.add("WaterMelon"); // Duplicate ignored
        linkedHashSet.add(null);          // null allowed
        linkedHashSet.add(null);          // Duplicate null ignored
        System.out.println("LinkedHashSet: " + linkedHashSet); // Output: insertion order maintained
        System.out.println("Size of LinkedHashSet: " + linkedHashSet.size());

        // ----------------- TreeSet -----------------
        Set<String> treeSet = new TreeSet<>(); // Stores elements in natural sorted order
        treeSet.add("Apple");
        treeSet.add("Orange");
        treeSet.add("WaterMelon");
        treeSet.add("WaterMelon"); // Duplicate ignored
        // treeSet.add(null); // Not allowed, will throw NullPointerException
        System.out.println("TreeSet (sorted): " + treeSet); // Output: sorted order
        System.out.println("Size of TreeSet: " + treeSet.size());

        // treeSet.add(123); // ClassCastException if uncommented, cannot mix types
    }
}
