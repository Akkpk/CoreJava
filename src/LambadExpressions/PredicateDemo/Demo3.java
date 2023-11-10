package LambadExpressions.PredicateDemo;

//Joining two Predicates by using - and, or and negate operators
//p1 --> checks num is even
//p2 --> checks greater than 50

import java.util.function.Predicate;

public class Demo3 {
    public static void main(String[] args) {

        int[] arr = {5,15,20,25,30,35,40,45,50,55,60,65};

        Predicate<Integer> p1 = i -> i%2==0;
        Predicate<Integer> p2 = i -> i>50;

        //and
        System.out.println("Following number/s is greater than 50 and even:");
        for (int n: arr) {
//            if(p1.test(n) && p2.test(n))
            if(p1.and(p2).test(n))
            {
                System.out.println(n);
            }
        }

        //or
        System.out.println("Following number/s is either greater than 50 or even:");
        for (int n: arr) {
//            if(p1.test(n) || p2.test(n))
            if(p1.or(p2).test(n))
            {
                System.out.println(n);
            }
        }

        //negate
        System.out.println("Following number/s is neither greater than 50 nor even:");
        for (int n: arr) {
//            if(p1.test(n) && p2.test(n))
            if(p1.negate().test(n) && p2.negate().test(n))
            {
                System.out.println(n);
            }
        }
    }
}
