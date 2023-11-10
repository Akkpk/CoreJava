package StreamAPI.MapDemos;

import java.util.*;
import java.util.stream.Collectors;

public class Demo1 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Aditya","Aman","Rakesh","Tashrif");
        List<String> upperCaseNames = new ArrayList<>();

//        without Streams
        for(String s: names){
            upperCaseNames.add(s.toUpperCase());
        }
        System.out.println(upperCaseNames);

//        with Streams
//        upperCaseNames = names.stream().map(str->str.toUpperCase()).collect(Collectors.toList());
//        System.out.println(upperCaseNames);

//        or
//        names.stream().map(s -> s.toUpperCase()).forEach(s -> System.out.println(s));

//        or
        names.stream().map(s -> s.toUpperCase()).forEach(System.out::println);

    }
}
