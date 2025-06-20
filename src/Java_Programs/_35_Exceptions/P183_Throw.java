package Java_Programs._35_Exceptions;

public class P183_Throw {
    public static void main(String[] args) {

    }
    static void divideByZero(int a){
        if(a==0){
            throw new ArithmeticException();
        }
    }
}
