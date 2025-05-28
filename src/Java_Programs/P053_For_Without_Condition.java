package Java_Programs;

public class P053_For_Without_Condition {
    public static void main(String[] args) {
        for (int i = 0; ; i++){
            System.out.println(i); //never ending loop
        } //you will get exit code 130 it means stop by yourself - kill - Red button used to interrupt the program
        // exit code 0 - Successful
    }
}
