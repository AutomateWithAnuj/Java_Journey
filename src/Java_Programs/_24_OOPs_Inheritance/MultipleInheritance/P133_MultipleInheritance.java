package Java_Programs._24_OOPs_Inheritance.MultipleInheritance;

public class P133_MultipleInheritance {

    public static void main(String[] args) {

        // Multiple inheritance using classes is NOT allowed in Java
        // A class cannot extend more than one class

        // ❌ This is NOT allowed:
        // class Child extends Parent1, Parent2 { }

        System.out.println("Multiple inheritance using classes is not supported in Java.");
        System.out.println("This avoids ambiguity and the Diamond Problem.");

        // ✅ Solution: Use interfaces
        System.out.println("Java supports multiple inheritance using interfaces.");
    }
}
