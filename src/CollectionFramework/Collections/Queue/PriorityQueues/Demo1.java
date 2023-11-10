package CollectionFramework.Collections.Queue.PriorityQueues;

import java.util.Iterator;
import java.util.PriorityQueue;

public class Demo1 {
    public static void main(String[] args) {
        PriorityQueue q = new PriorityQueue();
        //Ques doesn't store heterogeneous data

        //add()
        q.add("A");
        q.add("B");

        //offer()
        q.offer("C");

        System.out.println(q);

        //get head element using element()  and  peek()
        System.out.println(q.element());//A return head element,   if empty returns NoSuchElementException
        System.out.println(q.peek());//A return head element,   if empty returns null

        //removing elements using poll() and remove()
        System.out.println(q.poll());//A
        System.out.println(q);//[B, C]

        System.out.println(q.remove("B"));//true
        System.out.println(q);//[C]

        q.offer("E");

        //Reading elements
        Iterator it = q.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

        for (Object o:q) {
            System.out.println(o);
        }

    }
}
