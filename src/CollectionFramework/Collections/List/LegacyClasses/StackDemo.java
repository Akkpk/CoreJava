package CollectionFramework.Collections.List.LegacyClasses;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack s = new Stack();//Default capacity: 10;
        s.add(3);
        s.add(3);
        s.add("A");
        s.push("some");
        System.out.println(s.pop());
        System.out.println(s.peek());

        System.out.println(s.capacity());
        System.out.println(s);
        System.out.println(s.size());
    }
}
