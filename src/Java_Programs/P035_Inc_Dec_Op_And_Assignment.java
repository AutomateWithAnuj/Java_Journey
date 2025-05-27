package Java_Programs;

public class P035_Inc_Dec_Op_And_Assignment {
    public static void main(String[] args) {
        int a = 10;
        int b = ++a; // 1+10 = 11
        System.out.println(b); //11
        System.out.println(a); //11

        //Exp and Result Table
        //Line No | a | Result b
        //  5 | 10 | NA
        //  6 | 11 | 11
        //  7 | 11 | 11
        //  8 | 11 | 11

        int a1 = 10;
        int b1 = a1++; // 1+10 = 11
        System.out.println(b1); //10
        System.out.println(a1); //11

        int a2 = 10;
        int b2 = a--;
        System.out.println(b2); //10
        System.out.println(a2); //9

        int a3 = 10;
        int b3 = --a3;
        System.out.println(b3); //9
        System.out.println(a3); //9


    }
}
