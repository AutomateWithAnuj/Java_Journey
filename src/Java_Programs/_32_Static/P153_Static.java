package Java_Programs._32_Static;

/**
 * Demonstrates the use of static and instance (non-static) variables in Java.
 * Shows how static variables are shared across all objects, while instance variables are object-specific.
 */
public class P153_Static {
    public static void main(String[] args) {

        // Create first object with instance variable 'a' initialized to 10
        A ref = new A(10);
        ref.displayValue();              // Prints the instance variable 'a' of ref -> 10
        System.out.println(ref.b);       // Prints static variable 'b' -> 20 (accessed via object)
        System.out.println(A.b);         // Prints static variable 'b' -> 20 (preferred way: access via class name)

        // Modify static variable using class name (affects all objects)
        A.b = 45;

        // Create second object with instance variable 'a' initialized to 20
        A ref2 = new A(20);
        ref2.displayValue();             // Prints the instance variable 'a' of ref2 -> 20

        // Static variable 'b' reflects updated value across all objects
        System.out.println(ref.b);       // Prints static variable 'b' -> 45 (same as ref2.b)
        System.out.println(A.b);         // Prints static variable 'b' -> 45
    }
}

/**
 * Class A demonstrates:
 * - Instance variable 'a' (unique to each object)
 * - Static variable 'b' (shared across all objects)
 */
class A {
    int a = 10;          // Instance variable: each object has its own copy
    static int b = 20;   // Static variable: shared by all objects of class A

    // Constructor to initialize the instance variable 'a'
    A(int a) {
        this.a = a;     // 'this.a' refers to the instance variable, 'a' is the constructor parameter
    }

    // Method to display the instance variable 'a'
    void displayValue() {
        System.out.println(this.a); // Prints the object-specific value of 'a'
    }
}
