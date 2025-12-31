package Java_Programs._33_Enum;

/*
 * ENUM used to represent colors with their HEX codes.
 * Each ENUM constant is mapped to a fixed HEX value.
 */
public enum P161_ENUM_Colors {

    // ENUM constants with associated HEX color codes
    RED("#FF0000"),       // Red color HEX code
    GREEN("#61FF33"),     // Green color HEX code
    BLUE("#3377FF"),      // Blue color HEX code
    YELLOW("#4477FF");    // Yellow color HEX code

    // Variable to store the HEX code for each color
    private final String hexCode;

    /*
     * ENUM constructor
     * Automatically called for each ENUM constant
     * Used to assign HEX code to the variable
     */
    P161_ENUM_Colors(String hexCode) {
        this.hexCode = hexCode;
    }

    /*
     * Getter method to access the HEX code
     * Returns the HEX value of the color
     */
    public String getHexCode() {
        return this.hexCode;
    }
}
