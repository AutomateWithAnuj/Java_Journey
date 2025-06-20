package Java_Programs._36_Generics;

public class P186_Non_Generics {
    public static void main(String[] args) {
        int c = temp_sum(3,4);
        //we need to use the method overloading to have sum of 3.34+4.45 or Anuj+Rajput
        //method overloading is not a single function to have all 3 functionality
        double d = temp_sum(3.45,4.45);
        String s = temp_sum("Anuj","Rajput");
    }
    static int temp_sum(int a, int b){
        return a+b;
    }
    static double temp_sum(double a, double b){
        return a+b;
    }
    static String temp_sum(String a, String b){
        return a+b;
    }

}
