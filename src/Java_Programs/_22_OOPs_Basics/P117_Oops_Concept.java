package Java_Programs._22_OOPs_Basics;

// A CLASS is a blueprint that defines structure (data + behaviour)
class Person {

    // -------- Attributes / Properties / Instance Variables --------
    // These variables define characteristics of every Person object.
    String name;
    String phone;
    String color_eyes;
    int legs;
    int hands;
    double salary;
    byte age;
    double weight;
    boolean isMale;

    // -------- Behaviours / Methods / Functions --------
    // Each behaviour represents what a Person can do.

    void sleep() {
        System.out.println("I am sleeping");
    }

    // Method with return type and parameter
    String greet(String name) {
        return "Hello " + name;
    }

    void talk() {
        // Empty method - can be defined later
    }

    // Method that performs a calculation and returns a result
    int tax_given(int salary, int tax) {
        return salary - tax;
    }
}

public class P117_Oops_Concept {
    public static void main(String[] args) {

        // Declaration of a reference variable (object is NOT created yet)
        Person Amit;  
        // Right now, 'amit' holds a reference placeholder (null by default).

        // To create an object in Java, we MUST use the 'new' keyword.
        // JVM always starts execution from main() method.
        Person p2 = new Person(); // Object creation
        p2.name = "Anuj"; // Assigning value to instance variable for this object
        System.out.println(p2.name); // Output: Anuj

        // Creating another object of the Person class
        Person p3 = new Person();
        p3.name = "Rajput";
        System.out.println(p3.name); // Output: Rajput

        new Person(); 
        // This creates an object, but we are not storing the reference,
        // so JVM will remove it with Garbage Collection (no use after creation).

        // NOTE: Even though attributes are the same in all Person objects,
        // each object stores separate values. (Object-level memory allocation)
    }
}
