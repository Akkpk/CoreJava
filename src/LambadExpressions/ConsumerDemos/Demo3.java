package LambadExpressions.ConsumerDemos;

import java.util.function.Consumer;

public class Demo3 {
    public static void main(String[] args) {
        Consumer<String> c1 = s-> System.out.println("Hello, "+s);
        Consumer<String> c2 = j-> System.out.println("How are you "+j);
        Consumer<String> c3 = j-> System.out.println("Is every thing fine "+j);

//        c1.accept("Aditya");
//        c2.accept("Aditya");
//        c3.accept("Aditya");

        //or

//        c1.andThen(c2).andThen(c3).accept("Aditya.");

        //or

        Consumer<String> c4 = c1.andThen(c2).andThen(c3);
        c4.accept("Aditya.");
    }
}
