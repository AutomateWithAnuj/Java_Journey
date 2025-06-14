package Java_Programs._10_UserInput;

public class P032_Taking_Input_From_User_CLI_Arguments {
    public static void main(String[] args) {
        //age = 23 -> Minor (age<18), Adult (age>18), Senior (age>65)

        //taking an input from user - CLI arguments
        String age = args[0];//fetching first element given in edit config. arguments
        System.out.println(age);
        System.out.println(age instanceof String); //it is string we need to convert it to int

        int I_age = Integer.parseInt(age); //wrapper class or the type conversions

        String result = (I_age<18)?"Minor":((I_age>65)?"Senior":"Adult");
        System.out.println(result);

        //if 2 values are given on the place of 1 value required in program through CLI
        // then you can take only one value also no error we will get
    }
}
