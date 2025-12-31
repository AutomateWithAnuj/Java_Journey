package Java_Programs._33_Enum;

/*
 * ENUM used to store UI locators as constants.
 * This is commonly used in automation frameworks
 * to keep locators centralized, readable, and reusable.
 */
public enum P159_ENUM_Locators {

    // ENUM constants with their respective locator values
    PAGE_BUTTON("#btn"),     // Locator for a button element
    PAGE_INPUT("#input1");   // Locator for an input field

    // Variable to store the locator value
    private final String locator;

    /*
     * Constructor of ENUM
     * Called automatically for each ENUM constant
     * Used to assign locator value to the variable
     */
    P159_ENUM_Locators(String locator) {
        this.locator = locator;
    }

    /*
     * Getter method to access locator value
     * Provides controlled and read-only access
     */
    public String getLocator() {
        return this.locator;
    }
}
