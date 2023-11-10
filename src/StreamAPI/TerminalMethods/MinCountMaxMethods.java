package StreamAPI.TerminalMethods;

import java.util.Arrays;
import java.util.Optional;

public class MinCountMaxMethods {
    public static void main(String[] args) {
        var nums = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        //count()
        long evenCount=nums.stream().filter(i->i%2==0).count();
        System.out.println(evenCount);//5

        //min()
        Optional<Integer> min = nums.stream().min((val1, val2)->{
            return val1.compareTo(val2);
        });
        System.out.println(min.get());//1

        //max()
        Optional<Integer> max = nums.stream().max((v1,v2)->{
            return v1.compareTo(v2);
        });
        System.out.println(max.get());
    }
}
