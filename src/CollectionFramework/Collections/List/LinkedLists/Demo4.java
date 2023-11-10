package CollectionFramework.Collections.List.LinkedLists;

import java.util.LinkedList;

public class Demo4 {
    public static void main(String[] args) {
        LinkedList<Integer> li = new LinkedList<>();

        //methods from Queue interface

        //offer()
        li.offer(1);
        li.offer(12);
        li.offer(14);
        li.offer(13);
        li.offer(12);
        System.out.println(li);//[1, 12, 14, 13, 12]
        //element()
        System.out.println(li.element());//1

        //peek()
        System.out.println(li.peek());//1

        //poll()
        System.out.println(li.poll());//1
        System.out.println(li);//[12, 14, 13, 12]

    }
}
