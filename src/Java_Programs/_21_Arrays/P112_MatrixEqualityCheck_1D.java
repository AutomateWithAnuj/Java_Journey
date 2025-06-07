package Java_Programs._21_Arrays;

import java.util.Arrays;

public class P112_MatrixEqualityCheck_1D {
    public static void main(String[] args) {
        int[] a1 = {1,2,3};
        int[] a2 = {1,2,3};
        boolean areEqual = Arrays.equals(a1,a2);
        System.out.println(areEqual?"Yes they are equal":"No they are not equal");
    }
}
