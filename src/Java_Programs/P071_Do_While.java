package Java_Programs;

public class P071_Do_While {
    public static void main(String[] args) {
        int a = 1;
        do{
            System.out.printf("This is the body which will execute at least 1 time, Run no: %d",a);
            System.out.println();
            a++;
        }while (a<10);
    }
}
