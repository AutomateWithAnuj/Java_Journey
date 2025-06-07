package Java_Programs._21_Arrays;

import java.util.Arrays;

public class P106_2nd_HighestNo_Array {
    public static void main(String[] args) {
        int[] numbers = {12,34,10,1,100,3,4,32};
        //Easiest way
        Arrays.sort(numbers);
        System.out.println(numbers[numbers.length-2]);

        int Max = numbers[0];
        int Max2nd = numbers[0];
        for(int i=0;i<numbers.length;i++){
            if(Max<numbers[i]){
                Max = numbers[i];
            }
        }
        for(int i=0;i<numbers.length;i++){
            if(Max2nd<numbers[i] && Max!=numbers[i]){
                Max2nd = numbers[i];
            }
        }
        System.out.println("2nd Max value is: "+Max2nd);
    }
}
