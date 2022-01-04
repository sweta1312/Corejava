package collection;
import java.util.*;

public class ArrayListDemo {
    public static void main(String[] args) {
      /*  List<Integer> al=new ArrayList<Integer>();
       System.out.println(al.size());

        //add element to arraylist
        al.add(1);
        al.add(2);
        for (int i:al) {
            System.out.println(i);
        }
        System.out.println(al.size());
        al.remove(1);
        System.out.println(al);
        al.add();
        al.add(7);
        System.out.println(al);
        al.add(2);
        al.add(2);*/

        ArrayList<String> lt=new ArrayList<String>();
        lt.add("null");
        lt.add("C");
        lt.add("A");
        lt.add("B");

        Collections.sort(lt);

        Iterator itr= lt.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println( lt.get(0));
    }
}
