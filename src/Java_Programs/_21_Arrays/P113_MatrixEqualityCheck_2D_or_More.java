package Java_Programs._21_Arrays;

import java.util.Arrays;

public class P113_MatrixEqualityCheck_2D_or_More {

    public static void main(String[] args) {

        // Example Input Matrices:
        // Matrix A:
        // 1 2 3
        // 4 5 6
        // 7 8 9
        //
        // Matrix B:
        // 1 2 3
        // 4 5 6
        // 7 8 9

        int[][] matrixA = { 
                {1, 2, 3}, 
                {4, 5, 6}, 
                {7, 8, 9} 
        };

        int[][] matrixB = { 
                {1, 2, 3}, 
                {4, 5, 6}, 
                {7, 8, 9} 
        };

        // deepEquals() is used to compare multidimensional arrays
        boolean areEqual = Arrays.deepEquals(matrixA, matrixB);

        // Display matrices
        System.out.println("Matrix A: " + Arrays.deepToString(matrixA));
        System.out.println("Matrix B: " + Arrays.deepToString(matrixB));
        System.out.println("--------------------------------------");

        // Final Result
        System.out.println(areEqual ? "Result: YES, both matrices are equal."
                                    : "Result: NO, matrices are NOT equal.");

        /*
         -------- Example Output --------

         Matrix A: [[1, 2, 3], [4, 5, 6], [7, 8, 9]]
         Matrix B: [[1, 2, 3], [4, 5, 6], [7, 8, 9]]
         --------------------------------------
         Result: YES, both matrices are equal.

         ----------------------------------------
        */
    }
}
