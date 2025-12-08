package Java_Programs._21_Arrays;

import java.util.Arrays;

public class P112_MatrixEqualityCheck_1D {

    public static void main(String[] args) {
        
        // -------- Example Input --------
        // a1 = {1, 2, 3}
        // a2 = {1, 2, 3}
        // --------------------------------

        int[] array1 = {1, 2, 3};
        int[] array2 = {1, 2, 3};
        
        //to check if arrays are equal we can use this function
        boolean areEqual = Arrays.equals(array1, array2); 

        System.out.println("Array 1: " + Arrays.toString(array1));
        System.out.println("Array 2: " + Arrays.toString(array2));
        System.out.println("--------------------------------");
        System.out.println(areEqual ? "Result: YES, both arrays are equal." 
                                   : "Result: NO, arrays are NOT equal.");

        // -------- Expected Output --------
        // Array 1: [1, 2, 3]
        // Array 2: [1, 2, 3]
        // --------------------------------
        // Result: YES, both arrays are equal.
        // ------------------------------------
    }
}
