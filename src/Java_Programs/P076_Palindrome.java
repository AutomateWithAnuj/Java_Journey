package Java_Programs;

import java.util.Scanner;

public class P076_Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Text: ");
        int n = 0;
        String s = sc.nextLine();
        for (int i=0;i<s.length()/2;i++){
            if(s.charAt(i)==s.charAt(s.length()-1-i)){
                n++;
            }
        }
        if(n==s.length()/2){
            System.out.println("Yes it is a palindrome");
        } else {
            System.out.println("no it's not a palindrome");
        }
    }
}