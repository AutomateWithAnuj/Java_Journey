package Java_Programs._35_Exceptions;

public class P170_NullPointerException {
    public static void main(String[] args) {
        String name = null;
        name.trim(); //java.lang.NullPointerException
    }
}
