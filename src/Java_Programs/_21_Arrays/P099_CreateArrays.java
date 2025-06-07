package Java_Programs._21_Arrays;

public class P099_CreateArrays {
    public static void main(String[] args) {
        int a = 10;
        int [] marks = {51, 100, 91, 87, 90, 91, 92};
        boolean [] is_married_people = {true,false,true};
        System.out.println(marks.length);
        System.out.println(marks[0]);
        System.out.println(marks[4]);
        //System.out.println(marks[10]); //ArrayIndexOutOfBoundsException
        //System.out.println(marks[-1]); //ArrayIndexOutOfBoundsException
    }
}
