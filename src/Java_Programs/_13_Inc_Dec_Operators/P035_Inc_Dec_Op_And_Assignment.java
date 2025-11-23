package Java_Programs._13_Inc_Dec_Operators;

public class P035_Inc_Dec_Op_And_Assignment {
    public static void main(String[] args) {

        // ------------------ PRE-INCREMENT ------------------
        int a = 10;
        int b = ++a;  
        // Pre-increment: a becomes 11 first, then assigned to b

        System.out.println(b); // 11
        System.out.println(a); // 11

        /*  Execution Table for ++a
            Line | Expression | a(before) | a(after) | b
            ------------------------------------------------
             5   | int a=10   |   NA      |   10     | NA
             6   | b=++a      |   10      |   11     | 11
             7   | print(b)   |   11      |   11     | 11
             8   | print(a)   |   11      |   11     | 11
        */


        // ------------------ POST-INCREMENT ------------------
        int a1 = 10;
        int b1 = a1++; 
        // Post-increment: b1 gets 10 first, then a1 becomes 11

        System.out.println(b1); // 10
        System.out.println(a1); // 11

        /*  Execution Table for a1++
            Line | Expression | a1(before) | a1(after) | b1
            ------------------------------------------------
             14  | int a1=10  | NA         |   10      | NA
             15  | b1=a1++    | 10         |   11      | 10
             16  | print(b1)  | 11         |   11      | 10
             17  | print(a1)  | 11         |   11      | 11
        */


        // ------------------ POST-DECREMENT ------------------
        int a2 = 10;
        int b2 = a2--;  
        // Post-decrement: b2 gets 10 first, then a2 becomes 9

        System.out.println(b2); // 10
        System.out.println(a2); // 9

        /*  Execution Table for a2--
            Line | Expression | a2(before) | a2(after) | b2
            ------------------------------------------------
             21  | int a2=10  | NA         |   10      | NA
             22  | b2=a2--    | 10         |   9       | 10
             23  | print(b2)  | 9          |   9       | 10
             24  | print(a2)  | 9          |   9       | 9
        */


        // ------------------ PRE-DECREMENT ------------------
        int a3 = 10;
        int b3 = --a3;  
        // Pre-decrement: a3 becomes 9 first, then assigned to b3

        System.out.println(b3); // 9
        System.out.println(a3); // 9

        /*  Execution Table for --a3
            Line | Expression | a3(before) | a3(after) | b3
            ------------------------------------------------
             28  | int a3=10  | NA         |  10       | NA
             29  | b3=--a3    | 10         |   9       | 9
             30  | print(b3)  | 9          |   9       | 9
             31  | print(a3)  | 9          |   9       | 9
        */
    }
}
