package java8;

import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        Predicate<Integer> predicate =(i)->i%2>= 0;
        System.out.println(predicate.test(50));
    }
}
