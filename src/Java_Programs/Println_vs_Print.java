package Java_Programs;

public class Println_vs_Print {
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
        //Hello World Hello New World
    }
}
