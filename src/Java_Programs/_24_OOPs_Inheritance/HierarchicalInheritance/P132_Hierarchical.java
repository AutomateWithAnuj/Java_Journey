package Java_Programs._24_OOPs_Inheritance.HierarchicalInheritance;

// Base class
class Father {
    void h1() {
        System.out.println("Father - 3BHK House");
    }
}

// Child classes
class Anuj extends Father {
    void h2() {
        System.out.println("Anuj - Own House");
    }
}

class Princy extends Father {
    void h3() {
        System.out.println("Princy - Own House");
    }
}

class Bhanu extends Father {
    void h4() {
        System.out.println("Bhanu - Own House");
    }
}

public class P132_Hierarchical {
    public static void main(String[] args) {

        Father f1 = new Father();
        Anuj a1 = new Anuj();
        Princy p1 = new Princy();
        Bhanu b1 = new Bhanu();

        // Common property from Father
        f1.h1();
        a1.h1();
        p1.h1();
        b1.h1();

        // Individual properties
        a1.h2();
        p1.h3();
        b1.h4();
    }
}
