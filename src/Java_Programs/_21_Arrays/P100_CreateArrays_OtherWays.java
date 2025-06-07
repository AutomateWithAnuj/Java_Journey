package Java_Programs._21_Arrays;

public class P100_CreateArrays_OtherWays {
    public static void main(String[] args) {
        int[] marks2 = new int[5];
        int marks3[] = new int[5];
        //these both are valid
        String[] names = new String[3];
        names[0] = "anuj";
        names[1] = "amit";
        names[2] = "goutam";

        System.out.println(marks2[0]);//it will give us the address of that array
        for (int i=0;i<names.length;i++){
            System.out.println(names[i]);
        }
    }
}
