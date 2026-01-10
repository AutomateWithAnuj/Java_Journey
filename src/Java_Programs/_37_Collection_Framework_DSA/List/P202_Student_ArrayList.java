package Java_Programs._37_Collection_Framework_DSA.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Student class representing a simple student entity
 */
class Student {

    private String name;
    private String rollNo;

    public Student(String name, String rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public String getRollNo() {
        return rollNo;
    }

    // Method to print student details
    public void Details() {
        System.out.println("Student Name: " + name);
        System.out.println("Student RollNo: " + rollNo);
        System.out.println("---------------------");
    }
}

/**
 * Demonstrates storing and iterating Student objects in an ArrayList
 */
public class P202_Student_ArrayList {

    public static void main(String[] args) {

        Student s1 = new Student("Anuj", "13201");
        Student s2 = new Student("Amit", "13202");
        Student s3 = new Student("Avinash", "13203");

        // Use GENERICS (important for interviews)
        List<Student> students = new ArrayList<>();

        students.add(s1);
        students.add(s2);
        students.add(s3);

        // ------------------------------------
        // 1️⃣ Using Iterator (MOST IMPORTANT)
        // ------------------------------------
        System.out.println("Using Iterator:");
        Iterator<Student> itr = students.iterator();
        while (itr.hasNext()) {
            Student s = itr.next();
            s.Details();
        }

        // ------------------------------------
        // 2️⃣ Using Enhanced for-each loop
        // ------------------------------------
        System.out.println("Using For-Each Loop:");
        for (Student s : students) {
            s.Details();
        }

        // ------------------------------------
        // 3️⃣ Using a traditional for loop
        // ------------------------------------
        System.out.println("Using Traditional For Loop:");
        for (int i = 0; i < students.size(); i++) {
            students.get(i).Details();
        }

        // ------------------------------------
        // 4️⃣ Using forEach() + Lambda (Java 8+)
        // ------------------------------------
        System.out.println("Using forEach + Lambda:");
        students.forEach(s -> s.Details());
    }
}
