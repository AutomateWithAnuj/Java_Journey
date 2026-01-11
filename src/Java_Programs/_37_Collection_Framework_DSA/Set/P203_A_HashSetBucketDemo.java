package Java_Programs._37_Collection_Framework_DSA.Set;

import java.util.HashSet;

/**
 * Demonstrates how HashSet uses hashing to map elements into buckets.
 * This example manually simulates bucket calculation for learning purposes.
 */
public class P203_A_HashSetBucketDemo {

    public static void main(String[] args) {

        // Create a HashSet to store String elements (no duplicates, no order guarantee)
        HashSet<String> set = new HashSet<>();

        // Add elements to the HashSet
        // Internally, HashSet will use hashCode() to decide storage buckets
        set.add("3242");
        set.add("3523");
        set.add("123");
        set.add("235");
        set.add("538");

        // Bucket size is chosen manually for demonstration
        // (In real HashSet, bucket size is managed internally by Java)
        int bucketSize = 10;

        // Print table header to explain the output format
        System.out.println("Element → HashCode → Bucket Index");
        // Example output line format:
        // 3523 → 48690 → 0

        // Iterate through HashSet elements (order may appear random)
        for (String element : set) {

            // Get hash code of the element
            // hashCode() decides where the element should be stored
            int hashCode = element.hashCode();

            // Calculate bucket index using modulo
            // Math.abs is used to avoid negative bucket numbers
            int bucketIndex = Math.abs(hashCode % bucketSize);

            // Print element, its hashCode, and calculated bucket index
            // Elements with same bucket index represent a collision
            System.out.printf("%s → %d → %d%n", element, hashCode, bucketIndex);
            // Example collision:
            // 3523 → 48690 → 0
            // 123  → 48690 → 0   (same bucket → collision)
        }
    }
}
