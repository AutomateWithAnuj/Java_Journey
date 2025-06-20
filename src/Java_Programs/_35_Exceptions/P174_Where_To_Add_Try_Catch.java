package Java_Programs._35_Exceptions;

public class P174_Where_To_Add_Try_Catch {
    public static void main(String[] args) {
        int c = 0;
        int b = 0;
        try {
            b = 10/c;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
