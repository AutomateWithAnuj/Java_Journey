package Java_Programs._20_Strings;

import java.util.Scanner;

public class P096_Palindrome_Way2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Text: ");
        String userInput = sc.next();
        String newString = reverseString(userInput);
        if(newString.equalsIgnoreCase(userInput)){
            System.out.println("Yes it is a palindrome");
        } else{
            System.out.println("It is not a palindrome");
        }
    }
    public static String reverseString(String s){
        String s2 = "";
        for (int i=s.length()-1;i>=0;i--){
            s2+=s.charAt(i);
        }
        return s2;
    }
}
