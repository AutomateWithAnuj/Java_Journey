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

        // Explicit Narrowing Conversion Example
        int a = 170;
        
        // Casting int (4 bytes) to byte (1 byte)
        // 170 in binary (int - 32 bits): 00000000 00000000 00000000 10101010
        // When converting to byte, only the last 8 bits are kept: 10101010
        // Since the first bit is 1, it represents a negative number in Two’s Complement
        
        byte b = (byte) a; // Allowed, but data loss occurs
        
        // To decode 10101010 (Two’s Complement):
        // 1) Invert bits: 10101010 → 01010101
        // 2) Add 1: 01010101 + 1 = 01010110 (binary)
        // 3) Convert binary to decimal: 64 + 16 + 4 + 2 = 86
        // 4) Apply negative sign → -86
        
        System.out.println(b); // Output: -86    }
}
