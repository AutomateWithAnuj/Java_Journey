package Java_Programs;

public class P072_While_Vs_Do_While_Diff {
    public static void main(String[] args) {
        int a=0;
        while (a<0){
            System.out.println(a); //will not execute
            a++;
        }
        do{
            System.out.println(a); //will execute once
            a++;
        }while (a<0);
    }
}
