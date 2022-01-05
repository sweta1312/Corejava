package java8;

import java.util.function.Predicate;

public class PredicateExample1 {
    public static void main(String[] args) {
        String[] names={"Lata","Kajal","Samantha","Anushka","Trisha","Aishwarya"};
        Predicate<String> predicate =(name)->name.startsWith("A");
       // System.out.println(predicate.test("Annu"));
        for(String name:names)
        {
            if(predicate.test(name))
            {
                System.out.println(name);
            }
        }
    }
}

