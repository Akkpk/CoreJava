package CollectionFramework.Cursors;

//Enumeration cursor can only be used with Legacy Classes
//it only reads the data

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationDemos {
    public static void main(String[] args) {

        Vector<Integer> v = new Vector<>();
        v.add(1);
        v.add(2);
        v.add(3);
        v.add(4);
        v.add(5);

        Enumeration e  = v.elements();
        while (e.hasMoreElements()){
            System.out.println(e.nextElement());
        }
    }

}
