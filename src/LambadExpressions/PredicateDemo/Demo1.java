package LambadExpressions.PredicateDemo;

import java.util.function.Predicate;
//Predicate ---> one parameter, return boolean
//use only if you have conditional checks in your program...
public class Demo1 {
    public static void main(String[] args) {

        //Ex 1: I want to check whether a number is greater than 10 or not
//        Predicate<Integer> p = i -> i>10;
//
//        System.out.println(p.test(25));//true
//        System.out.println(p.test(5));//false
//
          //Ex 2: check the length of given string is greater than 4 or not.
//        Predicate<String> pr = s -> s.length()>4;
//
//        System.out.println(pr.test("Aditya"));//true
//        System.out.println(pr.test("Adi"));//false

        //Ex 3: Print array elements whose size is > 4;
//        String[] names = {"David","Smith","Adi","Aditya"};
//        Predicate<String> pre = s -> s.length()>4;
//
//        for(String name: names){
//            if (pre.test(name)){
//                System.out.println(name);
//            }
//        }


    }
}
