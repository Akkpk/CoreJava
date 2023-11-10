package LambadExpressions.FunctionDemo;

import java.util.function.Function;

public class Demo1 {
    public static void main(String[] args) {
//        Function Ex
//        Function<Integer,Integer> f = n -> n*n;
//
//        System.out.println(f.apply(5));
//        System.out.println(f.apply(10));
//        System.out.println(f.apply(52));
//        System.out.println(f.apply(15));


        //String length
        Function<String,Integer> l = s -> s.length();
        System.out.println(l.apply("Java"));
        System.out.println(l.apply("Aditya"));

    }
}
