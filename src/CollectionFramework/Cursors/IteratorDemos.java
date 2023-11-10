package CollectionFramework.Cursors;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorDemos {
    public static void main(String[] args) {
        List<Integer> li = new ArrayList<>();
        li.add(1);
        li.add(2);
        li.add(3);
        li.add(4);
        li.add(5);

        Iterator<Integer> it = li.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
