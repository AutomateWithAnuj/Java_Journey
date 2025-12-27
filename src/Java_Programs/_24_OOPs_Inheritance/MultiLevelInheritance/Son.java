package Java_Programs._24_OOPs_Inheritance.MultiLevelInheritance;

// Last-level child class in Multilevel Inheritance
// Son inherits from Father → Grandfather
public class Son extends Father {

    // Method representing Son's own property
    void sonHouse() {
        System.out.println("Son owns a 3BHK house");
    }

    // Overriding the familyHome() method again
    @Override
    void familyHome() {
        System.out.println("Son's version of the family home");
    }
}
