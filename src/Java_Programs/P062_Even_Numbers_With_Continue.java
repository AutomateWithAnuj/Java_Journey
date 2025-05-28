package Java_Programs;

public class P062_Even_Numbers_With_Continue {
    public static void main(String[] args) {
        for (int i=1;i<=50;i++){
            if(i%2!=0){
                continue;
            }
            System.out.print(i+" ");
        }
    }
}
