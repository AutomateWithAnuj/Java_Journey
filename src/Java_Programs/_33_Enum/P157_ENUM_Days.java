package Java_Programs._33_Enum;

/*
 * This class uses a String array to store days.
 * This approach is NOT recommended because:
 * - Values can be modified accidentally
 * - No type safety
 * - Index-based access can cause errors
 */
class A {

    // Array holding day names (acts like constants but is unsafe)
    String[] days = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};
}

/*
 * ENUM represents a fixed set of constants.
 * - Values are final and cannot be changed
 * - No object creation required
 * - More readable and safer than arrays
 */
enum Day {
    SUNDAY,
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY
}

/*
 * This program demonstrates why ENUM is a better choice
 * than using a String array for fixed constant values like days.
 */
public class P157_ENUM_Days {

    public static void main(String[] args) {

        // Printing a value using ENUM (type-safe and fixed constants)
        System.out.println(Day.FRIDAY);   // Output: FRIDAY

        // Printing a value using normal class + String array
        A a = new A();                    // Object creation is required
        System.out.println(a.days[6]);    // Output: Sun
    }
}
