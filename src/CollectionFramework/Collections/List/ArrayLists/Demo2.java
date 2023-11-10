package CollectionFramework.Collections.List.ArrayLists;

import java.util.ArrayList;
import java.util.Collections;

public class Demo2 {
    public static void main(String[] args) {
        ArrayList<Character> al = new ArrayList<>();

        al.add('A');
        al.add('Y');
        al.add('X');
        al.add('Z');
        al.add('C');
        al.add('B');

        ArrayList<Character> al_dup = new ArrayList<>();

        al_dup.addAll(al);
        System.out.println(al_dup);

        al_dup.removeAll(al);
        System.out.println("After Removing al:"+al_dup);

        //Collections Methods

        //Sorting using Collections class's method Collections.sort()
        System.out.println("Elements before sorting:"+al);

        Collections.sort(al);

        System.out.println("Elements after sorting:"+al);

        //Reversed order sorting
        Collections.sort(al, Collections.reverseOrder());
        System.out.println("Reversed order:" + al);

        //Shuffling elements
        Collections.shuffle(al);
        System.out.println("After shuffling"+al);
    }
}
