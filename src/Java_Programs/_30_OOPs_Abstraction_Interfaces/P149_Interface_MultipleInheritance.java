package Java_Programs._30_OOPs_Abstraction_Interfaces;

/*
 * Mother interface.
 * Defines a rule that any implementing class must provide money().
 */
interface Mother {

    // Abstract method (public and abstract by default)
    void money();
}

/*
 * Father interface.
 * Also defines a method with the same signature.
 */
interface Father {

    // Abstract method (public and abstract by default)
    void money();
}

/*
 * Child class implements both Mother and Father interfaces.
 * This demonstrates multiple inheritance using interfaces.
 */
class Child implements Mother, Father {

    /*
     * Single implementation of money() method.
     * This method satisfies both Mother and Father interfaces.
     * Hence, there is NO ambiguity.
     */
    @Override
    public void money() {
        System.out.println("Everything is yours");
    }
}

/*
 * This class contains the main method.
 * Program execution starts from here.
 */
public class P149_Interface_MultipleInheritance {

    public static void main(String[] args) {

        // Creating an object of the Child class
        Child child = new Child();

        // Calling money() method
        // Single implementation resolves conflict from both interfaces
        child.money();

        /*
         * Expected Output:
         * Everything is yours
         */
    }
}
