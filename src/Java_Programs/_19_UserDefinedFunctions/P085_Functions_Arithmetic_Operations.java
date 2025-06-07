package Java_Programs._19_UserDefinedFunctions;

import java.util.Scanner;

public class P085_Functions_Arithmetic_Operations {
    public static void main(String[] args) {
        //create a Function of Sub, Sum, Mul, Div
        //with parameter a,b (take the parameter from the user)
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 values: ");
        int a=0,b=0;
        if(sc.hasNextInt()){ 
            a = sc.nextInt();
        }else{
            System.out.println("Enter the Integer value only");
            System.exit(0);
        }
        if(sc.hasNextInt()){
            b = sc.nextInt();
            if(b==0){
                System.out.println("2nd value must not be zero because Div by 0 is not allowed");
                System.exit(0);
            }
        }else{
            System.out.println("Enter the Integer value only");
            System.exit(0);
        }
        System.out.println("Sum is: "+add(a,b));
        System.out.println("Sub is: "+sub(a,b));
        System.out.println("Div is: "+div(a,b));
        System.out.println("Mul is: "+mul(a,b));
        System.out.println("Rem is: "+rem(a,b));
    }
    static int add(int a,int b){
        return  a+b;
    }
    static int sub(int a,int b){
        return Math.abs(a-b);
    }
    static float div(int a,int b){
        float d = (float)b;
        return a/d;
    }
    static int mul(int a,int b){
        return a*b;
    }

    static int rem(int a,int b){
        return a%b;
    }
}
