package Java_Programs._23_OOPs_Constructors;

// Baby class
class Baby {

    // Instance variable (attribute)
    String name;  
    // 👉 Default value is null (assigned automatically by JVM)

    // Instance methods (behaviour)
    void cry() {
        System.out.println("Cry!!");
    }

    void sleep() {
        System.out.println("Sleep!");
    }

    void eat() {
        System.out.println("Eat!!");
    }

    // Default constructor
    Baby() {

        // This constructor is called automatically whenever
        // an object of Baby class is created

        System.out.println("I am the default constructor");
    }

public class P121_OOPs_DefaultConstructors {

    public static void main(String[] args) {

        // When an object is created using 'new', the constructor is called automatically
        Baby b1 = new Baby();  
        // 👉 Default constructor is called here (1st time)

        // Creating an object without assigning it to a variable
        // Constructor will still be called
        new Baby();            
        // 👉 Default constructor is called here (2nd time)

        // Only declaring a reference variable
        // No object is created, so constructor is NOT called
        Baby b2;               

        // NOTE:
        // Constructor is called ONLY when an object is created using 'new'
    }
}
