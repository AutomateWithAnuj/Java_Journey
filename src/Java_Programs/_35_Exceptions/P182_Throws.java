package Java_Programs._35_Exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class P182_Throws {
    public static void main(String[] args) throws Exception {
        //we have added throws FileNotFoundException which means it can throw that exception
        //throw will give the responsibility to the method
        FileReader f = new FileReader(new File("C://abc.txt"));
        String ip = args[0];
        int a = Integer.parseInt(ip);
        int b = 100/a;
    }
}
