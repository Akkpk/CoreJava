package CollectionFramework.Collections.SET.HashSets;

import java.util.HashSet;

public class Demo2 {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();

        hs.add(2);
        hs.add(4);
        hs.add(6);

        System.out.println("HashSet"+hs);

        HashSet<Integer> num = new HashSet<>();

        //addAll()
        num.addAll(hs);
        num.add(10);
        System.out.println(num);

        //removeAll()
        num.removeAll(hs);
        System.out.println(num);
    }
}
