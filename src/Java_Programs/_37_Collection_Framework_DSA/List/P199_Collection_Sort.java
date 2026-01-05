package Java_Programs._37_Collection_Framework_DSA.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Demonstrates sorting of a List using Collections class
 */
public class P199_Collection_Sort {

    public static void main(String[] args) {

        // Creating a non-generic List to store marks
        List marks = new ArrayList();

        // Adding integer values (marks)
        marks.add(91);
        marks.add(74);
        marks.add(83);
        marks.add(56);

        // Printing original list
        System.out.println(marks);
        // Output: [91, 74, 83, 56]

        // Sorting list in ascending order
        Collections.sort(marks); // Uses natural ordering of elements
        System.out.println(marks);
        // Output: [56, 74, 83, 91]

        // Sorting list in descending order
        Collections.sort(marks, Collections.reverseOrder());
        System.out.println(marks);
        // Output: [91, 83, 74, 56]
    }
}
