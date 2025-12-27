package Java_Programs._24_OOPs_Inheritance.SingleInheritance;

// Test case class that inherits common functionalities
public class P128_TestCase1 extends P127_CommonToAll_Inheritance {

    // Method to execute Test Case 1
    void runTestCase1() {

        // startBrowser() is inherited from parent class
        startBrowser();

        // Test case specific logic
        System.out.println("Running Test Case 1");

        // closeBrowser() is inherited from parent class
        closeBrowser();
    }
}
