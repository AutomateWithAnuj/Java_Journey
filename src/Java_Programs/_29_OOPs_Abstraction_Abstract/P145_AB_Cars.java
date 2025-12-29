package Java_Programs._29_OOPs_Abstraction_Abstract;

/*
 * Abstract class Engine
 *
 * - Acts as a blueprint for all car engines
 * - Contains only method declarations (what to do)
 * - Does not provide implementation (how to do)
 */
abstract class Engine {

    // Abstract method: must be implemented by child classes
    abstract void startEngine();

    // Abstract method: must be implemented by child classes
    abstract void stopEngine();
}

/*
 * i10 class extends Engine
 *
 * - It is a concrete class
 * - Provides implementation for all abstract methods
 * - Represents a real car
 */
class i10 extends Engine {

    @Override
    void startEngine() {
        System.out.println("i10 engine is starting...");
    }

    @Override
    void stopEngine() {
        System.out.println("i10 engine is stopping...");
    }
}


/*
 * This program demonstrates ABSTRACTION using an ABSTRACT CLASS.
 *
 * Real-life scenario:
 * - An Engine defines what actions a car must perform
 * - How the engine starts or stops is hidden from the user
 */

public class P145_AB_Cars {

    public static void main(String[] args) {

        // Creating object of concrete class i10
        i10 car = new i10();

        // Calling methods defined by abstract class
        car.startEngine();
        car.stopEngine();

        /*
         * Abstract class reference pointing to child object
         * (Runtime Polymorphism)
         */
        Engine engine = new i10();
        engine.startEngine();
        engine.stopEngine();
    }
}
