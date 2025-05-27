package Java_Programs;

import java.util.Scanner;

public class P042_Triangle_Classifier {
    public static void main(String[] args) {
        //Write a program that classifies a triangle based on its side lenghts
        //Given three input values representing the length of the sides
        //determine if the triangle is equilateral (all sides are equal)
        //or isosceles (exactly 2 sides are equal)
        //or scalene (no sides are equal)
        //Use an if else statement to classify the triangle.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first side length: ");
        int a = sc.nextInt();
        System.out.print("Enter second side length: ");
        int b = sc.nextInt();
        System.out.print("Enter third side length: ");
        int c = sc.nextInt();
        System.out.printf("%d,%d,%d",a,b,c);
        System.out.println();
        if(a==b&&b==c){
            System.out.println("It is an equilateral triangle");
        } else if (a==b||b==c) {
            System.out.println("It is an isosceles triangle");
        } else{
            System.out.println("It is an scalene triangle");
        }
    }
}
