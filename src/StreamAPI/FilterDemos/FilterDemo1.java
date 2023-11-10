package StreamAPI.FilterDemos;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FilterDemo1 {
    public static void main(String[] args) {

//        ArrayList<Integer> numbers = new ArrayList<>();
//        numbers.add(10);
//        numbers.add(15);
//        numbers.add(20);
//        numbers.add(25);
//        numbers.add(30);

        List<Integer> numbersList = Arrays.asList(10,15,20,25,30,35,40,45,50);
        List<Integer> evenNums = new ArrayList<>();

        //without using streams
//        for(int i: numbersList){
//            if(i%2==0){
//                evenNums.add(i);
//            }
//        }
//        System.out.println(evenNums);


        //Using Streams
//        evenNums = numbersList.stream().filter(i -> i%2==0).collect(Collectors.toList());
//        System.out.println(evenNums);
//        filter takes argument and returns boolean //Predicate Functional Interface


        //without using another list
//        numbersList.stream().filter(i->i%2==0).forEach(n-> System.out.println(n));
        numbersList.stream().filter(i->i%2==0).forEach(System.out::println);
        //forEach takes an argument and returns nothing //Consumer Functional Interface

    }
}
