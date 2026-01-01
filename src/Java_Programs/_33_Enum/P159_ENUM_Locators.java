package Java_Programs._33_Enum;

/*
 * ENUM used to store UI locators as constants.
 * Commonly used in automation frameworks to keep
 * locators centralized, readable, and reusable.
 */
public enum P159_ENUM_Locators {

    // ENUM constants with their respective locator values
    PAGE_BUTTON("#btn"),     // Locator for a button element
    PAGE_INPUT("#input1");   // Locator for an input field

    // Variable to store the locator value (immutable)
    private final String locator;

    /*
     * ENUM constructor
     * Automatically called once for each ENUM constant
     * Used to assign the locator value
     */
    P159_ENUM_Locators(String locator) {
        this.locator = locator;
    }

    /*
     * Getter method to access the locator value
     * Returns the locator as String
     */
    public String getLocator() {
        return this.locator;
    }
}

/*
🔹 What it is
An advanced enum
Each enum constant has:
A value ("#btn", "#input1")
A constructor
A getter method
🔹 What it stores
A key–value pair
PAGE_BUTTON → "#btn"
PAGE_INPUT → "#input1"
🔹 Typical use case
Automation frameworks=
UI locators
URLs
Config values
Anything constant + associated data
*/
/*
 * This class contains the main() method.
 * It demonstrates how to use the ENUM
 * and access its stored locator values.
 */
public class P159_ENUM_Locators_Execution {

    public static void main(String[] args) {

        // Printing locator for button element
        System.out.println(P159_ENUM_Locators.PAGE_BUTTON.getLocator());
        // Output: #btn

        // Printing locator for input element
        System.out.println(P159_ENUM_Locators.PAGE_INPUT.getLocator());
        // Output: #input1
    }
}
