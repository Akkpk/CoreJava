package StreamAPI.FlatMapDemos;

import java.util.*;

public class Demo1 {
    public static void main(String[] args) {
        List<Integer> l1 = Arrays.asList(1,2);
        List<Integer> l2 = Arrays.asList(3,4);
        List<Integer> l3 = Arrays.asList(5,6);
        List<List<Integer>> li = Arrays.asList(l1,l2,l3);

//        li.stream().flatMap(list->list.stream()).forEach(System.out::println);
        li.stream().flatMap(list->list.stream().map(i->i*2)).forEach(System.out::println);
    }
}
