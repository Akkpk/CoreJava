package CollectionFramework.Collections.List.LegacyClasses;

//Underline DataStructure is Resizable Array/Growable Array
//They are synchronized collection

import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        Vector v = new Vector(); //Default Capacity: 10
        v.add('A');
        v.add(1.5);
        v.add(1);
        v.add("A");
        v.add("A");
        v.add("A");
        v.add(null);
        v.add(null);
        v.add(0.55);
        v.add(0.55);
        v.add(0.55);

        System.out.println(v);
        System.out.println(v.lastElement());
        System.out.println(v.isEmpty());
        System.out.println(v.size());
        System.out.println(v.capacity());
    }
}
