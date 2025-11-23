package Java_Programs._13_Inc_Dec_Operators;

public class P034_Inc_Dec_Op_with_mul_args {
    public static void main(String[] args) {

        // Taking inputs from command-line arguments
        String age = args[0];       // First argument → age
        String name = args[1];      // Second argument → name
        // String job = args[2];    // If we try to access this without passing args → ArrayIndexOutOfBoundsException

        // Converting age (String) to integer
        int BeforeAge1 = Integer.parseInt(age);

        // Copying the original age to restore later
        int BeforeAge2 = BeforeAge1;

        // --------------------------- PRE-INCREMENT ---------------------------
        // ++BeforeAge1 increases the value first, then returns it.
        // Example: age = 24 → pre-increment gives 25
        System.out.printf("%s Before age :%d, pre-increment: %d",
                name, BeforeAge1, ++BeforeAge1);
        System.out.println();

        // Reset back to original age (24)
        BeforeAge1 = BeforeAge2;

        // --------------------------- POST-INCREMENT ---------------------------
        // BeforeAge1++ returns the value first, then increases it.
        // Example: age = 24 → post-increment prints 24 (but becomes 25 internally)
        System.out.printf("%s Before age :%d, post-increment: %d",
                name, BeforeAge1, BeforeAge1++);
        System.out.println();

        // Reset again to original age (24)
        BeforeAge1 = BeforeAge2;

        // --------------------------- PRE-DECREMENT ---------------------------
        // --BeforeAge1 decreases the value first, then returns it.
        // Example: 24 → pre-decrement gives 23
        System.out.printf("%s Before age :%d, pre-decrement: %d",
                name, BeforeAge1, --BeforeAge1);
        System.out.println();

        // Reset again to original age (24)
        BeforeAge1 = BeforeAge2;

        // --------------------------- POST-DECREMENT ---------------------------
        // BeforeAge1-- returns the value first, then decreases it.
        // Example: 24 → post-decrement prints 24 (but becomes 23 internally)
        System.out.printf("%s Before age :%d, post-decrement: %d",
                name, BeforeAge1, BeforeAge1--);
    }
}
