package Java_Programs._35_Exceptions;

public class P179_SrQA_ExcpHandling {
    public static void main(String[] args) {
        try {
            String ip = args[0];
            int a = Integer.parseInt(ip);
            int b = 100/a;
        } catch (ArrayIndexOutOfBoundsException | NumberFormatException | ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}
