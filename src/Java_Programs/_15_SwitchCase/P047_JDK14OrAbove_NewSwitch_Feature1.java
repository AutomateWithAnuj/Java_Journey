package Java_Programs._15_SwitchCase;

public class P047_JDK14OrAbove_NewSwitch_Feature1 {
    public static void main(String[] args) {
        int itemCode = 001;
        switch (itemCode){
            case 001 -> System.out.println("001"); //here break statement is not required for oneliner
            case 002 -> System.out.println("001"); //here break statement is not required for oneliner
            case 003 -> System.out.println("001"); //here break statement is not required for oneliner
            default -> System.out.println("Default");
        }
    }
}
