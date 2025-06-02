package Java_Programs;

public class P104_Reverse_Array {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5};
        //5,4,3,2,1 we want from this
        for (int i=0;i<=numbers.length/2;i++){
            int temp = numbers[numbers.length-1-i];
            numbers[numbers.length-1-i]=numbers[i];
            numbers[i]=temp;
        }
        for (int i=0;i<numbers.length;i++){
            System.out.print(numbers[i]+" ");
        }

    }
}
