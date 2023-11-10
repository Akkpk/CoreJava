package CollectionFramework.Maps;

//Underline DS "Red-Black Tree": 1)Root node always black 2)Every node has color red or black 3)if node is red then child should be Black 4)Red node's parent should be Black 5)Null nodes should be Black
//insertion is not preserved
//its keys follow shorting order

import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap<Integer, String> tm = new TreeMap<>();
        tm.put(1,"Aditya");
        tm.put(6,"Akp");
        tm.put(3,"fgr");
        tm.put(2,"se");
        tm.put(5,"fsgn");

        System.out.println(tm);
//        System.out.println(tm.get(5));
//        System.out.println(tm.ceilingEntry(4));//There is no key 4, then it will return next key's value
//        System.out.println(tm.ceilingKey(4));//if key present then only return key, id key is not found return next key's
//
//        System.out.println(tm.floorEntry(4));
//        System.out.println(tm.floorKey(4));
//
//        System.out.println(tm.containsKey(4));
//        System.out.println(tm.containsValue("bho"));

//        System.out.println(tm.headMap(2));
//        System.out.println(tm.higherEntry(2));

//        System.out.println(tm.keySet());
//        System.out.println(tm.values());

//        System.out.println(tm.pollFirstEntry());
//        System.out.println(tm.pollLastEntry());

//        System.out.println(tm.remove(3));

//        tm.replace(3,"AAAA");
//        System.out.println(tm);

//        System.out.println(tm.size());

        System.out.println(tm.subMap(2,4));
    }
}
