package Java_Programs._32_Static;

/**
 * Demonstrates real-world usage of a static variable in web automation,
 * where a single WebDriver instance/configuration is shared across all tests.
 */


/**
 * Represents an automation setup class.
 * Static members are common and shared for the entire test suite.
 */
class Automation {

    // Static variable:
    // One driver configuration shared across all test cases and objects
    static String driver = "Chrome-Vxyz";
}

public class P156_Static_Web_Automation {

    public static void main(String[] args) {

        // Creating an object (not required to access static members,
        // but shown here to emphasize that static data is independent of objects)
        Automation automation = new Automation();

        // Accessing static variable using class name (best practice)
        System.out.println(Automation.driver); // Output: Chrome-Vxyz
        // Same driver is shared across all test cases and objects
    }
}

