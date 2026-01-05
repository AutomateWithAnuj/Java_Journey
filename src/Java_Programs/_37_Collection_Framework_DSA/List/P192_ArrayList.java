package Java_Programs._37_Collection_Framework_DSA.List;

import java.util.ArrayList;
import java.util.List;

/**
 * Demonstrates basic usage of ArrayList through List reference
 */
public class P192_ArrayList {

    public static void main(String[] args) {

        // Creating an ArrayList object using List reference (runtime polymorphism)
        List list = new ArrayList();

        // Adding different types of elements (non-generic ArrayList)
        list.add("hello");   // String
        list.add("hello");   // Duplicate values are allowed
        list.add(123);       // Integer
        list.add(true);      // Boolean
        list.add(23.45);     // Double
        list.add(null);      // null values are allowed

        // Printing size of the list
        System.out.println(list.size());
        // Output: 6 (total number of elements added)

        // Creating an empty ArrayList
        ArrayList emptyList = new ArrayList();

        // Checking whether the list is empty
        System.out.println(emptyList.isEmpty());
        // Output: true (because no elements are added)
    }
}
