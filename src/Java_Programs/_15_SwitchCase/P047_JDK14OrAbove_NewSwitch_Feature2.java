package Java_Programs._15_SwitchCase;

public class P047_JDK14OrAbove_NewSwitch_Feature2 {
    public static void main(String[] args) {
        int itemcode = 006;
        switch (itemcode){
            case 001,002,003:
                System.out.println("This is Electronic Gadget");
                break;
            case 004,006,007:
                System.out.println("This is Mechanical Gadget");
                break;
            default:
                System.out.println("No Gadgets with this ID");
        }
    }
}
