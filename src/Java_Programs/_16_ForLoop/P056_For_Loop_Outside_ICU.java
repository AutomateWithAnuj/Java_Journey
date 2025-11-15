package Java_Programs._16_ForLoop;

public class P056_For_Loop_Outside_ICU {
    public static void main(String[] args) {
        //yes outside initialisation is possible - for loop
        int i = 10; //initialization can be done outside also
        //boolean c = i>0; //it will not work if we use c in a for loop as a condition, because outside the loop, it cannot check every time 
        //Updating also cannot be done outside for loop; we have to do it  within the loop
        for(;i>10;i--){ //only initialization can be done outside nothing else
            System.out.println(i);
        }
    }
}
