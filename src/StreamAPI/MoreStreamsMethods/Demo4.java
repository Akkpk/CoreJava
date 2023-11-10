package StreamAPI.MoreStreamsMethods;

//concatenating streams

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo4 {
    public static void main(String[] args) {
        var li = Arrays.asList("One","two","One");
        var l = Arrays.asList("Four","five","six");

        Stream<String> s1 = li.stream();
        Stream<String> s2 = l.stream();

        Stream.concat(s1,s2).forEach(System.out::println);
//        var concatStream = Stream.concat(s1,s2).collect(Collectors.toList());
//        System.out.println(concatStream);
    }
}
