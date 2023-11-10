package StreamAPI.FilterDemos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo3 {
    public static void main(String[] args) {
        List<String> names  = Arrays.asList("Aditya",null,"Bob",null,"Dog","Cats");
        List<String> res = new ArrayList<String>();

        res = names.stream().filter(str->str!=null).collect(Collectors.toList());
        System.out.println(res);
    }
}
