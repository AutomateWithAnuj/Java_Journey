package Java_Programs._22_OOPs_Basics;

public class P120_MoreMainMethods_In1JavaFile {

    // ✔ Yes, it is possible to have multiple main() methods
    //   inside the SAME .java file.
    //
    // ✔ But each main() must be inside a different class.
    //
    // ✔ This works properly in Java JDK 13 and above.
    //   (Older JDKs had limitations.)

    public static void main(String[] args) {
        System.out.println("Bye");  // Main method of P120_MoreMainMethods_In1JavaFile
    }
}

class P120_Copy {

    // Another main() method inside another class
    public static void main(String[] args) {
        System.out.println("Hi");  // Main method of P120_Copy
    }
}

// -----------------------------------------------------------
// NOTE:
// JVM treats each class as SEPARATE,
// even if they are inside the same .java file.
// -----------------------------------------------------------
//
// Each class:
// - Has its own variables (attributes)
// - Has its own methods (behaviour)
// - Can have its own main() method
//
// So these classes can run independently.
// -----------------------------------------------------------

// -----------------------------------------------------------
// IMPORTANT POINTS:
//
// ✔ You can run ONLY ONE class’s main() at a time.
// 
// ✔ When you click "Run" in your IDE (Eclipse, IntelliJ):
//      → It runs the main() of the class you selected.
//
// ✔ Even if this file contains multiple main() methods,
//   the IDE will execute ONLY the main() method of
//   the class that you run or select.
//
// ✔ In real automation frameworks (Selenium/UFT/Java apps),
//   we usually use ONLY one main() method.
//   So this concept is rarely used in real projects.
// -----------------------------------------------------------
