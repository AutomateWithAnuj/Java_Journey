package Java_Programs._13_Inc_Dec_Operators;

public class P036_Inc_Dec_Op_Guess_Output {
    public static void main(String[] args) {

        // ----------------------- 1 -----------------------
        int a = 10;
        System.out.println(a++ + a); 
        // Expression: a++ + a
        // Step A: a++ → returns 10, then a becomes 11
        // Step B: a   → returns 11
        // 10 + 11 = 21

        /* Execution Table
            Part | Value Returned | a (after) 
            ----------------------------------
             a++ |      10        |   11
             a   |      11        |   11
            Output = 21
        */


        // ----------------------- 2 -----------------------
        a = 10;
        System.out.println(a++ + ++a); 
        // a++  → returns 10, then a = 11
        // ++a  → increments first → a = 12, returns 12
        // 10 + 12 = 22

        /* Execution Table
            Part  | Value Returned | a (after) 
            -----------------------------------
             a++  |      10        |   11
             ++a  |      12        |   12
            Output = 22
        */


        // ----------------------- 3 -----------------------
        a = 10;
        System.out.println(++a + ++a); 
        // First ++a → a = 11, return 11
        // Second ++a → a = 12, return 12
        // 11 + 12 = 23

        System.out.println(a);  // a is now 12

        /* Execution Table
            Part  | Value Returned | a (after)
            ----------------------------------
             ++a  |      11        |   11
             ++a  |      12        |   12
            Output = 23
            Final a = 12
        */


        // ----------------------- 4 -----------------------
        a = 10;
        System.out.println(++a + a++ + a++);
        // Step 1: ++a  → a = 11, return 11
        // Step 2: a++  → return 11, then a = 12
        // Step 3: a++  → return 12, then a = 13
        // 11 + 11 + 12 = 34

        System.out.println(a); // Final value: 13

        /* Execution Table
            Part  | Value Returned | a (after)
            -----------------------------------
             ++a  |      11        |   11
             a++  |      11        |   12
             a++  |      12        |   13
            Output = 34
            Final a = 13
        */
    }
}
