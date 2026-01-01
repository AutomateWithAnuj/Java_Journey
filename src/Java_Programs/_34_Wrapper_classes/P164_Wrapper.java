package Java_Programs._34_Wrapper_classes;

/**
 * This class demonstrates how wrapper classes
 * are used as object data types in real-world scenarios.
 */
class ATB1 {

    // Wrapper classes (objects) instead of primitives
    String name;        // Non-primitive (object)
    Long phone;         // Wrapper for long
    Integer age;        // Wrapper for int
    Double salary;      // Wrapper for double
    Float gst;          // Wrapper for float
    Boolean isMarried;  // Wrapper for boolean

    // Method to display all details
    void displayDetails() {
        System.out.println("Name: " + name);          // prints name
        System.out.println("Phone: " + phone);        // prints phone number
        System.out.println("Age: " + age);            // prints age
        System.out.println("Salary: " + salary);      // prints salary
        System.out.println("GST: " + gst);             // prints GST
        System.out.println("Married: " + isMarried);  // prints marital status
    }
}

/**
 * Entry class to demonstrate practical usage
 * of Wrapper classes.
 */
public class P164_Wrapper {

    /**
     * Program execution starts from here.
     */
    public static void main(String[] args) {

        // Creating object of ATB1 class
        ATB1 emp = new ATB1();

        // Assigning values using Wrapper classes
        emp.name = "Anuj";
        emp.phone = 9876543210L;
        emp.age = 25;
        emp.salary = 55000.75;
        emp.gst = 18.0f;
        emp.isMarried = false;

        // Displaying stored values
        emp.displayDetails();
        /*
         Output:
         Name: Anuj
         Phone: 9876543210
         Age: 25
         Salary: 55000.75
         GST: 18.0
         Married: false
        */
    }
}
