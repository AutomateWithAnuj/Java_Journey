package Java_Programs._30_OOPs_Abstraction_Interfaces;

/*
 * This interface represents an incomplete component.
 * It defines WHAT needs to be done, not HOW.
 */
interface IncompleteComponent {

    /*
     * Interface variable
     * By default: public static final
     */
    int VALUE = 10;

    /*
     * Abstract method
     * By default: public and abstract
     */
    void display();
}

/*
 * This is a concrete class.
 * It provides the actual implementation of the interface.
 */
class ConcreteComponent implements IncompleteComponent {

    /*
     * Implementing the abstract method of the interface.
     * This completes the incomplete behavior.
     */
    @Override
    public void display() {
        System.out.println("Hi");
    }
}


/*
 * This class contains the main method.
 * Program execution starts from here.
 */
public class P150_Real_Abstraction {

    public static void main(String[] args) {

        /*
         * Creating object of ConcreteClass.
         * Reference type is the interface.
         * This is a real example of abstraction.
         */
        IncompleteComponent component = new ConcreteComponent();

        // Calling the abstract method using interface reference
        component.display();

        // Accessing interface variable
        System.out.println("Value of a is: " + IncompleteComponent.VALUE);

        /*
         * Expected Output:
         * Hi
         * Value of a is: 10
         */
    }
}
