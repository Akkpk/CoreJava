package StreamAPI.FilterDemos;

import java.util.*;
import java.util.stream.Collectors;

public class FilterDemo2 {
    public static void main(String[] args) {
        List<String> names  = Arrays.asList("Aditya","Bob","Dog","Cats");
        List<String> longNames = new ArrayList<String>();

        longNames = names.stream().filter(s-> s.length()>3 && s.length()<6).collect(Collectors.toList());
        System.out.println(longNames);

//        names.stream().filter(s -> s.length()>3 && s.length()<6).forEach(System.out::println);
    }

}
