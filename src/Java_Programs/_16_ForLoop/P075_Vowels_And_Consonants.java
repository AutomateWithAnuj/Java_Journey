package Java_Programs._16_ForLoop;

import java.util.Scanner;

public class P075_Vowels_And_Consonants {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Text: ");
        String s = sc.nextLine();
        int v=0,c=0;
        for (int i=0;i<s.length();i++){
            switch (s.charAt(i)){
                case 'A','E','I','O','U','a','e','i','o','u':
                    v++;
                    break;
                default:
                    c++;
                    break;
            }
        }
        System.out.printf("Your Text has %d vowels & %d Consonants",v,c);
    }
}
