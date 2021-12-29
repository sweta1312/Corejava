package exceptions;

public class ExceptionPropagation {
    public static void main(String[] args) {
        //case#1
     /*   System.out.println("in main method start");
        m1();
        System.out.println("in main method end");
    }
    static void m1(){
        try{
            System.out.println("m1 method start");
            System.out.println(10/0);
            System.out.println("m1 method end");
        }
        catch (ArithmeticException ae)
        {
            System.out.println("m1 catch");
        }*/

        //case#2 exception not caught in m1 method
   /*     System.out.println("in main method start");
        m1();
        System.out.println("in main method end");
    }
    static void m1(){

            System.out.println("m1 method start");
            System.out.println(10/0);
            System.out.println("m1 method end");

    }*/
        //case#3
       /* System.out.println("main start");
        try {
            m1();
        } catch (ArithmeticException ae)
        {
            System.out.println("in main catch");
        }
        System.out.println("main end");
    }
        static void m1() {

            System.out.println("m1 method start");
            System.out.println(10 / 0);
            System.out.println("m1 method end");
        }
*/
    }
}
