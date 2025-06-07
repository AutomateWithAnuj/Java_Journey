package Java_Programs._09_Literals;

public class P024_Escape_Char_Literal_Usage {
    public static void main(String[] args) {
        char new_line = '\n';
        char tab_line = '\t';
        char back_space = '\b';
        char carriage_return = '\r';

        System.out.println("AnujRajput");
        System.out.println("Anuj"+new_line+"Rajput");
        System.out.println("Anuj"+'\n'+"Rajput");
        System.out.println("Anuj"+'\t'+"Rajput");
        System.out.println("Anuj"+'\b'+"Rajput");
        System.out.println("Anuj"+'\r'+"Rajput");

        System.out.println("Hi, This is a first line\n This is second line\n This is third line");

        char a1 = 'A'; //ASCII -> 65
        char b1 = 'B'; // 66
        System.out.println(a1+b1);
    }
}
