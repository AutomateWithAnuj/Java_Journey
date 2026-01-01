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
