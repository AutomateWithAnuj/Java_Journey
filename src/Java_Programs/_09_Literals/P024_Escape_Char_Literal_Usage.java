package Java_Programs._09_Literals;

public class P024_Escape_Char_Literal_Usage {
    public static void main(String[] args) {
        char new_line = '\n';
        char tab_line = '\t';
        char back_space = '\b';
        char carriage_return = '\r';

        System.out.println("AnujRajput");                 // Output: AnujRajput

        System.out.println("Anuj"+new_line+"Rajput");     // Output:
                                                          // Anuj
                                                          // Rajput

        System.out.println("Anuj"+'\n'+"Rajput");         // Output:
                                                          // Anuj
                                                          // Rajput

        System.out.println("Anuj"+'\t'+"Rajput");         // Output: Anuj    Rajput  (tab space)

        System.out.println("Anuj"+'\b'+"Rajput");         // Output: AnuRajput  
                                                          // (backspace removes 'j')

        System.out.println("Anuj"+'\r'+"Rajput");         // Output: Rajput
                                                          // (\r brings cursor to start; Rajput overrides Anuj)

        System.out.println("Hi, This is a first line\n This is second line\n This is third line");
                                                          // Output:
                                                          // Hi, This is a first line
                                                          //  This is second line
                                                          //  This is third line

        char a1 = 'A'; // ASCII 65
        char b1 = 'B'; // ASCII 66
        System.out.println(a1+b1);                        // Output: 131

        // ----------------------------------------------
        // Get ASCII value of any character automatically
        // ----------------------------------------------
        char ch = 'Z';
        int asciiValue = (int) ch;                        // Casting char → int
        System.out.println("ASCII of " + ch + " is: " + asciiValue);
    }
}
