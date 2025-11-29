package Java_Programs._12_TypeCasting;

public class P028_Type_Casting {
    public static void main(String[] args) {
        //Implicit Widening
        byte b = 10;
        int a = b; //// byte → int (automatic)

        //Explicit Widening (not required but possible)
        b = 10;
        a = (int)b; // Explicit widening

        //Implicit Narrowing
        a = 170;
        //b = a; //not allowed because int is converted into a byte

        //Explicit Narrowing
        a = 170;
        b = (byte)a; //Allowed but data loss will occur
        System.out.println(b); //-86 based on taking only 1 Byte from 4 Bytes
    }
}
