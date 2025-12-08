package Java_Programs._22_OOPs_Basics;

public class P118_OOPs_Cats {
    public static void main(String[] args) {

        // Creating first Cat object and storing reference in c1
        Cat c1 = new Cat();

        // Declaring reference only (NO object created yet)
        Cat c2; 
        // Till now: Objects = 1 | References = 2 (c1, c2)

        // Creating an object without storing reference
        new Cat(); 
        // Now: Objects = 2 | References = 2
        // This object becomes unreachable and will be removed by Garbage Collector.

        // Calling method using valid reference
        c1.running(); // Output: Running

        // c2.running(); // ERROR → Reference has no object assigned

        // Creating an object and calling method immediately (valid)
        new Cat().running(); // Output: Running
        // Now: Objects = 3 (temporary object used only once)

        // Creating yet another object and accessing variable (default value will print: null)
        System.out.println(new Cat().name); 
        // Output: null
        // Now: Objects = 4 (again temporary — no reference stored)

        // Final Summary:
        // References created: 2 (c1, c2)
        // Objects created: 4 (1 assigned to c1, 3 without reference)
    }
}

class Cat {

    // Instance variable (default value: null)
    String name;

    // Behaviour / Method
    void running() {
        System.out.println("Running");
    }
}
