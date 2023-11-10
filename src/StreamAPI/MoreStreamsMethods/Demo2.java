package StreamAPI.MoreStreamsMethods;

/*
anyMatch()
allMatch()
noneMatch()
 */

import java.util.HashSet;
import java.util.Set;

public class Demo2 {
    public static void main(String[] args) {
        Set<String> fruits = new HashSet<>();
        fruits.add("One apple");
        fruits.add("One mango");
        fruits.add("One banana");
        fruits.add("two apple");
        fruits.add("five grapes");

        //anyMatch()
        boolean res = fruits.stream().anyMatch(val -> { return val.startsWith("One");});
        System.out.println(res);

        //allMatch()
        boolean r = fruits.stream().allMatch(val-> { return val.startsWith("One");});
        System.out.println(r);

        //noneMatch()
        boolean re = fruits.stream().noneMatch(val-> { return val.startsWith("One");});
        System.out.println(re);
    }
}
