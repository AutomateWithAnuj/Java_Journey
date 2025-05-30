package Java_Programs;

public class P082_Functions_Reusability {
    public static void main(String[] args) {
        int r1 = sum_of_two_numbers(2,3);
        System.out.println(r1);
        int r2 = sum_of_two_numbers(5,6);
        System.out.println(r2);
        //So you can see here we are reusing the functions and that's why we use them
        //we can use functions any number of times when there is a need.
        //they can perform same task multiple times just we have to call them
    }
    static int sum_of_two_numbers(int a, int b){
        //main("Anuj","Rajput"); //we can call main method here but it's not easy and confuse JVM
        return a+b;
    }
}
