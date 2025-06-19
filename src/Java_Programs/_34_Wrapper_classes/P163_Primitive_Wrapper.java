package Java_Programs._34_Wrapper_classes;

public class P163_Primitive_Wrapper {
    public static void main(String[] args) {
        int a = 10; //primitive local variable as it is not defined under class it is under a method
        //This is not object
        //this will not have attributes or behaviours

        //byte, short, int, long, float, double, char, boolean - we will avoid these now

        //we will use the wrapper classes
        //Character, Boolean, Short, Long, Double, Float
        Integer age = 65;
        //System.out.println(a.); //if you will do this nothing will come as primitive datatypes don't have behaviours
        System.out.println(age.toString()); //here we have various functions we can use their are 100's of like this
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(age);//they can be used normally also
    }
}
