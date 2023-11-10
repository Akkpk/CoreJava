package StreamAPI.MoreStreamsMethods;

//sorted

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Demo1 {
    public static void main(String[] args) {
        var l1 = Arrays.asList(2,4,1,3,5,6,8,7,9);

//        l1.stream().sorted().forEach(System.out::println);
        var res =  l1.stream().sorted().collect(Collectors.toList());
        System.out.println(res);//[1, 2, 3, 4, 5, 6, 7, 8, 9]

//        String

        var sl = Arrays.asList("ad","pk","bk","ck");

        sl.stream().sorted().forEach(System.out::println);
    }
}
