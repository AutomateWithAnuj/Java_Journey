package Java_Programs._22_OOPs_Basics;

public class P119_ClassUnderClass {

    // This is the main public class for this file.
    // Only ONE class can be public in a Java file.
    // And the file name must match this public class name.
}

// Class names follow identifier rules:
// - Cannot start with numbers
// - Can contain letters, numbers, _, $
// - Cannot use spaces or keywords
// This is a valid class
class P4 { }   // This is allowed (simple class with no data)


// Example of a class inside another class (Nested Classes)
// Think of it like: Grandparent → Parent → Child
class P1 {

    // P2 is inside P1 (Child of P1)
    class P2 {

        // P3 is inside P2 (Child of P2, Grandchild of P1)
        class P3 {

            // This is an empty inner class,
            // but you can add variables and methods here later.
        }
    }
}

/*
 Explanation:
 - P1 is the outer class
 - P2 is an inner class inside P1
 - P3 is an inner class inside P2

 These are called Nested Classes or Class-Under-Class.
 They help in grouping logically related classes together.

 Visual structure:
 P1
   └── P2
         └── P3
*/
