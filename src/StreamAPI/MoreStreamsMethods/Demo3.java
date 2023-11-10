package StreamAPI.MoreStreamsMethods;

//findAny()
//findFirst()

import javax.swing.text.html.Option;
import java.util.Arrays;
import java.util.Optional;

public class Demo3 {
    public static void main(String[] args) {
        var li = Arrays.asList("One","two","One");

        //findAny()
        Optional<String> ans = li.stream().findAny();
        System.out.println(ans.get());

        //findFirst()
        Optional<String> res = li.stream().findFirst();
        System.out.println(res.get());
    }
}
