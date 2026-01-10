package Java_Programs._37_Collection_Framework_DSA.List;

import java.util.ArrayList;
import java.util.List;

/**
 * Student class representing a simple student entity
 */
class Student {

    // Private fields for encapsulation
    private String name;
    private String rollNo;

    // Constructor to initialize Student object
    public Student(String name, String rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    // Getter and Setter methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRollNo() {
        return rollNo;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }

    /**
     * Prints student details to the console
     */
    public void Details() {
        System.out.println("Student Name: " + this.name);
        System.out.println("Student RollNo: " + this.rollNo);
    }
}

/**
 * Demonstrates storing custom Student objects in an ArrayList
 */
public class P202_Student_ArrayList {

    public static void main(String[] args) {

        // Creating Student objects
        Student s1 = new Student("Anuj", "13201");
        Student s2 = new Student("Amit", "13202");
        Student s3 = new Student("Avinash", "13203");

        // Creating an ArrayList to store Student objects
        List students = new ArrayList();

        // Adding Student objects to the list
        students.add(s1);
        students.add(s2);
        students.add(s3);

        // Printing the list
        // By default, it prints object references (because toString is not overridden)
        System.out.println(students);
        // Output: [Student@xxxx, Student@xxxx, Student@xxxx]

        // Printing details of each student using method call
        s1.Details();
        // Output:
        // Student Name: Anuj
        // Student RollNo: 13201

        s2.Details();
        // Output:
        // Student Name: Amit
        // Student RollNo: 13202

        s3.Details();
        // Output:
        // Student Name: Avinash
        // Student RollNo: 13203
    }
}
