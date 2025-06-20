package Java_Programs._35_Exceptions;

public class P175_Try_Catch_Finally {
    public static void main(String[] args) {
        int a = 1;
        int c = 0;
        try {
            //c = 10/0;
            c = 10/2;
            System.out.println(c);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("I will be always executed!");
        }
    }
}
