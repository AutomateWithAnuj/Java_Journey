package Java_Programs._35_Exceptions;

public class P168_Exception_Explained {
    public static void main(String[] args) {
        System.out.println("Starting the program");
        String input_user = args[0];
        int a = Integer.parseInt(input_user);
        int output = 100/a;
        System.out.println(output);
        //problems with this program
        //1. if you will not give any value you will get ArrayIndexOutOfBoundsException
        //2. if you will give 0 as value ArithmeticException: / by zero exception
        //3. if you will give non integer value it will give NumberFormatException

        //so this has 3 major problems these are the exceptions and we have to handle it
        //exception handling is responsible to give the best experience to user
    }
}
