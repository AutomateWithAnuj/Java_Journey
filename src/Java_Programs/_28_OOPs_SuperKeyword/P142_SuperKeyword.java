package Java_Programs._28_OOPs_SuperKeyword;

class Vehicle {

    // Parent class variable
    public int maxSpeed = 180;

    // Getter
    public int getMaxSpeed() {
        return maxSpeed;
    }

    // Setter
    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    // Default constructor
    Vehicle() {
        System.out.println("Vehicle Default Constructor");
    }

    // Parameterized constructor
    Vehicle(int a) {
        System.out.println("Vehicle Parameterized Constructor");
    }

    // Method overloading
    void message() {
        System.out.println("Vehicle Message: No arguments");
    }

    void message(int a) {
        System.out.println("Vehicle Message: With argument");
    }

    // Normal method
    void display() {
        System.out.println("Vehicle Parent Display Method");
    }
}

class Car extends Vehicle {

    // Child class variable (same name as parent)
    private int maxSpeed = 281;

    // Default constructor
    Car() {
        super(); // calls Vehicle's default constructor
    }

    // Parameterized constructor
    Car(int a) {
        super(a); // calls Vehicle's parameterized constructor
    }

    // Method overriding
    @Override
    void display() {

        // this → current (child) class variable
        System.out.println(this.maxSpeed);

        // super → parent class variable
        System.out.println(super.maxSpeed);

        // Calling parent class methods
        super.message();
        super.message(10);

        System.out.println("Car Overridden Display Method");
    }
}


public class P142_SuperKeyword {
    public static void main(String[] args) {

        // Creating Car object
        Car c1 = new Car(100);

        // Calling overridden method
        c1.display();
    }
}

//output flow
/*
Vehicle Parameterised Constructor
281
180
Vehicle Message: No arguments
Vehicle Message: With argument
Car Overridden Display Method
*/
