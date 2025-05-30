package Java_Programs;

public class P081_ReturningType_Functions {
    public static void main(String[] args) {
        //int result = anuj_f1(); it don't return any value so you cannot store it
        anuj_f1();;
        int result = anuj_f2();//we can store int value in this
        boolean b = anuj_f3();
        //main method don't return anything so you cannot store anything from it
    }
    static void anuj_f1(){

    }
    static int anuj_f2(){
        return 10;
    }
    static boolean anuj_f3(){
        return true;
    }
    static String anuj_f4(){
        return "anuj";
    }
    //Any datatype it can return
}
