package Java_Programs._35_Exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class P181_GuessOutput {
    public static void main(String[] args) {
        try {
            FileReader f = new FileReader(new File("C://abc.txt"));
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
