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
/*🔹 What it is
A basic enum
Contains only constant names
No fields, no constructor, no methods
🔹 What it stores
Just identifiers, not values
Internally, each constant is just a single instance of ProjectUrls
🔹 Typical use case
When you need a fixed set of options
Example:
Project names
Status (PASS, FAIL)
Environments (DEV, QA, PROD)
*/
public class P158_ENUM_ProjectURLs {

    public static void main(String[] args) {

        // Printing a constant value from ENUM
        System.out.println(ProjectUrls.KATALON); // Output: KATALON
    }
}
