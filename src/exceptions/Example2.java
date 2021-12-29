package exceptions;

public class Example2 {
    void m1(){
        System.out.println("1");
        try
        {
            System.out.println("2");
            System.out.println(10/0);
            try {
                System.out.println(19/0);
            }
            catch (ArithmeticException ae)
            {
                System.out.println("8");
            }
        }
        catch (ArithmeticException ar)
        {
            System.out.println("3");
            System.out.println(10/0);
            System.out.println("5");
        }
        System.out.println("6");
    }

    public static void main(String[] args) {
        Example2 e=new Example2();
        e.m1();
    }
}
