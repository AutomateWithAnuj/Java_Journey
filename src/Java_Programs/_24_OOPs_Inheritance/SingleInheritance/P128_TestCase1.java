package Java_Programs._24_OOPs_Inheritance.SingleInheritance;

public class P128_TestCase1 extends P127_CommonToAll_Inheritance{
    void runningTC1(){
        startBrowser();// One of the behaviour inherited from SuperClass
        //hypothetically they are also present here
        System.out.println("Running TC1");// One of the behaviour inherited from SuperClass
        closeBrowser();//hypothetically they are also present here
    }
}
