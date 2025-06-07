package Java_Programs._21_Arrays;

import java.util.Arrays;

public class P113_MatrixEqualityCheck_2D_or_More {
    public static void main(String[] args) {
        int[][] a1 = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] a2 = {{1,2,3},{4,5,6},{7,8,9}};
        boolean areEqual = Arrays.deepEquals(a1,a2);
        System.out.println(areEqual?"Yes they are equal":"No they are not equal");
    }
}
