package Java_Programs._35_Exceptions;

public class P177_JrQA_ExcpHandling_1 {
    public static void main(String[] args) {

        String ip = null; //ArrayIndexOutOfBoundsException
        try {
            ip = args[0];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
        int a = 0; //NumberFormatException
        try {
            a = Integer.parseInt(ip);
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        }
        int b = 0; //ArithmeticException
        try {
            b = 100/a;
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(b);
    }
}
