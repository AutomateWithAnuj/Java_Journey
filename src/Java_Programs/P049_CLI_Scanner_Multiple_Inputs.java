package Java_Programs;

import java.util.Scanner;

public class P049_CLI_Scanner_Multiple_Inputs {
    public static void main(String[] args) {
        /*System.out.println("Enter name, age, salary");
        String name = args[0];
        int age = Integer.parseInt(args[1]);
        double salary = Double.parseDouble(args[2]);

        System.out.println(name);
        System.out.println(age);
        System.out.println(salary);*/

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name, age, salary");
        String name = sc.nextLine();
        int age = sc.nextInt();
        double salary = sc.nextDouble();

        //sc.close() here also we can close the scanner
        //it must be closed after when it's usage is over
        System.out.println("User Information");
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Salary: "+salary);

        sc.close(); //it is like a open tap in java when we are done we have to close it
        //ideal way is to close in end it's a good practice
    }
}
