package Java_Programs._37_Collection_Framework_DSA.List;

import java.util.ArrayList;
import java.util.List;

/**
 * Demonstrates commonly used ArrayList methods
 * using both generic and non-generic lists
 */
public class P193_ArrayList {

    public static void main(String[] args) {

        // Generic ArrayList: allows ONLY Integer values
        List<Integer> integerList = new ArrayList<>();

        // ArrayList with initial capacity of 10
        // Capacity means internal size, not the number of elements
        List capacityList = new ArrayList(10);

        // Non-generic ArrayList: allows any type of object
        List list = new ArrayList();

        // Adding elements of different data types
        list.add("1");     // String
        list.add("2");     // String
        list.add("3");     // String
        list.add("3");     // Duplicate values allowed
        list.add(4);       // Integer
        list.add(true);    // Boolean

        // Printing total number of elements
        System.out.println(list.size());
        // Output: 6

        // Checking if the list is empty
        System.out.println(list.isEmpty());
        // Output: false

        // Checking if specific element exists
        System.out.println(list.contains("1"));
        // Output: true (String "1" exists)

        System.out.println(list.contains(1));
        // Output: false (Integer 1 is different from String "1")

        // Getting index of first occurrence
        System.out.println(list.indexOf("3"));
        // Output: 2

        // Getting index of last occurrence
        System.out.println(list.lastIndexOf("3"));
        // Output: 3

        // Printing complete list
        System.out.println(list);
        // Output: [1, 2, 3, 3, 4, true]

        // Iterating and printing elements using for loop
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
            // Output: 1 2 3 3 4 true
        }

        // Many more useful methods are available in ArrayList
    }
}
