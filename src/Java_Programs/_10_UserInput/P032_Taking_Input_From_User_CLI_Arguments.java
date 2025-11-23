package Java_Programs._10_UserInput;

public class P032_Taking_Input_From_User_CLI_Arguments {
    public static void main(String[] args) {

        // Age categories:
        // Minor  -> age < 18
        // Adult  -> 18 to 65
        // Senior -> age > 65

        // Taking input from user through CLI (Command Line Arguments)
        // args[0] → first value passed in the "Edit Configurations" program arguments
        String age = args[0];
        System.out.println(age); // Prints the age received as a string

        System.out.println(age instanceof String); 
        // Confirms that CLI arguments are ALWAYS Strings

        // Converting string input to integer using wrapper class
        int I_age = Integer.parseInt(age);

        // Ternary operator to decide category based on age
        String result = (I_age < 18) ? "Minor" 
                       : ((I_age > 65) ? "Senior" : "Adult");

        System.out.println(result);

        // Note:
        // If more than one argument is passed (ex: 23 45 67),
        // and the program uses only args[0], it will still work without error.
        // Only unused values will be ignored.
    }
}
