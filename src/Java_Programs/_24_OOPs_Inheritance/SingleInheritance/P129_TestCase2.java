package Java_Programs._24_OOPs_Inheritance.SingleInheritance;

// Test case class that inherits common functionalities
public class P129_TestCase2 extends P127_CommonToAll_Inheritance {

    // Method to execute Test Case 2
    void runTestCase2() {

        // Inherited method from parent class
        startBrowser();

        // Test case specific logic
        System.out.println("Running Test Case 2");

        // Using inherited utility methods
        readDatabaseFile();
        readExcelFile();

        // Inherited method from parent class
        closeBrowser();
    }
}
