package Java_Programs._37_Collection_Framework_DSA.List;

import java.util.ArrayList;
import java.util.List;

public class P202_Student_ArrayList {
    public static void main(String[] args) {
        Student s1 = new Student("Anuj","13201");
        Student s2 = new Student("Amit","13202");
        Student s3 = new Student("Avinash","13203");
        List students = new ArrayList();
        students.add(s1);
        students.add(s2);
        students.add(s3);
        System.out.println(students);//it will print the refrence of it
        s1.Details();
        s2.Details();
        s3.Details();
    }

}
class Student{
    private String name;
    private String rollNo;

    public Student(String rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

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
    public void Details(){
        System.out.println("Student Name: "+this.name);
        System.out.println("Student RollNo: "+this.rollNo);
    }
}