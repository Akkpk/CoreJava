package CollectionFramework.Collections.List.LinkedLists;

import java.util.LinkedList;

public class Demo3SpecificMethods {
    public static void main(String[] args) {

        LinkedList<String> l = new LinkedList<>();

        l.add("aditya");
        l.add("adi");
        l.add("aman");
        l.add("Rakesh");
        l.add("ayush");

        System.out.println(l);

        //addFirst()
        l.addFirst("Aditya");
        System.out.println(l);

        //addLast()
        l.addLast("Prince");
        System.out.println(l);

        //getFirst()
        System.out.println(l.getFirst());

        //getLast()
        System.out.println(l.getLast());

        //removeFirst()
        l.removeFirst();
        System.out.println(l);

        //removeLast()
        l.removeLast();
        System.out.println(l);

    }
}
