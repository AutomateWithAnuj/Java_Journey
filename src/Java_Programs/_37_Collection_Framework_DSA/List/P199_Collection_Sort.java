package Java_Programs._37_Collection_Framework_DSA.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class P199_Collection_Sort {
    public static void main(String[] args) {
        List marks = new ArrayList();
        marks.add(91);
        marks.add(74);
        marks.add(83);
        marks.add(56);
        System.out.println(marks);
        //sorting in ascending order
        Collections.sort(marks); //there is a class with name of collections
        System.out.println(marks);

        //sorting in decending order
        Collections.sort(marks,Collections.reverseOrder()); //there is a class with name of collections
        System.out.println(marks);

    }
}
