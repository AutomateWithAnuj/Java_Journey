package Java_Programs._24_OOPs_Inheritance.MultiLevelInheritance;

public class P131_Multilevel_Inheritance {

    public static void main(String[] args) {

        // 1️⃣ Creating Son object with Son reference
        Son s1 = new Son();
        s1.grandfatherHouse(); // From Grandfather
        s1.fatherHouse();      // From Father
        s1.sonHouse();         // From Son

        // 2️⃣ Creating Father object with Father reference
        Father f1 = new Father();
        f1.grandfatherHouse(); // From Grandfather
        f1.fatherHouse();      // From Father

        // 3️⃣ Creating Grandfather object with Grandfather reference
        Grandfather gf1 = new Grandfather();
        gf1.grandfatherHouse();

        // ❌ Invalid cases (not allowed)
        // Son s2 = new Grandfather(); // Parent object cannot be assigned to child reference
        // Son s3 = new Father();      // Parent object cannot be assigned to child reference

        // 4️⃣ Child object with Parent reference (Upcasting) — VALID
        Grandfather gf2 = new Son();
        // gf2.sonHouse(); // ❌ Cannot access child-specific (non-overriden) methods
        gf2.familyHome();  // ✅ Calls Son's overridden method (runtime polymorphism)
        // Calling non-overridden method
        gf2.grandfatherHouse();

        // 5️⃣ Parent reference with Parent object
        Grandfather gf3 = new Father();
        gf3.familyHome();  // Calls Father's overridden method

        // 6️⃣ Father reference with Son object (Upcasting)
        Father f4 = new Son();
        f4.familyHome();   // Calls Son's overridden method

        // NOTE:
        // Method call depends on OBJECT type for the overridden methods, not REFERENCE type (for overridden methods)
        // Accessible methods depend on REFERENCE type

    }
}
