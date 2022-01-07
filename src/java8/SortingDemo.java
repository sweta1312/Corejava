package java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingDemo {
    public static void main(String[] args) {
        List<Student> list=new ArrayList<>();
        list.add(new Student(101,"xyz","Orissa"));
        list.add(new Student(102,"abc","Delhi"));
        list.add(new Student(104,"pqr","Hyderabad"));
        list.add(new Student(103,"mno","Rajasthan"));

        System.out.println("Before sorting");

        for(Student s:list){
            System.out.println(s);
        }

        System.out.println("After sorting");
        Collections.sort(list,(p1,p2)->{return p1.getName().compareTo(p2.getName());});
        System.out.println();
        for(Student s:list){
            System.out.println(s);
        }
    }
}
