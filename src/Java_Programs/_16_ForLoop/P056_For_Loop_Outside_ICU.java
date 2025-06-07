package Java_Programs._16_ForLoop;

public class P056_For_Loop_Outside_ICU {
    public static void main(String[] args) {
        //yes outside initializtion is possible - for loop
        int i = 10; //initialization can be done outside also
        //boolean c = i>0; //it will not work if we will use c in for loop so Condition cannot be given
        //Updating also cannot be done outside for loop
        for(;i>10;i--){ //only initialization can be done outside nothing else
            System.out.println(i);
        }
    }
}
