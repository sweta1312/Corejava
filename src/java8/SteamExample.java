package java8;

import java.util.ArrayList;
import java.util.List;

public class SteamExample {
    public static void main(String[] args) {
        List<String> countries=new ArrayList<>();
        countries.add("India");
        countries.add("USA");
        countries.add("UK");
        countries.add("China");
        countries.add("India");
        countries.add("USA");

        //getting unique values from collection
       /* countries.stream()
                .distinct()
                .forEach(System.out::println);*/
        //getting specific no. of records from collection using limit()
      /*  countries.stream()
                .limit(3)
                .forEach(System.out::println);*/
        //removing first N no of records
        countries.stream()
                .skip(3)
                .forEach(System.out::println);

    }
}
