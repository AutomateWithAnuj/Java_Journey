package Java_Programs._17_WhileLoop;

import java.util.Random;
import java.util.Scanner;

public class P069_While_Guessing_Game_Random {
    public static void main(String[] args) {
        //Guess a number between 1 and 100
        Random random = new Random(); //using random utility in java to create a randome number
        int numberToGuess = random.nextInt(100)+1;//it will give values from 0 to 99, so we can add 1
        Scanner sc = new Scanner(System.in); //lets suppose you are trying to guess that number

        int guess;
        int attempts = 0;
        while (true){
            System.out.print("Enter a number: ");
            guess = sc.nextInt();
            if(guess>numberToGuess){
                System.out.println("Too Big, Try Again");
            } else if (guess<numberToGuess) {
                System.out.println("Too Low, Try Again");
            }
            else{
                System.out.printf("you have guessed the right number in %d attempt",attempts+1);
                break;
            }
            attempts++;
        }
    }
}
