package Java_Programs._08_Variables;

public class P015_Variables {
    public static void main(String[] args) {
        // data_type variable_name/identifier = variable_value/literal

        byte b = 10; //store only integer value but limited from -128 to 127.
        //so 10 is an integer literal assigned to the byte type of container
//        b = 128; out of limit
        b=55+1;
        System.out.println(b);
    }
    //System.out.println(b);
    //you cannot get b here outside the curly braces not allowed
}
