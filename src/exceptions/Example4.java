package exceptions;

public class Example4 {
    public static void main(String[] args) {
     /*   //finally block with return statement
        System.out.println(m1());
    }
    static int m1() {
        try {
            System.out.println("in try");

          // return 10;
          System.out.println(10/0);
           // return 10;
        } catch (NullPointerException npe) {
            System.out.println("in catch");
        }
    *//* catch (ArithmeticException ae) {
        System.out.println("in catch ae-block");
        return 20;
          }*//*
        finally {
            System.out.println("in finally");
          // return 30;
        }
       // System.out.println("after try/catch/finally"); //unreacheable statement
        return 40;*/

        m1();
        System.out.println("After m1 calling");
    }
    static void m1()
    {
        try {
            System.out.println("in try");
            System.out.println(10/0);
        }
        catch (NullPointerException npe){
            System.out.println("in catch");
        }
        finally {
            System.out.println("in finally");
          // return;
        }
       // System.out.println("aftyer try/catch/finally");
    }

}
