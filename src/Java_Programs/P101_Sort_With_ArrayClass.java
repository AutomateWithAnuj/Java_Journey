package Java_Programs;

import java.util.Arrays;

public class P101_Sort_With_ArrayClass {
    public static void main(String[] args) {
        int [] marks = {51, 100, 91, 87, 90, 91, 92};
        Arrays.sort(marks);
        for (int i=0;i<marks.length;i++){
            System.out.print(marks[i]+" "); //51 87 90 91 91 92 100 sorted in ascending order
        }
    }
}
