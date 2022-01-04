package java8;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
public class LambdaExpression{
        public static void main (String[] args) {
            ArrayList al=new ArrayList();
            al.add(10);
            al.add(21);
            al.add(32);
            al.add(5);
            al.add(8);

            System.out.println("Element before sorting:" +al);
            Collections.sort(al,new ElementSortingComparator());
            System.out.println("Element after sorting:" +al);
        }
    }
    class ElementSortingComparator implements Comparator<Integer>{
    @Override
    public int compare(Integer o1, Integer o2) {
        if(o1 > o2){return -1;}
        else if(o1 <o2){return +1;}
        else {return 0;}
    }
}
