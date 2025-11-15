package Java_Programs._16_ForLoop;

import java.util.Scanner;

public class P076_Palindrome_Way1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Text: ");
        int n = 0;
        String s = sc.nextLine();
        for (int i=0;i<s.length()/2;i++){ //checking till half characters starting from 0th index
            if(s.charAt(i)==s.charAt(s.length()-1-i)){
                n++; //n is the number of characters that become equal
            }
        }
        if(n==s.length()/2){ //n must be equal to the half characters, then we can say it's a palindrome
            System.out.println("Yes it is a palindrome");
        } else {
            System.out.println("no it's not a palindrome");
        }
    }
}
