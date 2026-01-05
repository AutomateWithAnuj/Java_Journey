package Java_Programs._37_Collection_Framework_DSA.Queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Demonstrates the usage of a LinkedList as a Queue.
 * LinkedList maintains insertion order and implements Queue interface.
 */
public class P208_LinkedList {
    public static void main(String[] args) {
        // Create a Queue using LinkedList (FIFO order)
        Queue<Integer> queue = new LinkedList<>();

        // Add elements to the queue
        queue.add(6);
        queue.add(1);
        queue.add(8);

        // Iterate over the queue using an Iterator
        Iterator<Integer> iterator = queue.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next()); // Output: 6, 1, 8 (in insertion order)
        }
    }
}
