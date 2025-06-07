package Java_Programs._15_SwitchCase;

public class P046_Switch_With_Char {
    public static void main(String[] args) {
        char ch = 'A';
        switch(ch){
            case 65:
                System.out.println("MATCH ASCII");
                break;
            default:
                System.out.println("No Match");
        }
    }
}
