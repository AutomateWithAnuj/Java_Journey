package Java_Programs._23_OOPs_Constructors;

// Car2 class
class Car2 {

    // Instance variables
    String name;
    int year;
    String model;

    //Parameterised constructor
    Car2(String name, int year, String model) {

        // 'this' refers to the current object
        // Left side  → instance variables
        // Right side → constructor parameters

        this.name = name;
        this.year = year;
        this.model = model;
    }
}

public class P123_OOPs_ParamConstructor {

    public static void main(String[] args) {

        // Creating an object using a parameterised constructor
        // Values are passed at the time of object creation
        Car2 c2 = new Car2("Anuj", 2025, "i20");

        // Printing instance variable values
        // These values come from the constructor arguments
        System.out.println(c2.name);   // Anuj
        System.out.println(c2.year);   // 2025
        System.out.println(c2.model);  // i20
    }
}
