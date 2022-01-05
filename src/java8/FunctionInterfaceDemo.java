package java8;

import java.util.function.Function;

public class FunctionInterfaceDemo {
    public static void main(String[] args) {
        Function<Integer,Integer> getSquare=(i)->i*i;
        System.out.println(getSquare.apply(10));
    }
}
