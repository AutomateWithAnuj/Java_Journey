package Java_Programs._25_OOPs_Polymorphism.MethodOverriding;

public class P135_MOverriding {

    public static void main(String[] args) {

        // Case 1: Parent reference → Child object (Runtime Polymorphism)
        Animal a1 = new Dog();
        a1.sound();   // Calls Dog's sound() at runtime

        // Case 2: Child reference → Child object
        Dog d1 = new Dog();
        d1.sound();   // Calls Dog's sound()

        // Case 3: Parent reference → Parent object
        Animal a2 = new Animal();
        a2.sound();   // Calls Animal's sound()
    }
}

/*
 * Parent class
 */
class Animal {

    // Method to be overridden
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

/*
 * Child class
 */
class Dog extends Animal {

    /*
     * Overriding the sound() method
     * - Same method name
     * - Same parameter list
     * - Same return type
     * - Access level cannot be reduced
     */
    @Override
    void sound() {
        System.out.println("Dog barks!");
    }
}
