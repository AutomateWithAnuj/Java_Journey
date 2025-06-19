package Java_Programs._34_Wrapper_classes;

public class P166_Wrapper_Conversion2 {
    public static void main(String[] args) {
        String num = "10";
        //convert this primitive datatype to integer
        //there is no way we have to use the wrapper classes

        //String to wrapper we can use parseX()
        Integer a = Integer.parseInt(num); //way1
        Integer b = Integer.valueOf(num);  //way2

        //wrapper to string
        System.out.println(a.toString());

        //integer to string
        int a2 = 10;

        //Primitive to String
        int age = 10;
        Integer age_wrapper = age;
        System.out.println(age_wrapper.toString());
    }
}