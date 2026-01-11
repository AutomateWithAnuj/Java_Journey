package Java_Programs._37_Collection_Framework_DSA.Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Demonstrates sorting custom objects using Comparable
 */

/**
 * Student class implementing Comparable to define natural sorting order
 */
class Student implements Comparable<Student> {

    // Instance variables (kept private for encapsulation)
    private int rollNo;
    private String name;
    private int age;

    // Constructor to initialize Student object
    public Student(int rollNo, String name, int age) {
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
    }

    /**
     * Used automatically when object is printed
     */
    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", name=" + name +
                ", age=" + age +
                '}';
    }

    /**
     * Defines how two Student objects should be compared
     * Current logic: sort by name in ascending order
     */
    @Override
    public int compareTo(Student other) {

        // String comparison using compareTo (lexicographical order)
        return this.name.compareTo(other.name);

        // Other valid options (only one at a time):
        // return this.rollNo - other.rollNo; // sort by roll number
        // return this.age - other.age;       // sort by age
    }
}

public class P205_Comparable {

    public static void main(String[] args) {

        // Creating Student objects
        Student s1 = new Student(101, "Anuj", 24);
        Student s2 = new Student(104, "Amit", 55);
        Student s3 = new Student(103, "Pramod", 35);

        // List to store Student objects (type-safe using generics)
        List<Student> students = new ArrayList<>();

        // Adding objects to the list
        students.add(s1);
        students.add(s2);
        students.add(s3);

        // Sorting the list
        // Works because Student implements Comparable<Student>
        Collections.sort(students);

        // Printing sorted list
        // Output will be sorted based on name (Amit, Anuj, Pramod)
        System.out.println(students); // [Student{rollNo=104, name=Amit, age=55}, ...]
    }
}
