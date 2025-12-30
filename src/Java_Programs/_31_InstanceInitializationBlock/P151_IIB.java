package Java_Programs._31_InstanceInitializationBlock;

/**
 * SampleClass
 * 
 * Demonstrates how Instance Initialization Blocks (IIB)
 * execute before the constructor.
 */
class SampleClass {

    /**
     * Instance Initialization Block - 1
     * 
     * - Executes automatically when an object is created
     * - Executes before the constructor
     */
    {
        System.out.println("Hi, I am Instance Initialization Block 1");
    }

    /**
     * Instance Initialization Block - 2
     * 
     * - Multiple IIBs are allowed
     * - They execute in top-to-bottom order
     */
    {
        System.out.println("Hi, I am Instance Initialization Block 2");
    }

    /**
     * Default Constructor
     * 
     * - Executes after all IIBs
     * - Used for object-specific initialization
     */
    public SampleClass() {
        System.out.println("I am the default constructor");
    }
}

/**
 * Main class to demonstrate Instance Initialization Block (IIB)
 */
public class InstanceInitializationDemo {

    /**
     * Main method
     * 
     * - Program execution starts here
     * - Creating an object of SampleClass
     * - This automatically triggers IIBs and then the constructor
     */
    public static void main(String[] args) {
        SampleClass obj = new SampleClass();
    }
}
