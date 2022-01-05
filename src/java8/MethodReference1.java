package java8;

import java.util.function.Function;
interface MyInterface{
    public void m1();
}
public class MethodReference1 {
    public static void m2()
    {
        System.out.println("Hello! Good Morning...");
    }
    public static void main(String[] args) {
        //static method reference
        MyInterface mi=()-> System.out.println("Hello");//MethodReference1::m2;
        mi.m1();
    }
}
