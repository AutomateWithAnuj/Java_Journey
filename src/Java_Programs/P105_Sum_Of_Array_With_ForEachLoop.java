package Java_Programs;

public class P105_Sum_Of_Array_With_ForEachLoop {
    public static void main(String[] args) {
        int[] numbers = {12,34,10};
        int Sum = 0;
        for (int i=0;i<numbers.length;i++){
            Sum = Sum+numbers[i];
        }
        //Using for each loop also called enhanced for loop
        System.out.println("Sum is: "+Sum);
        int s = 0;
        for (int e:numbers){
            s = s + e;
        }
        System.out.println(s);
    }
}
