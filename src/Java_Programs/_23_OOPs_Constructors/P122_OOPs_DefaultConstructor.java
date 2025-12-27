package Java_Programs._23_OOPs_Constructors;

// Car class
class Car {

    // Instance variables (attributes)
    String name;
    int year;
    String model;

    // Default constructor
    Car() {

        // Constructor is used to initialise instance variables
        // This code runs automatically when an object is created

        name = "Anuj";
        year = 2024;
        model = "xyz";
    }
}

public class P122_OOPs_DefaultConstructor {

    public static void main(String[] args) {

        // Creating an object of Car class
        Car c1 = new Car();
        // 👉 Default constructor is called automatically

        // Printing instance variable values
        System.out.println(c1.name);   // "Anuj"
        System.out.println(c1.year);   // 2024
        System.out.println(c1.model);  // "xyz"

        // NOTE:
        // If we had NOT written a constructor:
        // name  → null
        // year  → 0
        // model → null
    }
}
