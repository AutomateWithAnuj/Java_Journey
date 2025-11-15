package Java_Programs._15_SwitchCase;

public class P048_Switch_Output_Guess {
    public static void main(String[] args) {
        int a = 11;
        switch(-2){
            default:
                //it will only go in default if there is no match case for it else not
                //even if it's on top it's position doesn't matter
                System.out.println("Default");
                break;
            case -1:
                //it will not go in default it will still check the match case only
                System.out.println("10");
                break;
            case 11:
                System.out.println("11"); // it wil go inside this
                break; // and break it here
        }
    }
}
