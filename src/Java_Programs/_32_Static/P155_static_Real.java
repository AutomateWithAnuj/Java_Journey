package Java_Programs._32_Static;

/**
 * Demonstrates real-life usage of:
 * - Static Initialisation Block (SIB)
 * - Instance Initialisation Block (IIB)
 * - Static vs Non-static members
 */

/**
 * Represents a training/automation class where:
 * - Static data is common to all
 * - Instance data is unique per object
 */
class AutomateWithAnuj {

    // Static Initialisation Block
    // Executes once when the class is loaded into memory
    static {
        System.out.println("Load the class?, I will execute"); // Printed once
    }

    // Instance Initialisation Block
    // Executes every time an object is created
    {
        System.out.println("IIB - this is called when object is created!");
        // Used for common setup logic before constructor execution
    }

    // Instance variables (unique for each object)
    private String name;
    private String phone;

    // Static variables (shared across all objects)
    static String courseName = "atb11x";  // Common course name
    static String mentorName = "Anuj";    // Common mentor name

    // Getter for name (encapsulation)
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for phone
    public String getPhone() {
        return phone;
    }

    // Setter for phone
    public void setPhone(String phone) {
        this.phone = phone;
    }

    // Static method: same for everyone, no object required
    static void doAssignment() {
        System.out.println("Do Assignments"); // Printed when method is called
    }

    // Non-static method: behavior can differ per object
    void howDoWeDoAssignment() {
        System.out.println("Different how everyone do"); // Object-specific behavior
    }
}

public class P155_Static_Real {

    public static void main(String[] args) {

        // Creating an object triggers:
        // 1) Class loading (SIB - only once)
        // 2) Instance creation (IIB - every object)
        AutomateWithAnuj s1 = new AutomateWithAnuj();

        // Setting instance (non-static) data for this object only
        s1.setName("s1");
        s1.setPhone("s2");

        // Accessing static variables using class name (best practice)
        System.out.println(AutomateWithAnuj.courseName);  // Output: atb11x
        System.out.println(AutomateWithAnuj.mentorName);  // Output: Anuj

        // Calling static method using class name (no object required)
        AutomateWithAnuj.doAssignment();                  // Output: Do Assignments
    }
}
