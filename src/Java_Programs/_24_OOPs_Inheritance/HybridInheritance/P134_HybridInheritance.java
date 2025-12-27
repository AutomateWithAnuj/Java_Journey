package Java_Programs._24_OOPs_Inheritance.HybridInheritance;

// Base class
class GrandFather {
    void grandFatherProperty() {
        System.out.println("GrandFather - Land");
    }
}

// Multilevel inheritance
class Father extends GrandFather {
    void fatherProperty() {
        System.out.println("Father - House");
    }
}

// Interface for multiple inheritance
interface Mother {
    void motherProperty();
}

// Hybrid inheritance (class + interface)
class Son extends Father implements Mother {

    public void motherProperty() {
        System.out.println("Mother - Gold");
    }

    void sonProperty() {
        System.out.println("Son - Job & Education");
    }
}

public class P134_HybridInheritance {
    public static void main(String[] args) {

        Son s1 = new Son();
        s1.grandFatherProperty();
        s1.fatherProperty();
        s1.motherProperty();
        s1.sonProperty();
    }
}
