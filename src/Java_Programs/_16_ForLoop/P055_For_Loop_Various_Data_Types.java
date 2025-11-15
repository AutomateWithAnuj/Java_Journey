package Java_Programs._16_ForLoop;

public class P055_For_Loop_Various_Data_Types {
    public static void main(String[] args) {

        // Primitive - Most Common
        System.out.println("---- int ----");
        for (int i = 0; i < 3; i++) {
            System.out.println("int: " + i);
        }

        System.out.println("---- long ----");
        for (long l = 1L; l <= 3L; l++) {
            System.out.println("long: " + l);
        }

        System.out.println("---- short ----");
        for (short s = 1; s <= 3; s++) {
            System.out.println("short: " + s);
        }

        System.out.println("---- byte ----");
        for (byte b = 1; b <= 3; b++) {
            System.out.println("byte: " + b);
        }

        System.out.println("---- char ----");
        for (char c = 'A'; c <= 'C'; c++) {
            System.out.println("char: " + c);
        }

        // Primitive - Less Common
        System.out.println("---- float ----");
        for (float f = 0.5f; f < 2.0f; f += 0.5f) {
            System.out.println("float: " + f);
        }

        System.out.println("---- double ----");
        for (double d = 0.0; d < 0.5; d += 0.25) {
            System.out.println("double: " + d);
        }

        System.out.println("---- boolean ----");
        for (boolean flag = true; flag; flag = false) {
            System.out.println("boolean: " + flag);
        }

        // Wrapper types
        System.out.println("---- Integer ----");
        for (Integer I = 0; I < 3; I++) {
            System.out.println("Integer: " + I);
        }

        System.out.println("---- Long ----");
        for (Long L = 1L; L <= 3L; L++) {
            System.out.println("Long: " + L);
        }

        System.out.println("---- Character ----");
        for (Character C = 'X'; C <= 'Z'; C++) {
            System.out.println("Character: " + C);
        }

        System.out.println("---- Double ----");
        for (Double D = 0.1; D < 0.4; D += 0.1) {
            System.out.println("Double: " + D);
        }

        // Reference types
        System.out.println("---- String ----");
        for (String s = "A"; s.equals("A"); s = "B") {
            System.out.println("String: " + s);
        }

        System.out.println("---- Object ----");
        for (Object obj = new Object(); obj != null; obj = null) {
            System.out.println("Object: " + obj.toString());
        }
    }
}
