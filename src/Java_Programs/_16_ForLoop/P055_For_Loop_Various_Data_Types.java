package Java_Programs._16_ForLoop;

public class P055_For_Loop_Various_Data_Types {
    public static void main(String[] args) {
        //not advisable because most of the time integers are used for API and Web
        //reason behind that is the increment can only be done by integer
        for (long i = 1l; i<10; i++){
            System.out.println(i);
        }
        for (float f = 0.0f; f < 10.67; f++){
            System.out.println("Hi, Float -> "+f);
        }
    }
}
