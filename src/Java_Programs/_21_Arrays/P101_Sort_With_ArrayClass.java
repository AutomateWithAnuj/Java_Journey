package Java_Programs._21_Arrays;

import java.util.Arrays;

public class P101_Sort_With_ArrayClass {
    public static void main(String[] args) {

        // Array with unsorted values
        int[] marks = {51, 100, 91, 87, 90, 91, 92};

        // Arrays.sort() is a built-in method that sorts elements in ascending order (small → large)
        Arrays.sort(marks);

        // Printing sorted array elements
        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i] + " ");
        }
        /*
            Output: 51 87 90 91 91 92 100

            Reason:
            Arrays.sort() rearranges the array in ascending order.
            Original array: 51, 100, 91, 87, 90, 91, 92
            Sorted array:   51, 87, 90, 91, 91, 92, 100
        */
    }
}
