package Java_Programs._22_OOPs.Inheritance;

public class P125_OOPs_SingleInheritance {
    public static void main(String[] args) {
        Father f1 = new Father();
        System.out.println(f1.gold_f);
        f1.bhk2();

        Son s1 = new Son();
        s1.bhk3();

        //but we know that son can access father things so we can extend it
        //so after extending Son can access everything father has
        s1.bhk2();
        System.out.println(s1.gold_f);

        //but father can't access what son has
        //if you try to extend father from son then it is not possible
        //both class cannot extend each other that is not possible we will get an error


    }
}

class Father{
    int gold_f = 1000; //Attributes //DataVariable //Properties //Instance Variables

    void bhk2(){ //Behavior //Function //Method //DataMembers
        System.out.println("Father - 2BHK");
    }
}

class Son extends Father{
    //extends means all the code present into the father class will be accessible by the Son
    //Hypothetically we have to understand that Son will have all the code of Fathers class has
    void bhk3(){
        System.out.println("Son - 3BHK");
    }
}
