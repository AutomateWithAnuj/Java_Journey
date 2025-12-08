package Java_Programs._21_Arrays;

public class P102_Arrays_Max_Min {
    public static void main(String[] args) {
        // in this, we are trying to find out the max and min inside the array
        int[] array = {25,14,56,15,36,56,77,18,29,49};

        // Can we take input from the user for arrays? Yes, by using the Scanner class.

        // Initial values for Max and Min are set to the first element of the array
        int Max = array[0];
        int Min = array[0];

        // Loop through the array to compare each element
        for (int i = 0; i < array.length; i++) {
            if (array[i] > Max) {
                Max = array[i];
            } else if (array[i] < Min) {
                Min = array[i];
            }
        }

        System.out.println("Max value is: " + Max);
        System.out.println("Min value is: " + Min);
    }
}
