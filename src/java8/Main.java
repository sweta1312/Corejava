package java8;

import java.util.*;


public class Main {
    public static void main(String[] args) {
       // List<Person> list=new ArrayList<Person>();

        Person p1=new Person(101,"Nick", "nick@gmail.com");
        Person p2=new Person(102,"Jhon", "jhon@gmail.com");
        Person p3=new Person(103,"Chales", "chales@gmail.com");
        Person p4=new Person(104,"Orlen", "orlen@gmail.com");
        Person p5=new Person(105,"Honey", "honey@gmail.com");

        List<Person> persons= Arrays.asList(p1,p2,p3,p4,p5);

        System.out.println("====Object before sorting=====");
        for(Person p:persons)
        {
            System.out.println(p);
        }
        System.out.println("=====Object After sorting=====");
        //Approch2 using Anynomus implementation
    /*    Collections.sort(persons, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getPname().compareTo(o2.getPname());
            }
        });
        for(Person p:persons)
        {
            System.out.println(p);
        }*/
        //Approch 3 using Lamda expression
        Collections.sort(persons ,(o1,o2)->{ return o1.getPname().compareTo(o2.getPname());});
        for(Person p:persons)
        {
            System.out.println(p);
        }
    }
}
