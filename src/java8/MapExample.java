package java8;

import java.util.*;

public class MapExample {
    public static void main(String[] args) {
        Map<Integer,String> map=new HashMap<Integer,String>();
        map.put(1,"USA");
        map.put(91,"India");
        map.put(61,"Australia");
        map.put(86,"China");
        map.put(33,"France");
        map.put(852,"Hong Kong");
        map.put(92,"Pakistan");

      /*  for(Map.Entry m:map.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }*/
        System.out.println("Before shorting");
        Set set=map.entrySet();
        Iterator itr= set.iterator();
        while (itr.hasNext())
        {
            Map.Entry entry=(Map.Entry)itr.next();
            System.out.println(entry.getKey()+" "+ entry.getValue());
        }
        System.out.println("After sorting");
        map.entrySet().stream().sorted(Map.Entry.comparingByValue())
                .forEach(System.out::println);
    }
}
