package Java_Programs._25_OOPs_Polymorphism.MethodOverriding;

/*
 * Base class
 * Contains common behaviour for all browsers
 */
class CommonToAll {

    void openBrowser() {
        System.out.println("Open the default browser (IE)");
    }
}

/*
 * Chrome-specific test case
 */
class ChromeTC extends CommonToAll {

    @Override
    void openBrowser() {
        System.out.println("Open the Chrome Browser");
    }
}

/*
 * Firefox-specific test case
 */
class FireFoxTC extends CommonToAll {

    @Override
    void openBrowser() {
        System.out.println("Open the Firefox Browser");
    }
}


public class P136_MOverriding_InAutomation {

    public static void main(String[] args) {

        // Case 1: Child reference → Child object
        ChromeTC chrome = new ChromeTC();
        chrome.openBrowser();   // Chrome implementation

        FireFoxTC firefox = new FireFoxTC();
        firefox.openBrowser();  // Firefox implementation

        System.out.println("----------------------------");

        // Case 2: Parent reference → Child object (Dynamic Method Dispatch)
        CommonToAll browser1 = new ChromeTC();
        browser1.openBrowser(); // Chrome version executes

        CommonToAll browser2 = new FireFoxTC();
        browser2.openBrowser(); // Firefox version executes

        // ❌ Not allowed: Parent object cannot be assigned to child reference
        // ChromeTC cf = new FireFoxTC(); // Compile-time error
    }
}
