package Java_Programs._22_OOPs.Inheritance.MultiLevelInheritance;

public class P131_Multilevel_Inheritance {
    public static void main(String[] args) {
        Son s1 = new Son();
        s1.gf();
        s1.f();
        s1.s();

        Father f1 = new Father();
        f1.gf();
        f1.f();

        Grandfather gf1 = new Grandfather();
        gf1.gf();

        //Son s2 = new Grandfather();//this is not possible
        //because son was not present when grandfather was born
        //Son s2 = new Father(); /this is not possible
        //because son was not present when grandfather was born
        Son s3 = new Son();
        //this is possible because son is present when son was born
        Grandfather gf2 = new Son();
        //gf2.s(); //Parent reference cannot access the children methods
        //this is possible because grandfather was their when Son was born
        Grandfather gf3 = new Father();
        //this is possible because grandfather was their when Father was born
        //like this
        Father f4 = new Son();

        //this concept is heavily used in case of selenium

        //let us do the method overloading and check
        Grandfather gf4 = new Son();
        gf4.home();
        // it will always go with the objects for functions in method overriding
        //else it can only access the functions whose reference are created
        gf4.gf();
    }
}

