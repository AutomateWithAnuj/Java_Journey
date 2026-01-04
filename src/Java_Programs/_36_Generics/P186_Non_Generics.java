package Java_Programs._36_Generics;

/*
 * This class demonstrates **method overloading** (NOT generics).
 * Same method name `tempSum` is used with different parameter types.
 * The compiler decides which method to call based on argument types.
 */
public class P186_NonGenerics {

    public static void main(String[] args) {

        // Calls tempSum(int, int)
        int intResult = tempSum(3, 4);
        // intResult = 7
        System.out.println(intResult); // Output: 7

        // Calls tempSum(double, double)
        double doubleResult = tempSum(3.45, 4.45);
        // doubleResult = 7.9
        System.out.println(doubleResult); // Output: 7.9

        // Calls tempSum(String, String)
        String stringResult = tempSum("Anuj", "Rajput");
        // stringResult = "AnujRajput"
        System.out.println(stringResult); // Output: AnujRajput
    }

    /*
     * Adds two integers
     * Used when both arguments are of type int
     */
    static int tempSum(int a, int b) {
        return a + b; // returns integer addition
    }

    /*
     * Adds two double values
     * Used when both arguments are of type double
     */
    static double tempSum(double a, double b) {
        return a + b; // returns decimal addition
    }

    /*
     * Concatenates two strings
     * Used when both arguments are of type String
     */
    static String tempSum(String a, String b) {
        return a + b; // returns combined string
    }
}
