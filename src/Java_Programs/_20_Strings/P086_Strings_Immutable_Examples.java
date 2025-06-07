package Java_Programs._20_Strings;

public class P086_Strings_Immutable_Examples {
    public static void main(String[] args) {
        String name = "Anuj";
        name.toUpperCase(); //ANUJ
        System.out.println(name); //Anuj
        //here only the previous value is printed let us see why
        //ANUJ and Anuj both values will be in string pool
        //but for name to point ANUJ it has to be assigned to new value
        //So when we perform any operation on string it will create 2 strings
    }
}
