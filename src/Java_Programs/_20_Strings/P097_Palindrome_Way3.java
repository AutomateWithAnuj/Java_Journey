package Java_Programs._20_Strings;

import java.util.Scanner;

public class P097_Palindrome_Way3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Text: ");
        String userInput = sc.next();
        StringBuilder stringBuilder = new StringBuilder(userInput);
        if(stringBuilder.reverse().toString().equalsIgnoreCase(userInput)){
            System.out.println("Yes it is a palindrome");
        } else{
            System.out.println("no it's not a palindrome");
        }
    }
}
