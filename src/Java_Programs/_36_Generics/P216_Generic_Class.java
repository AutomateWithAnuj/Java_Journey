package Java_Programs._36_Generics;

public class P216_Generic_Class {
    public static void main(String[] args) {
        Test<Integer> Integer_T = new Test<Integer>(5);
        System.out.println(Integer_T.obj);
        Test<Double> Double_T = new Test<Double>(5.3);
        System.out.println(Double_T.obj);
        Test<String> String_T = new Test<String>("Anuj");
        System.out.println(String_T.obj);

    }
}
class Test<T>{ //in this we have given generic before so after in this class no generics will be needed
    T obj;
    Test(T obj){
        this.obj = obj;
    }
    public T getObj(){
        return this.obj;
    }
}
