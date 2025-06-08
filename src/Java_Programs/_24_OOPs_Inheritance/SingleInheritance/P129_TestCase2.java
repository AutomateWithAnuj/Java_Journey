package Java_Programs._24_OOPs_Inheritance.SingleInheritance;

public class P129_TestCase2 extends P127_CommonToAll_Inheritance {
    void runningTC2(){
        startBrowser();//hypothetically they are also present here
        System.out.println("Running TC2");
        readDatabaseFile();
        readExcelFile();
        closeBrowser();//hypothetically they are also present here
    }
}
