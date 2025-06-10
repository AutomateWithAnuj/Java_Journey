package Java_Programs._32_Static;

public class P156_static_Web_Automation {
    public static void main(String[] args) {
        Automation a = new Automation();
        System.out.println(Automation.driver);
        //it is common across all test cases & it must be same
        //also that driver must be same for every
    }
}
class Automation{
    static String driver = "Chrome-Vxyz";
}
