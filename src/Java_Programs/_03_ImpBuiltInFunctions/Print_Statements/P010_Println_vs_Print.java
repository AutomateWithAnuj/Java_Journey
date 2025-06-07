package Java_Programs._03_ImpBuiltInFunctions.Print_Statements;

public class P010_Println_vs_Print {
    public static void main(String[] args) {
        System.out.println("Hello World ");
        System.out.println("Hello New World");
        //Hello World
        //Hello New World

        System.out.println();

        System.out.println("Hello World ");
        System.out.print("Hello New World");
        //Hello World
        //Hello New World

        System.out.println();

        System.out.print("Hello World ");
        System.out.println("Hello New World");
        //Hello World Hello New Wor ld
    }
}
