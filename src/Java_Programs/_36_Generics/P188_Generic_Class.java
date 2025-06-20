package Java_Programs._36_Generics;

public class P188_Generic_Class {
    public static void main(String[] args) {
        GenericClass<Integer> intObject = new GenericClass<>(5);
        GenericClass<String> stringObject = new GenericClass<>("Anuj");

        //T is a placeholder it can have any datatype
    }
}
class GenericClass<T>{
    private T data;
    public GenericClass(T data){
        this.data = data;
    }
    public void setData(T data){
        this.data = data;
    }
    public T getData(){
        return this.data;
    }
}
