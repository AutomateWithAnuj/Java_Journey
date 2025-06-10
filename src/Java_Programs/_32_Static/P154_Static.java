package Java_Programs._32_Static;

public class P154_Static {
    public static void main(String[] args) {
        B.commonToAll(); //As this is static it can be called without the
        //B.dispaly(); Not possible because it must be static
        System.out.println(B.b);
    }
}
class B{
    static {
        System.out.println("SIB, called once, class is loaded");
    }
    int a = 10;
    static int b= 10;
    void display(){
        System.out.println("Non Static");
    }
    static void commonToAll(){
        //System.out.println(a); //not possible because instance variable cannot be called inside static method
        System.out.println(b);
        System.out.println("Static");
    }
}
