package StreamAPI.MapDemos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo3 {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(2,3,4,5,6);
        List<Integer> mulNums = new ArrayList<>();

//        without streams
        for (int i:nums) {
            mulNums.add(i*3);
        }
        System.out.println(mulNums);

//        with streams
        nums.stream().map(i->i*3).forEach(System.out::println);
    }



}
