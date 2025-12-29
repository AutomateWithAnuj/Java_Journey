package Java_Programs._29_OOPs_Abstraction_Abstract;

/*
 * This program demonstrates ABSTRACTION using an ABSTRACT CLASS.
 *
 * Abstraction means:
 * - Hiding the implementation details
 * - Showing only the essential features to the user
 */

public class P144_OOPs_Abstraction {

    public static void main(String[] args) {

        // Creating object of Child class
        Child child = new Child();

        // Calling implemented abstract method
        child.loan50k();

        // Calling concrete method inherited from abstract class
        child.loan25k();

        // Abstract class cannot be instantiated
        // Father f1 = new Father();  ❌ Not allowed

        /*
         * Runtime Polymorphism:
         * Reference of abstract class (Father)
         * Object of child class (Child)
         */
        Father f2 = new Child();
        f2.loan50k();   // Calls Child's implementation
        f2.loan25k();   // Calls Father's method
    }
}

/*
 * Abstract class representing a Parent (Father)
 * It contains:
 * - One abstract method (without body)
 * - One concrete method (with body)
 */
abstract class Father {

    /*
     * Abstract method:
     * - No implementation
     * - Forces child class to provide implementation
     */
    abstract void loan50k();

    /*
     * Concrete method:
     * - Has implementation
     * - Can be directly used by child class
     */
    void loan25k() {
        System.out.println("Father has given 25k loan");
    }
}

/*
 * Child class extends Father
 * It MUST implement all abstract methods of Father
 */
class Child extends Father {

    // Providing implementation of abstract method
    @Override
    void loan50k() {
        System.out.println("Child will repay the 50k loan");
    }
}
