package Java_Programs._24_OOPs_Inheritance.MultiLevelInheritance;

// Middle-level class in Multilevel Inheritance
// Father inherits properties from Grandfather
public class Father extends Grandfather {

    // Method representing Father's own property
    void fatherHouse() {
        System.out.println("Father owns a 2BHK house");
    }

    // Overriding the home() method of Grandfather
    @Override
    void familyHome() {
        System.out.println("Father's version of the family home");
    }
}
