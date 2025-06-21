package Java_Programs._37_Collection_Framework_DSA.List;

import java.util.Stack;

public class P201_Stack {
    public static void main(String[] args) {
        //Stack means Last in will get First out like books
        Stack s = new Stack();
        //here we have push
        s.push("Anuj");
        s.push("Rajput");
        s.push("Amit");
        s.push("Amit");
        System.out.println(s);
        System.out.println(s.size());
        System.out.println(s.peek());
        System.out.println(s.pop());
        System.out.println(s);
        s.push("Viay");
        System.out.println(s);

    }
}
