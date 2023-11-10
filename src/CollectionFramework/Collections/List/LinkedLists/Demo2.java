package CollectionFramework.Collections.List.LinkedLists;

import java.util.Collections;
import java.util.LinkedList;

public class Demo2 {
    public static void main(String[] args) {
        LinkedList<Integer> l = new LinkedList<>();
        l.add(92);
        l.add(93);
        l.add(94);
        l.add(3);
        l.add(2);
        l.add(1);

        LinkedList<Integer> l_dup = new LinkedList<>();
        l_dup.addAll(l);
        System.out.println(l_dup);

        l_dup.removeAll(l);
        System.out.println(l_dup);

        //sort
        Collections.sort(l);
        System.out.println(l);

        //reverse sort
        Collections.sort(l, Collections.reverseOrder());
        System.out.println(l);

        //Shuffle
        Collections.shuffle(l);
        System.out.println(l);
    }
}
