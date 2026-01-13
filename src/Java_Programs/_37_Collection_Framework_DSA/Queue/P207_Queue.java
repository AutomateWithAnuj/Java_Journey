package Java_Programs._37_Collection_Framework_DSA.Queue;

import java.util.PriorityQueue;

/**
 * Demonstrates basic operations of a PriorityQueue in Java.
 * PriorityQueue stores elements in their natural order automatically.
 */
public class P207_Queue {
    public static void main(String[] args) {
        // Create a PriorityQueue of Strings
        PriorityQueue<String> queue = new PriorityQueue<>();

        // Add elements to the queue
        queue.add("Anuj");
        queue.add("Rajput");
        // Elements are automatically stored in natural order (alphabetical for Strings)

        // Only the HEAD element is guaranteed to be in correct priority order.
        // The remaining elements are NOT guaranteed to be sorted.
        System.out.println(queue); // Example Output: [Anuj, Rajput]

        // Peek: view the first element without removing
        System.out.println(queue.peek()); // Output: Anuj

        // Poll: remove and return the first element (smallest in natural order)
        System.out.println(queue.poll()); // Output: Anuj

        // Print the queue after removal
        System.out.println(queue); // Output: [Rajput]
    }
}
