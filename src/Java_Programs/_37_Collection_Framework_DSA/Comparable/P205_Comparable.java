package Java_Programs._37_Collection_Framework_DSA.Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class P205_Comparable {
    public static void main(String[] args) {
        Student s1 = new Student(101, "Anuj",24);
        Student s2 = new Student(104, "Amit",55);
        Student s3 = new Student(103, "Pramod",35);
        List<Student> sl = new ArrayList();
        sl.add(s1);
        sl.add(s2);
        sl.add(s3);
        //Collections.sort(sl); //not possible to sort them like this
        //if their had been similar integers they would have been shorted till now
        //we cannot short them because we have not given a way to sort them for these objects
        //so we have to implement the comparable
        Collections.sort(sl); //it will be automatically shorted by this
        System.out.println(sl);
    }
}
class Student implements Comparable<Student>{ //to implement Comparable we have to implement CompareTo
    private int rollNo;
    private String name;
    private int age;

    public Student(int rollNo, String name, int age) {
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{"+"rollNo="+rollNo+", name="+name+", age="+age+'}';
    }

    @Override
    public int compareTo(Student o) {
        //return this.rollNo-o.rollNo; //by this we can short them by the age
        //return this.age-o.age; //by this they will be shorted by age
        //we can also do with name but for string we have to compare like this because this will not work return this.name-o.name;
        return this.name.compareTo(o.name);
        //but we cannot do for all at a time we can do sort them with only 1 at a time
    }
}
