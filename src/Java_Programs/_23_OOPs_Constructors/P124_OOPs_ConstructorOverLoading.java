package Java_Programs._23_OOPs_Constructors;

// Car3 class
class Car3 {

    // Instance variables
    String name;
    int year;
    String model;

    // Constructor with 3 parameters
    Car3(String name, int year, String model) {

        // 'this' refers to the current object
        this.name = name;
        this.year = year;
        this.model = model;
    }

    // Constructor with 2 parameters
    Car3(String name, int year) {

        // model is not set here, so it remains null
        this.name = name;
        this.year = year;
    }

    // Default constructor (no parameters)
    Car3() {

        // Assigning default values manually
        name = "Anuj";
        year = 2024;
        model = "xyz";
    }

    // Instance method
    void running() {

        // 'this.name' ensures correct object name is used
        System.out.println(this.name + " is Running");
    }
}

public class P124_OOPs_ConstructorOverLoading {

    public static void main(String[] args) {

        // 1️⃣ Object created using default constructor
        Car3 c = new Car3();

        // 2️⃣ Object created using parameterised constructor (3 parameters)
        Car3 c2 = new Car3("Anshul", 2025, "i20");

        // Printing values of the first object
        System.out.println(c.name);   // Anuj
        System.out.println(c.year);   // 2024
        System.out.println(c.model);  // xyz

        // Printing values of the second object
        System.out.println(c2.name);  // Anshul
        System.out.println(c2.year);  // 2025
        System.out.println(c2.model); // i20

        // 3️⃣ Object created using parameterised constructor (2 parameters)
        Car3 c3 = new Car3("Amit", 2025);

        // Printing values of the third object
        System.out.println(c3.name);  // Amit
        System.out.println(c3.year);  // 2025
        System.out.println(c3.model); // null (not initialized)

        // Calling method for all objects
        c.running();
        c2.running();
        c3.running();
    }
}

