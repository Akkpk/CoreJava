package LambadExpressions.FunctionDemo;

import java.util.function.Function;

/*
Function Joining
----------------
andThen()
compose()
 */
public class Demo3 {
    public static void main(String[] args) {

        Function<Integer,Integer> f1 = n->n*2;
        Function<Integer,Integer> f2 = n->n*n;

        System.out.println("andThen() example: "+f1.andThen(f2).apply(2));//f1->2*2=4 then f2=n*n=4*4=16
        System.out.println("compose() example: "+f1.compose(f2).apply(2));//f2=n*n=2*2=4 then f1->n*2=4*2=8
    }
}
