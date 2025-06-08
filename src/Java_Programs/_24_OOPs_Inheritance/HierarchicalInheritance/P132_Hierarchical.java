package Java_Programs._24_OOPs_Inheritance.HierarchicalInheritance;

public class P132_Hierarchical {
    public static void main(String[] args) {
        Father f1 = new Father();
        Princy p1 = new Princy();
        Anuj a1 = new Anuj();
        Bhanu b1 = new Bhanu();
        p1.h1();
        f1.h1();
        a1.h1();
        b1.h1();
        a1.h2();
    }
}
class Father{
    void h1(){
        System.out.println("3BHK");
    }
}
class Anuj extends Father{
    void h2(){
        System.out.println("Anuj - House");
    }
}
class Princy extends Father{
    void h3(){
        System.out.println("Princy - House");
    }
}
class Bhanu extends Father{
    void h4(){
        System.out.println("Bhanu - House");
    }
}
