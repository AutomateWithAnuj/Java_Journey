package Java_Programs._35_Exceptions;

public class P171_Handling_Exceptions {
    public static void main(String[] args) {
        int a = 0;
        try {
            a = 10/0;
        } catch (Exception e) { //if any problem occurs at line 7 line 8 will execute
            //Exception is a class in its reference we are taking the exception which it has thrown
            //that reference e will have all the methods you can check with e.
            System.out.println(e.getMessage());
        }
        System.out.println(a);
    }
}
