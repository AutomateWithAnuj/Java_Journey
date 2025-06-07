package Java_Programs._16_ForLoop;

public class P057_PrintAll_Even_1to50 {
    public static void main(String[] args) {
        //to find the even numbers from 1 to 50
        for (int i=1;i<=50;i++){
            if(i%2==0){
                System.out.print(i+" ");
            }
        }
    }
}
