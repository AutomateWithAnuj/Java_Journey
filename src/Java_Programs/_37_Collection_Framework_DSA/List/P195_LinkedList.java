package Java_Programs._37_Collection_Framework_DSA.List;

import java.util.LinkedList;

/**
 * Demonstrates LinkedList specific methods
 */
public class P195_LinkedList {

    public static void main(String[] args) {

        // Creating a LinkedList (non-generic for demonstration)
        LinkedList animals = new LinkedList();

        // Adding elements to the list
        animals.add("Dog");        // Added at the end
        animals.add("Cat");        // Added at the end
        animals.addFirst("Lion");  // Added at the beginning
        animals.addLast("Elephant"); // Added at the end

        // Printing the LinkedList
        System.out.println("LinkedList: " + animals);
        // Output: [Lion, Dog, Cat, Elephant]

        // Accessing first and last elements
        System.out.println("First Element: " + animals.getFirst());
        // Output: Lion

        System.out.println("Last Element: " + animals.getLast());
        // Output: Elephant

        // Removing first and last elements
        animals.removeFirst(); // Removes "Lion"
        animals.removeLast();  // Removes "Elephant"

        // Printing list after removal
        System.out.println("LinkedList after removal: " + animals);
        // Output: [Dog, Cat]

        // Printing size of the LinkedList
        System.out.println("Size: " + animals.size());
        // Output: 2
    }
}
