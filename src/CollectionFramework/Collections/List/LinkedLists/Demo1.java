package CollectionFramework.Collections.List.LinkedLists;

import java.util.*;

public class Demo1 {
    public static void main(String[] args) {
        //Declare LinkedList
//        LinkedList l = new LinkedList();
//        LinkedList<Integer> l = new LinkedList<>();

        LinkedList l = new LinkedList();

        //Adding elements
        l.add(100);
        l.add("100");
        l.add(1.100);
        l.add('a');
        l.add(true);
        l.add(null);

        System.out.println(l);

        System.out.println(l.size());

        l.remove(3);
        System.out.println("After removing:"+l);

        //Adding element int  he middle of linkedlist
        l.add(3,'a');
        System.out.println("After adding in the middle:"+l);

        //retrieving values/objects
        System.out.println(l.get(3));

        //replacing/changing element
        l.set(5,0.223);
        System.out.println("After replacing/changing the value:"+l);

        System.out.println(l.contains('a'));
        System.out.println(l.contains('A'));

        System.out.println(l.isEmpty());

        //Reading data by for-loop
        for (int i = 0; i <l.size() ; i++) {
            System.out.print(l.get(i)+" ");
        }
        System.out.println();

        //Reading elements from l by for-each loop
        for (Object o:l) {
            System.out.print(o+" ");
        }
        System.out.println();

        //Reading data by using Iterator
        Iterator it = l.iterator();
        while(it.hasNext()){
            System.out.print(it.next()+" ");
        }
    }
}
