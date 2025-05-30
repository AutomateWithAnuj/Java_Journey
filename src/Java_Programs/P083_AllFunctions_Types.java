package Java_Programs;

public class P083_AllFunctions_Types {
    public static void main(String[] args) {
        //Without parameter without return type.
        //Without parameters but with return type.
        //With parameters and without return type.
        //With parameters and with return type.
        f1();
        String s = f2();
        System.out.println(s);
        f3(3,4);
        System.out.println("Sum is: "+f4(3,4,5));
    }
    //1. Without parameter without return type
    static void f1(){
        System.out.println("Hi, How are you");
    }
    //2. Without parameters but with return type
    static String f2(){
        return "Hi, How are you";
    }
    //3.With Parameter and without return type
    static void f3(int a,int b){
        System.out.println("Sum is: "+(a+b));
    }
    //4.With parameters and with return type.
    static int f4(int a,int b, int c){
        return a+b+c;
    }
}
