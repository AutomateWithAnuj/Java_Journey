package Java_Programs._24_OOPs_Inheritance.SingleInheritance;

// This class contains common functionalities
// that can be shared by all test classes
public class P127_CommonToAll_Inheritance {

    // Method to start the browser
    void startBrowser() {
        System.out.println("Browser started");
    }

    // Method to close the browser
    void closeBrowser() {
        System.out.println("Browser closed");
    }

    // Method to read data from an Excel file
    void readExcelFile() {
        System.out.println("Reading data from Excel file");
    }

    // Method to read data from a Database
    void readDatabaseFile() {
        System.out.println("Reading data from Database");
    }
}
