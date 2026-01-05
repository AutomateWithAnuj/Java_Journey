package Java_Programs._37_Collection_Framework_DSA.List;

import java.util.Stack;

/**
 * Demonstrates basic Stack operations (LIFO – Last In First Out)
 */
public class P201_Stack {

    public static void main(String[] args) {

        // Creating a Stack (non-generic for demonstration)
        // Stack follows LIFO order, like a stack of books
        Stack stack = new Stack();

        // Pushing elements onto the stack
        stack.push("Anuj");   // First element pushed
        stack.push("Rajput"); // Second element pushed
        stack.push("Amit");   // Third element pushed
        stack.push("Amit");   // Duplicate values are allowed

        // Printing the stack
        System.out.println(stack);
        // Output: [Anuj, Rajput, Amit, Amit]

        // Printing size of the stack
        System.out.println(stack.size());
        // Output: 4

        // Viewing the top element without removing it
        System.out.println(stack.peek());
        // Output: Amit (last pushed element)

        // Removing and returning the top element
        System.out.println(stack.pop());
        // Output: Amit (removed element)

        // Printing stack after pop operation
        System.out.println(stack);
        // Output: [Anuj, Rajput, Amit]

        // Pushing a new element after pop
        stack.push("Vijay");

        // Printing final stack state
        System.out.println(stack);
        // Output: [Anuj, Rajput, Amit, Vijay]
    }
}
