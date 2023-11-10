package StreamAPI.DistinctAndLimitDemos;

import java.util.*;

public class DistinctAndLimitDemo {
    public static void main(String[] args) {
        var list = Arrays.asList("bus","car","bike","bus","car");

        //distinct()
//        list.stream().distinct().forEach(System.out::println);

        //limit()
//        list.stream().limit(2).forEach(System.out::println);
        list.stream().distinct().limit(2).forEach(System.out::println);
    }
}
