package Java_Programs;

public class P028_Type_Casting {
    public static void main(String[] args) {
        //Implicit Widening
        byte b = 10;
        int a = b;

        //Explicit Widening
        b = 10;
        a = (int)b;

        //Implicit Narrowing
        a = 170;
        //b = a; //not allowed

        //Explicit Narrowing
        a = 170;
        b = (byte)a; //Allowed but data loss will occur
        System.out.println(b); //-86 based on taking only 1 Byte from 4 Bytes
    }
}
