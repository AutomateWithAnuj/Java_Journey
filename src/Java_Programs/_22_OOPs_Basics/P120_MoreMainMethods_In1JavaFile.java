package Java_Programs._22_OOPs_Basics;

public class P120_MoreMainMethods_In1JavaFile {
    //yes it is possible we can create more main methods in different classes
    //only possible in java JDK>13
    public static void main(String[] args) {
        System.out.println("Bye");
    }
}
//For JVM they will be treated only as the separate class only
//Also each class will have their own attribute and behaviour
class P120_Copy{
    public static void main(String[] args) {
        System.out.println("Hi");
    }
}
//we can run only 1 at a time not more than that
//if you will run full only one will run which the class name was having
//otherwise they will run them separately
//this concept will not be used much in out automation framework
//because one main method is more than enough
