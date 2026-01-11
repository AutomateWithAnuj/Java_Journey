package Java_Programs._37_Collection_Framework_DSA.Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Demonstrates sorting custom objects using Comparator
 * Different sorting logics are defined outside the Student class
 */

/**
 * Plain Student class
 * Does NOT implement Comparable
 * Sorting logic is provided externally using a Comparator
 */
class Student {

    // Private fields for encapsulation
    private int rollNo;
    private String name;
    private int age;

    // Constructor to initialize Student object
    public Student(int rollNo, String name, int age) {
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
    }

    // Getter methods used by Comparator classes
    public int getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    /**
     * Used automatically when Student object is printed
     */
    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", name=" + name +
                ", age=" + age +
                '}';
    }
}

public class P206_Comparator {

    public static void main(String[] args) {

        // Creating Student objects
        Student s1 = new Student(101, "Anuj", 24);
        Student s2 = new Student(104, "Amit", 55);
        Student s3 = new Student(103, "Pramod", 35);

        // List to store Student objects
        List<Student> students = new ArrayList<>();

        // Adding students to the list
        students.add(s1);
        students.add(s2);
        students.add(s3);

        // Sorting by Age using AgeComparator
        Collections.sort(students, new AgeComparator());
        System.out.println("Sort by Age: " + students);
        // Output: Students sorted in ascending order of age

        // Sorting by Name using NameComparator
        Collections.sort(students, new NameComparator());
        System.out.println("Sort by Name: " + students);
        // Output: Students sorted alphabetically by name

        // Sorting by Roll Number using RollNoComparator
        Collections.sort(students, new RollNoComparator());
        System.out.println("Sort by RollNo: " + students);
        // Output: Students sorted in ascending order of roll number
    }
}

/**
 * Comparator to sort Student objects by age
 */
class AgeComparator implements Comparator<Student> {

    @Override
    public int compare(Student s1, Student s2) {
        return s1.getAge() - s2.getAge(); // ascending order by age
    }
}

/**
 * Comparator to sort Student objects by name
 */
class NameComparator implements Comparator<Student> {

    @Override
    public int compare(Student s1, Student s2) {
        return s1.getName().compareTo(s2.getName()); // alphabetical order
    }
}

/**
 * Comparator to sort Student objects by roll number
 */
class RollNoComparator implements Comparator<Student> {

    @Override
    public int compare(Student s1, Student s2) {
        return s1.getRollNo() - s2.getRollNo(); // ascending order by roll number
    }
}
