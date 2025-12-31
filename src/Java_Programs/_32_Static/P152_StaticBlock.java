package Java_Programs._32_Static;



/*
 * Demonstrates:
 * 1. Static Initialisation Block (SIB) → runs once when the class is loaded
 * 2. Instance Initialisation Block (IIB) → runs every time an object is created
 * 3. Constructor → runs after IIB for each object
 */
// Helper class to demonstrate block execution order
class P {

    // Static Initialisation Block
    // Executes ONCE when the class is loaded into JVM
    static {
        System.out.println("SIB"); // Output: SIB (printed only once)
    }

    // Instance Initialization Block
    // Executes EVERY TIME an object is created
    {
        System.out.println("IIB"); // Output: IIB (printed before constructor)
    }

    // Default Constructor
    // Executes AFTER IIB for each object
    P() {
        System.out.println("DC");  // Output: DC
    }
}


public class P152_StaticBlock {

    // Entry point of the program
    public static void main(String[] args) {

        // Creating multiple objects of class P
        // SIB will execute ONLY ONCE (at class loading)
        // IIB and constructor will execute for EACH object
        new P();   // Object 1
        new P();   // Object 2
        new P();   // Object 3
    }
}
/*
Expected Output:

SIB
IIB
DC
IIB
DC
IIB
DC

Execution Order Explanation:
1. SIB → runs once when class P is loaded
2. For each object:
   - IIB runs first
   - Constructor runs next
*/
