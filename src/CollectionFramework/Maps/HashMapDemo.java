package CollectionFramework.Maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer, String> hm = new HashMap<>();
//        HashMap hm = new HashMap();

        //put()
        hm.put(1,"Aditya");
        hm.put(2,"Adity");
        hm.put(3,"Adit");
        hm.put(4,"Adi");
        hm.put(5,"Ad");

        System.out.println(hm);//{1=Aditya, 2=Adity, 3=Adit, 4=Adi, 5=Ad}

//        hm.put(3,"Ad");
//        System.out.println(hm);//{1=Aditya, 2=Adity, 3=Ad, 4=Adi, 5=Ad}

        //get()
//        System.out.println(hm.get(5));
//        System.out.println(hm.get(3));

        //remove()
//        hm.remove(3);//remove pair from hashmap
//        System.out.println(hm);

        //containsKey()
//        System.out.println(hm.containsKey(5));//true
//        System.out.println(hm.containsKey(6));//false
//
//        //containsValue()
//        System.out.println(hm.containsValue("Ad"));//false
//        System.out.println(hm.containsValue("Aditya"));//true


//---------------------------------------------------------------------------------------------------------------------
        //isEmpty()
        System.out.println(hm.isEmpty());//false

        //keySet()
        System.out.println(hm.keySet());//returns set -> [1, 2, 4, 5]
//        for(Object i: hm.keySet()){
//            System.out.println(i);
//        }

        //values()
        System.out.println(hm.values());//returns collection ->[Aditya, Adity, Adi, Ad]
//        for(Object i: hm.values()){
//            System.out.println(i);
//        }

        //entitySet()
        System.out.println(hm.entrySet());//returns set -> [1=Aditya, 2=Adity, 4=Adi, 5=Ad]
//        for(Object i: hm.keySet()){
//            System.out.println(i+"="+ hm.get(i));
//        }
//---------------------------------------------------------------------------------------------------------------------

        //Entry Methods
        //***************

//        for(Map.Entry entry: hm.entrySet()){
//            System.out.println(entry.getKey()+" "+ entry.getValue());
//        }
//---------------------------------------------------------------------------------------------------------------------

        //itretor()
        Set s = hm.entrySet();

        Iterator it = s.iterator();

        while (it.hasNext()){
            Map.Entry entry = (Map.Entry) it.next();
            System.out.println(entry.getKey()+" "+ entry.getValue());
        }


    }
}
