package exceptions;

public class Example1 {
    void m1() {
        System.out.println("1");

        try {
            System.out.println("2");
            System.out.println("3");
            System.out.println("4");
        } catch (Exception e) {
            System.out.println("5");
            System.out.println("6");
            System.out.println("7");
        }
        System.out.println("8");
    }
    public static void main(String[] args) {
    Example1 ex=new Example1();
    ex.m1();

    }

}
