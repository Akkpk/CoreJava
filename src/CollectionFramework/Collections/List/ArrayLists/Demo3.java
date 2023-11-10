package CollectionFramework.Collections.List.ArrayLists;

import java.util.ArrayList;
import java.util.Arrays;

public class Demo3 {
    public static void main(String[] args) {
        //Array to ArrayList
        String[] arr = {"Aditya","aman","Rakesh","Ayush","Avinash"};

        for (String s:arr) {
            System.out.println(s);
        }

        ArrayList al = new ArrayList(Arrays.asList(arr));
        System.out.println(al);
    }
}
