package Java_Programs._33_Enum;

/*
 * This class demonstrates how ENUM values are accessed
 * and used during execution.
 */
public class P160_ENUM_Execution {

    public static void main(String[] args) {

        // Accessing locator value stored inside ENUM constant
        System.out.println(P159_ENUM_Locators.PAGE_BUTTON.getLocator());
        // Output: #btn

        // Accessing another locator value from ENUM
        System.out.println(P159_ENUM_Locators.PAGE_INPUT.getLocator());
        // Output: #input1

        // Accessing HEX color code from another ENUM
        System.out.println(P161_ENUM_Colors.RED.getHexCode());
    }
}
