package Java_Programs._32_Static;

public class P152_StaticBlock {
    public static void main(String[] args) {
        P p1 = new P();
        P p2 = new P();
        P p3 = new P();
    }
}
class P{
    {
        System.out.println("IIB");
    }
    P(){
        System.out.println("DC");
    }
    static { //Static initialization block
        System.out.println("SIB");
    }

}
