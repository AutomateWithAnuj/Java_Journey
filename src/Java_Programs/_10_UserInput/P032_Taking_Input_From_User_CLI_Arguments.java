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
        System.out.println(age); 
        // Output: prints the exact value you pass as argument  
        // Example: If you enter 23 → Output: 23

        System.out.println(age instanceof String); 
        // Output: true (CLI arguments are always Strings)

        // Converting string input to integer using wrapper class
        int I_age = Integer.parseInt(age);

        // Ternary operator to decide category based on age
        String result = (I_age < 18) ? "Minor"
                       : ((I_age > 65) ? "Senior" : "Adult");

        System.out.println(result);
        // Output:
        // If age = 10 → Minor
        // If age = 23 → Adult
        // If age = 70 → Senior

        // Note:
        // If more than one argument is passed (ex: 23 45 67),
        // only args[0] is taken and no error occurs.
    }
}
