package Java_Programs._37_Collection_Framework_DSA.List;

import java.util.LinkedList;
import java.util.List;

/**
 * Demonstrates basic usage of LinkedList
 */
public class P194_LinkedList {

    public static void main(String[] args) {

        // List list = new LinkedList(10);
        // ❌ Not allowed: LinkedList does NOT support initial capacity

        // Creating LinkedList using List reference
        List list = new LinkedList();

        // Adding elements to the LinkedList
        list.add("a"); // Element stored as a node (not in continuous memory)
        list.add("b"); // Each element is linked to the next one
        list.add("c"); // Physical memory location does not matter

        // Printing the LinkedList
        System.out.println(list);
        // Output: [a, b, c]
    }
}
