package Java_Programs._32_Static;

/**
 * Demonstrates:
 * - Static Initialisation Block (SIB)
 * - Static methods and variables
 * - Why non-static members cannot be accessed directly in static context
 */

/**
 * Class B contains:
 * - Static Initialization Block
 * - Instance variable
 * - Static variable
 * - Static and non-static methods
 */
class B {

    // Static Initialization Block
    // Executes only once when the class is loaded into memory
    static {
        System.out.println("SIB, called once, class is loaded"); // Printed once
    }

    int a = 10;          // Instance variable (belongs to object)
    static int b = 10;   // Static variable (shared by all objects)

    // Non-static method (requires object to call)
    void display() {
        System.out.println("Non Static"); // Printed when called using an object
    }

    // Static method (can be called using class name)
    static void commonToAll() {

        // System.out.println(a); 
        // Not allowed: instance variable cannot be accessed in static method

        System.out.println(b);       // Output: 10 (static variable access allowed)
        System.out.println("Static"); // Output: Static
    }
}

public class P154_Static {

    public static void main(String[] args) {

        // Calling static method using class name (no object required)
        B.commonToAll();
        // Output:
        // SIB, called once, class is loaded   (from static block)
        // 10                                 (static variable b)
        // Static                             (from static method)

        // Printing static variable using class name (best practice)
        System.out.println(B.b); // Output: 10
    }
}
