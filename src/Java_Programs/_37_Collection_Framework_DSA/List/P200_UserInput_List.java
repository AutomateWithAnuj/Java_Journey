package Java_Programs._37_Collection_Framework_DSA.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class P200_UserInput_List {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Multiple inputs from user and store them in separate
        //names, ages - store them
        ArrayList<String> names = new ArrayList();
        ArrayList<Integer> ages = new ArrayList();
        String continueInput = "Yes"; //Control variable for input loop
        while (continueInput.equalsIgnoreCase("Yes")){
            System.out.print("Enter Name: ");
            String name = sc.next();
            System.out.print("Enter Age: ");
            int age = sc.nextInt();
            names.add(name);
            ages.add(age);
            System.out.print("Do you want to input more names & their age(Yes/No): ");
            continueInput = sc.next();
        }
        System.out.print("Your Name Array is: ");
        Iterator iterator = names.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next()+" ");
        }
        System.out.println();
        System.out.print("Your Ages Array is: ");
        Iterator iterator2 = ages.iterator();
        while (iterator2.hasNext()){
            System.out.print(iterator2.next()+" ");
        }
        sc.close();
    }
}
