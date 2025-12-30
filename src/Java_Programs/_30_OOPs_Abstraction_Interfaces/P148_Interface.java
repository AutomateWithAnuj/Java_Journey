package Java_Programs._30_OOPs_Abstraction_Interfaces;

/*
 * Brakes interface defines braking behavior.
 * It only tells WHAT needs to be done.
 */
interface Brakes {

    // Method to apply brakes
    void applyBrakes();
}

/*
 * Engine interface defines engine-related behavior.
 * It represents another capability of the car.
 */
interface Engine {

    // Method to start the engine
    void startEngine();

    // Method to stop the engine
    void stopEngine();

    /*
     * Default method (Java 8+ feature)
     * Interface can have method implementation using default keyword
     */
    default void engineTest() {
        System.out.println("Engine test completed");
    }
}

/*
 * Car class implements both Engine and Brakes interfaces.
 * This demonstrates multiple inheritance using interfaces.
 */
class Car implements Engine, Brakes {

    /*
     * Implementation of startEngine() from Engine interface
     */
    @Override
    public void startEngine() {
        System.out.println("Engine started");
    }

    /*
     * Implementation of stopEngine() from Engine interface
     */
    @Override
    public void stopEngine() {
        System.out.println("Engine stopped");
    }

    /*
     * Implementation of applyBrakes() from Brakes interface
     */
    @Override
    public void applyBrakes() {
        System.out.println("Brakes applied");
    }

    /*
     * High-level method exposed to the user.
     * User only calls drive(), not individual engine or brake methods.
     * This is a perfect example of Abstraction.
     */
    public void drive() {

        // Start the car
        startEngine();

        // Car is moving
        System.out.println("Car is moving");

        // Apply brakes
        applyBrakes();

        // Stop the engine
        stopEngine();
    }
}

/*
 * This class contains the main method.
 * Program execution starts from here.
 */
public class P148_Interface {

    public static void main(String[] args) {

        // Creating an object of Car class
        // We are only calling high-level operations
        // Internal working is hidden (Abstraction)
        Car car = new Car();

        // Calling the drive method
        car.drive();

        /*
         * Expected Output:
         * Engine started
         * Car is moving
         * Brakes applied
         * Engine stopped
         */
    }
}
