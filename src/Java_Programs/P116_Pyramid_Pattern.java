package Java_Programs;

import java.util.Scanner;

public class P116_Pyramid_Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        for (int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            int c=1;
            for(int k=1;k<2*n&&c<=i;k++){
                if(k%2!=0){
                    System.out.print("*");
                    c++;
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
