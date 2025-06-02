package Java_Programs;

public class P102_Arrays_Max_Min {
    public static void main(String[] args) {
        int[] array = {25,14,56,15,36,56,77,18,29,49};
        //Can we take the input from the user also for Arrays? Yes
        //Max & Min
        int Max = array[0];
        int Min = array[0];
        for (int i=0;i<array.length;i++){
            if(array[i]>Max){
                Max=array[i];
            } else if (array[i]<Min) {
                Min=array[i];
            }
        }
        System.out.println("Max value is: "+Max);
        System.out.println("Min value is: "+Min);
    }
}
