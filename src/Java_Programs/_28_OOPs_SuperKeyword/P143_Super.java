package Java_Programs._28_OOPs_SuperKeyword;

// Parent class
class Animal {

    // Protected variable → accessible in child class
    protected String color = "White";

    // Parent class method
    void sound() {
        System.out.println("Animal Sound!");
    }
}

// Child class
class Dog extends Animal {

    // Child class variable with SAME NAME as parent
    private String color = "Black";

    void display() {

        // this.color → refers to CURRENT class variable
        System.out.println(this.color);   // Output: Black

        // super.color → refers to PARENT class variable
        System.out.println(super.color);  // Output: White

        // super.sound() → calls PARENT class method
        super.sound();                    // Output: Animal Sound!
    }
}


public class P143_Super {
    public static void main(String[] args) {

        // Creating object of child class
        Dog dog = new Dog();

        // Calling child class method
        dog.display();
    }
}
