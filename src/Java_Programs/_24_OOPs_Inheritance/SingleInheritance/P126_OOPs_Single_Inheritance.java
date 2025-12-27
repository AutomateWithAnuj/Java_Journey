package Java_Programs._24_OOPs_Inheritance.SingleInheritance;

// Parent class
class Parent {

    // Parent class method
    void parentProperty() {
        System.out.println("This property belongs to Parent class");
    }
}

// Child class extends Parent class
// This is called Single Inheritance (one parent → one child)
class Child extends Parent {

    // Child class method
    void childProperty() {
        System.out.println("This property belongs to Child class");
    }
}


public class P126_OOPs_Single_Inheritance {

    public static void main(String[] args) {

        // Creating object of Child class
        // Child object can access both Parent and Child class members
        Child c = new Child();

        c.parentProperty();   // Parent class method
        c.childProperty();    // Child class method
    }
}
