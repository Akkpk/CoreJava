package StreamAPI.TerminalMethods;

import java.util.Arrays;
import java.util.Optional;

public class ReduceAndtoArrayMethods {
    public static void main(String[] args) {
        var li = Arrays.asList("A","B","C","1","2","3");

        //reduce()
        Optional<String> reduced = li.stream().reduce((val, combinedVal)->{
            return combinedVal+val;
        });

        System.out.println(reduced.get());


        //toArray()
        Object[] arr = li.stream().toArray();

        System.out.println(Arrays.toString(arr));

    }
}
