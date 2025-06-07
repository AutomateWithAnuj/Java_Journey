package Java_Programs._15_SwitchCase;

import java.util.Scanner;

public class P044_Real_Switch_Usage_Automation {
    public static void main(String[] args) {
        //taking input from CLI
        /*String browser = args[0]; // chrome
        System.out.println(browser);*/
        //Using the scanner class
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the browser name: ");
        String browser = sc.next();
        System.out.println(browser);

        switch (browser){
            case "chrome":
                System.out.println("Starting the chrome");
                System.out.println("........");
                System.out.println("TC1");
                System.out.println("TC2");
                break;
            case "Edge":
                System.out.println("Starting the Edge");
                System.out.println("........");
                System.out.println("TC1");
                System.out.println("TC2");
                break;
            case "Firefox":
                System.out.println("Starting the firefox");
                System.out.println("........");
                System.out.println("TC1");
                System.out.println("TC2");
                break;
            default:
                System.out.println("I have no Idea which browser is this");
                break;
        }
    }
}
