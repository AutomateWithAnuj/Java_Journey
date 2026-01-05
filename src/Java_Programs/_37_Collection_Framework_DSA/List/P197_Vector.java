package Java_Programs._37_Collection_Framework_DSA.List;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

/**
 * Demonstrates usage of Vector and different ways to iterate over it
 */
public class P197_Vector {

    public static void main(String[] args) {

        // Creating a Vector (non-generic, can store any type of object)
        Vector vector = new Vector();

        // Creating a generic Vector with initial capacity of 10
        Vector<Integer> integerVector = new Vector<>(10); // capacity can be specified in Vector

        // Adding elements to the Vector
        vector.add("Anuj");
        vector.add("Rajput");
        vector.add("Amit");

        // Printing the Vector
        System.out.println(vector);
        // Output: [Anuj, Rajput, Amit]

        // Checking if Vector contains a specific element
        System.out.println(vector.contains("Amit"));
        // Output: true

        System.out.println(vector); // Prints the same Vector again

        // -------- Traversal using For Loop --------
        System.out.println("----- For Loop -----");
        for (int i = 0; i < vector.size(); i++) {
            System.out.print(vector.get(i) + " ");
            // Output: Anuj Rajput Amit
        }

        // -------- Traversal using For-Each Loop --------
        System.out.println("\n----- For Each Loop -----");
        for (Object obj : vector) { // Object used because Vector is non-generic
            System.out.print(obj + " ");
            // Output: Anuj Rajput Amit
        }

        // -------- Traversal using Iterator --------
        System.out.println("\n----- Iterator -----");
        Iterator iterator = vector.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
            // Output (each on new line): Anuj, Rajput, Amit
        }

        // -------- Traversal using Enumeration (Legacy Cursor) --------
        System.out.println("---- Enumeration -----");
        Enumeration<Object> enumeration = vector.elements();
        while (enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement());
            // Output (each on new line): Anuj, Rajput, Amit
        }

        // -------- Traversal using ListIterator (Forward) --------
        System.out.println("---- ListIterator (Forward) -----");
        ListIterator listIterator = vector.listIterator();
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
            // Output (each on new line): Anuj, Rajput, Amit
        }

        // -------- Traversal using ListIterator (Backward) --------
        System.out.println("---- ListIterator (Backward) -----");
        ListIterator backwardIterator = vector.listIterator(vector.size());
        while (backwardIterator.hasPrevious()) {
            System.out.println(backwardIterator.previous());
            // Output (each on new line): Amit, Rajput, Anuj
        }
    }
}
