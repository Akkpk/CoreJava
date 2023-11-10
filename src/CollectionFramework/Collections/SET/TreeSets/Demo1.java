package CollectionFramework.Collections.SET.TreeSets;

//Underline DS "Balanced Tree"
//if follows sorting order
//only homogeneous data
//no duplicate
//compare with root node if new obj is greater than, it creates new node to right, if object is less than, it creates new node to the left
//no null value
//insertion order is not preserved

import java.util.TreeSet;

public class Demo1 {
    public static void main(String[] args) {
        TreeSet ts = new TreeSet();

        ts.add(53);
        ts.add(3);
//        ts.add("5");//throw an exception
        ts.add(56);
        ts.add(2);


        ts.remove(56);
        ts.clear();
        System.out.println(ts);
    }
}
