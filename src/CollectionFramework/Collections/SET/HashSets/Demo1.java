package CollectionFramework.Collections.SET.HashSets;

import java.util.HashSet;
import java.util.Iterator;

public class Demo1 {
    public static void main(String[] args) {
        HashSet hs = new HashSet();//Default capacity: 16, Load Factor: 0.75

//        HashSet hs = new HashSet(100, (float)0.95);
//        Hashset<Integer> hsi = new HashSet<>();

        //Adding objects
        hs.add("aditya");
        hs.add(100);
        hs.add(1.20);
        hs.add(true);
        hs.add(null);

        System.out.println(hs);

        //remove()
        hs.remove(100);
        System.out.println(hs);

        //contains()
        System.out.println(hs.contains(100));

        //Reading using for-each loop
        for (Object o:hs) {
            System.out.print(o+" ");
        }
        System.out.println();
        //Reading objects by Iterators
        Iterator it = hs.iterator();
        while (it.hasNext()){
            System.out.print(it.next()+" ");
        }
    }
}
