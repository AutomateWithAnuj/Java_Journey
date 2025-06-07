package Java_Programs._13_Inc_Dec_Operators;

public class P034_Inc_Dec_Op_with_mul_args {
    public static void main(String[] args) {
        //Taking inputs
        String age = args[0];
        String name = args[1];
        // String job = args[2]; // ArrayIndexOutOfBoundsException because not given in args
        int BeforeAge1 = Integer.parseInt(age);
        int BeforeAge2 = BeforeAge1;
        System.out.printf("%s Before age :%d, pre-increment: %d",name,BeforeAge1,++BeforeAge1);
        System.out.println();
        BeforeAge1 = BeforeAge2;
        System.out.printf("%s Before age :%d, post-increment: %d",name,BeforeAge1,BeforeAge1++);
        System.out.println();
        BeforeAge1 = BeforeAge2;
        System.out.printf("%s Before age :%d, pre-decrement: %d",name,BeforeAge1,--BeforeAge1);
        System.out.println();
        BeforeAge1 = BeforeAge2;
        System.out.printf("%s Before age :%d, post-decrement: %d",name,BeforeAge1,BeforeAge1--);
    }
}
