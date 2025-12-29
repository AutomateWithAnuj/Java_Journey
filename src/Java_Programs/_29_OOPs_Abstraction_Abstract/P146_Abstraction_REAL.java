package Java_Programs._29_OOPs_Abstraction_Abstract;

/*
 * Abstract class Employee
 *
 * - Represents a generic employee
 * - Contains common properties and behaviors
 * - Cannot be instantiated
 */
abstract class Employee {

    // Encapsulated fields
    private String name;
    private String address;
    private int number;

    // Default constructor
    Employee() {
    }

    // Parameterized constructor
    public Employee(String name, String address, int number) {
        this.name = name;
        this.address = address;
        this.number = number;
    }

    /*
     * Abstract method:
     * - Salary calculation differs for each employee type
     * - So implementation is deferred to child classes
     */
    abstract double computePay();

    /*
     * Concrete method:
     * - Common behavior for all employees
     */
    void mainCheck() {
        System.out.println("Mailing a check to " + name + " at " + address);
        // OUTPUT: Mailing a check to Anuj at Delhi
    }
}

/*
 * Concrete class C1
 *
 * - Extends Employee
 * - Must implement computePay()
 */
class C1 extends Employee {

    // Constructor calling parent constructor
    public C1(String name, String address, int number) {
        super(name, address, number);
    }

    @Override
    double computePay() {
        // Sample salary calculation
        return 50000.0;
    }
}


/*
 * This program demonstrates ABSTRACTION using a real-world example.
 *
 * Scenario:
 * - Employee is a general concept
 * - Salary calculation differs for different employee types
 * - So, computePay() is kept abstract
 */

public class P146_Abstraction_REAL {

    public static void main(String[] args) {

        /*
         * Creating reference of abstract class Employee
         * and object of concrete child class C1
         */
        Employee emp = new C1("Anuj", "Delhi", 101);

        // Calling concrete method from abstract class
        emp.mainCheck();
        // Mailing a check to Anuj at Delhi

        // Calling implemented abstract method
        double salary = emp.computePay();
        System.out.println("Salary = " + salary);
        // OUTPUT: Salary = 50000.0
    }
}
