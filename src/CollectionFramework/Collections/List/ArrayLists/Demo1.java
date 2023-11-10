package CollectionFramework.Collections.List.ArrayLists;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collection;

public class Demo1 {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();

        al.add("Aditya");
        al.add(5);
        al.add(5.55);
        al.add(0.55);
        al.add('A');
        al.add(true);
        al.add(11);
        System.out.println(al);

        al.add(7,6);
        System.out.println("After adding 6 at 7th index:"+al);

//        al.remove(7);
        al.remove("Aditya");
        System.out.println("After removing Aditya:"+al);

        System.out.println(al.get(6));

        al.set(0, "Aditya");
        System.out.println("After setting Aditya:"+al);

        System.out.println("Reading elements using for loop");
        for (int i = 0; i <al.size() ; i++) {
            System.out.print(al.get(i)+", ");
        }
        System.out.println();

        System.out.println("Reading elements using for-each loop");
        for (Object o : al) {
            System.out.print(o+", ");
        }
        System.out.println();

        System.out.println("Reading elements using Iterators loop");
        Iterator it = al.iterator();
        while (it.hasNext()){
            System.out.print(it.next()+", ");
        }


    }
}
