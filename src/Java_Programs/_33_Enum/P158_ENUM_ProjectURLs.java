package Java_Programs._33_Enum;

/*
 * This program demonstrates the use of ENUM
 * to store fixed project-related constant values.
 */

/*
 * ENUM is used to define a fixed set of constants.
 * These values are:
 * - Type-safe
 * - Read-only (cannot be modified)
 * - Easy to use and maintain
 */
enum ProjectUrls {
    GOOGLE,
    REST_ASSURED,
    KATALON,
    VWO
}

public class P158_ENUM_ProjectURLs {

    public static void main(String[] args) {

        // Printing a constant value from ENUM
        System.out.println(ProjectUrls.KATALON); // Output: KATALON
    }
}
