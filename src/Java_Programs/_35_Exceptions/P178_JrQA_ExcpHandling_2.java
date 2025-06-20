package Java_Programs._35_Exceptions;

public class P178_JrQA_ExcpHandling_2 {
    public static void main(String[] args) {
        try {
            String ip = args[0];
            int a = Integer.parseInt(ip);
            int b = 100/a;
            System.out.println(b);
        } catch (Exception e) { //we can use it if we have the 0 idea of what exception it can throw
            System.out.println(e.getMessage());
        }
    }
}
