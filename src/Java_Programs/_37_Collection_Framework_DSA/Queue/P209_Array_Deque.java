package Java_Programs._37_Collection_Framework_DSA.Queue;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Demonstrates the usage of ArrayDeque in Java.
 * ArrayDeque implements Deque interface and allows stack-like operations.
 */
public class P209_Array_Deque {
    public static void main(String[] args) {
        // Create a deque (double-ended queue)
        Deque<Integer> adq = new ArrayDeque<>();

        // Push elements onto the deque (stack behavior: LIFO)
        adq.push(15); // adds 15 at the front
        adq.push(10); // adds 10 at the front

        // Print deque elements
        System.out.println(adq); // Output: [10, 15] (10 is at front because of push)
    }
}
