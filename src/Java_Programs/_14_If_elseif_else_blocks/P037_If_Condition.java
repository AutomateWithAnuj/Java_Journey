package Java_Programs._14_If_elseif_else_blocks;

public class P037_If_Condition {
    public static void main(String[] args) {
        int age = Integer.parseInt(args[0]);
        if(age>18){
            System.out.println("Yes you can Vote");
        }else{
            System.out.println("You Can't Vote");
        }
    }
}
