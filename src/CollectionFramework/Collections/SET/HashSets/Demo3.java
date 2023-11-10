package CollectionFramework.Collections.SET.HashSets;

import java.util.HashSet;

public class Demo3 {
    public static void main(String[] args) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        set1.add(5);

        System.out.println("Set1:"+set1);

        set2.add(3);
        set2.add(4);
        set2.add(5);
        System.out.println("Set2:"+set2);

//        //union
//        set1.addAll(set2);
//        System.out.println("Union: "+set1);
//
//        //intersection
//        set1.retainAll(set2);
//        System.out.println("Intersection: "+set1);

//        //differance
//        set1.removeAll(set2);
//        System.out.println("Differance: "+set1);

        //subset
        System.out.println("Set2 is subset of set1: "+set1.containsAll(set2));
    }
}
