package CollectionFramework.Cursors;

//Only implemented with List classes i.e. ArrayList, LinkedList

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorDemo {
    public static void main(String[] args) {
        List<Integer> li = new ArrayList<>();
        li.add(1);
        li.add(2);
        li.add(3);
        li.add(4);
        li.add(5);

        ListIterator<Integer> lit = li.listIterator();
//        while (lit.hasNext()){
//            System.out.println(lit.next());
//        }

//        System.out.println("------------------------------------");

//        while (lit.hasPrevious()){
//            System.out.println(lit.previous());
//        }

//        lit.next();
//        lit.next();
//        lit.next();
//        lit.next();
//        lit.next();
//
//        while (lit.hasPrevious()){
//            System.out.println(lit.previous());
//        }

    }
}
