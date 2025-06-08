package Java_Programs._22_OOPs.Polymorphism.MethodOverriding;

public class P136_MOverriding_InAutomation {
    public static void main(String[] args) {
        ChromeTC c1 = new ChromeTC();
        c1.openBrowser();
        FireFoxTC f1 = new FireFoxTC();
        f1.openBrowser();

        //Dynamic Dispatch
        CommonToAll c2 = new ChromeTC();
        c2.openBrowser();

        //ChromeTC cf = new FireFoxTC();

    }
}
class CommonToAll{
    void openBrowser(){
        System.out.println("Open the IE Browser!");
    }
}
class ChromeTC extends CommonToAll{
    @Override
    void openBrowser(){
        System.out.println("Open the Chrome Browser!");
    }
}
class FireFoxTC extends CommonToAll{
    @Override
    void openBrowser(){
        System.out.println("Open the FireFox Browser!");
    }
}
