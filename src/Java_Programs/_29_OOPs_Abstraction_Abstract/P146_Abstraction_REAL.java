package Java_Programs._29_OOPs_Abstraction_Abstract;

public class P146_Abstraction_REAL {
}
abstract class Employee{
    private String name;
    private String address;
    private int number;

    Employee(){ //it can have default constructors

    }

    public Employee(String name, String address, int number) {//it can have the parameterized constructor also
        this.name = name;
        this.address = address;
        this.number = number;
    }

    abstract double computePay(); //we can have a incomplete method

    void mainCheck(){ //we can also have a complete method
        System.out.println("Mailing a check to"+this.name+" "+this.address);
    }
}

class C1 extends Employee{
    @Override
    double computePay(){
        return 0.0;
    }
}
