package Java_Programs._37_Collection_Framework_DSA.Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class P206_Comparator {
    public static void main(String[] args) {
        Student s1 = new Student(101, "Anuj",24);
        Student s2 = new Student(104, "Amit",55);
        Student s3 = new Student(103, "Pramod",35);
       List<Student> sl = new ArrayList<>();
        sl.add(s1);
        sl.add(s2);
        sl.add(s3);
        //Collections.sort(sl); //not possible to sort them like this
        //if their had been similar integers they would have been shorted till now
        //we cannot short them because we have not given a way to sort them for these objects
        //so we have to implement the comparable
        Collections.sort(sl,new AgeComparator()); //it will be automatically shorted by this
        System.out.println("Sort by Age: "+sl);
        Collections.sort(sl,new NameComparator()); //it will be automatically shorted by this
        System.out.println("Sort by Name: "+sl);
        Collections.sort(sl,new RolllNoComparator()); //it will be automatically shorted by this
        System.out.println("Sort by RollNo: "+sl);

    }
}
class Student { //to implement Comparable we have to implement CompareTo
    private int rollNo;
    private String name;
    private int age;

    public Student(int rollNo, String name, int age) {
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{"+"rollNo="+rollNo+", name="+name+", age="+age+'}';
    }

}
class AgeComparator implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getAge()-o2.getAge();
    }
}
class NameComparator implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
class RolllNoComparator implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getRollNo()-o2.getRollNo();
    }
}
