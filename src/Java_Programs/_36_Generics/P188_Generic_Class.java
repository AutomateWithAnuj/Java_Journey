package Java_Programs._36_Generics;

public class P188_Generic_Class {
    public static void main(String[] args) {
        GenericClass<Integer> intObject = new GenericClass<>(5);
        GenericClass<String> stringObject = new GenericClass<>("Anuj");

        //T is a placeholder it can have any datatype
    }
}
class GenericClass<T>{ //here in generic class we have to give generic After classname
    private T data;
    public GenericClass(T data){
        this.data = data;
    }
    public void setData(T data){
        this.data = data;
    }
    public T getData(){
        return this.data;
    } //so for generic class no need to mention genric again we can use it directly
}
