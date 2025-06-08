package Java_Programs._25_OOPs_Polymorphism.MethodOverloading;

public class P134_Poly_MethodOverloading {
    public static void main(String[] args) {
        MathOperations m = new MathOperations();
        int S1 = m.add(2,3);
        float S2 = m.add(3.7f,5.9f);
        int S3 = m.add(2,3,4);
        System.out.println("S1: "+S1+", S2: "+S2+", S3: "+S3);
    }
}

class MathOperations{
    //In the same class
    //if you have methods with same name but with different arguments or return types
    int add(int a, int b){
        return a+b;
    }
    float add(float a,float b){
        return a+b;
    }
    int add(int a, int b, int c){
        return a+b+c;
    }

}
