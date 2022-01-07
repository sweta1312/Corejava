package java8stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample1 {
    public static void main(String[] args) {
        //Create a list and filter all even numbers

       // Stream<Integer> list1= Stream.of(2, 4, 3, 4, 5, 6, 8, 9);
       // Stream<Integer> stream = Stream.of(1, 4, 2, 5, 8);
       List<Integer> list1= Arrays.asList(2,4,6,8,56,43,6,8);
        System.out.println(list1);
        //list1
        //without stream
        List<Integer> listEven=new ArrayList<>();
     /*   for(Integer i:list1)
        {
            if(i%2==0)
            {
                listEven.add(i);
            }
        }
        System.out.println(list1);
        System.out.println(listEven);*/

        //using stream
       /* Stream<Integer> stream = list1.stream();
        //List<Integer> newList = stream.filter((p) -> p % 2 == 0).collect(Collectors.toList());
       // List<Integer> newList = stream.filter((p) -> p % 2 == 0).collect(Collectors.toList());
        Set<Integer> newList = stream.filter((p) -> p % 2 == 0).collect(Collectors.toSet());
        System.out.println(newList);*/

        Stream<Integer> stream = list1.stream();
        List<Integer> newList1 = stream.filter(i -> i > 10).collect(Collectors.toList());
        System.out.println(newList1);

    }
}