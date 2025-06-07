package Java_Programs._07_Debuging;

public class P040_Debug_Java_Program {
    public static void main(String[] args) {
        //let's debug this program
        int a = 10;
        if(a==4){ //let us put the debug point here
            // if you will debug you will get another window having Threads & Variables
            // having args = {String[0]@937} [] //a = 10
            //you can evaluate that the value of a into that window also like write a==4 -> False
            //click next again and again it will finish the program
            System.out.println("haha");
        } else {
            System.out.println("hoho");
        }
    }
}
