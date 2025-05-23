package Java_Programs;

public class P011_Multiple_main_methods {
    public static void main(String[] args) { //JVM will only recognise this
        System.out.println("Final");
    }

    public static void main(String args) {
        System.out.println("string");
    }
    public static void main(int args) {
        System.out.println("int"); 
    }
}
