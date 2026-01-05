package Java_Programs._37_Collection_Framework_DSA.List;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Demonstrates basic operations on ArrayList and LinkedList
 * using List interface reference
 */
public class P196_LinkedList {

    public static void main(String[] args) {

        // ArrayList with initial capacity of 5 (optional)
        List arrayListWithCapacity = new ArrayList(5);

        // Normal ArrayList (stores elements in continuous memory internally)
        List arrayList = new ArrayList();

        // LinkedList (internally works as a Doubly Linked List)
        List linkedList = new LinkedList();

        // Adding different types of elements (non-generic list)
        linkedList.add("anuj");     // String
        linkedList.add("rajput");   // String
        linkedList.add("amit");     // String
        linkedList.add("amit");     // Duplicate values are allowed
        linkedList.add(null);       // null values are allowed
        linkedList.add(true);       // Boolean
        linkedList.add(123);        // Integer

        // Printing the LinkedList
        System.out.println(linkedList);
        // Output: [anuj, rajput, amit, amit, null, true, 123]

        // Checking whether the list is empty
        System.out.println(linkedList.isEmpty());
        // Output: false

        // Getting total number of elements
        System.out.println(linkedList.size());
        // Output: 7

        // Checking if a specific element exists
        System.out.println(linkedList.contains("rajput"));
        // Output: true

        // Getting index of first occurrence of "amit"
        System.out.println(linkedList.indexOf("amit"));
        // Output: 2
    }
}
