package CollectionFramework.Maps.LegacyClasses;

import java.util.*;

//Insertion order is not preserved
//It is synchronized DS
//Key's hashcode % 11 = rem, rem is the index where key value pair will store in bucket
//if hash-collision occur then index rem will become LinkedList

public class HashTableDemo {
    public static void main(String[] args) {

//        Hashtable t = new Hashtable();//Capacity: 11, loadFactor: 0.75;
//        HashMap t = new HashMap(100);
//        HashMap t = new HashMap(100, (float)0.90);
        HashMap<Integer, String> t = new HashMap<>();

        //put()
        t.put(1,"Aditya");
        t.put(12,"Aditya");
        t.put(2,"Adity");
        t.put(13,"Adity");
        t.put(3,"Adit");
        t.put(4,"Adi");
        t.put(5,"Ad");
        t.put(16,"Ad");
        System.out.println(t);

//        System.out.println(t);//{1=Aditya, 2=Adity, 3=Adit, 4=Adi, 5=Ad}

//        t.put(3,"Ad");
//        System.out.println(t);//{1=Aditya, 2=Adity, 3=Ad, 4=Adi, 5=Ad}

        //get()
//        System.out.println(t.get(5));
//        System.out.println(t.get(3));

        //remove()
//        t.remove(3);//remove pair from HashTable
//        System.out.println(t);

        //containsKey()
//        System.out.println(t.containsKey(5));//true
//        System.out.println(t.containsKey(6));//false
//
//        //containsValue()
//        System.out.println(t.containsValue("Ad"));//false
//        System.out.println(t.containsValue("Aditya"));//true

        //isEmpty()
//        System.out.println(t.isEmpty());//false

//---------------------------------------------------------------------------------------------------------------------

        //keySet()
//        System.out.println(t.keySet());//returns set -> [1, 2, 4, 5]
//        for(Object i: t.keySet()){
//            System.out.println(i);
//        }

        //values()
//        System.out.println(t.values());//returns collection ->[Aditya, Adity, Adi, Ad]
//        for(Object i: t.values()){
//            System.out.println(i);
//        }

        //entitySet()
//        System.out.println(t.entrySet());//returns set -> [1=Aditya, 2=Adity, 4=Adi, 5=Ad]
//        for(Object i: t.keySet()){
//            System.out.println(i+"="+ t.get(i));
//        }
//---------------------------------------------------------------------------------------------------------------------

        //Entry Methods
        //***************

//        for(Map.Entry entry: t.entrySet()){
//            System.out.println(entry.getKey()+" "+ entry.getValue());
//        }
//---------------------------------------------------------------------------------------------------------------------

        //itretor()
//        Set s = t.entrySet();
//
//        Iterator it = s.iterator();
//
//        while (it.hasNext()){
//            Map.Entry entry = (Map.Entry) it.next();
//            System.out.println(entry.getKey()+" "+ entry.getValue());
//        }
    }
}
