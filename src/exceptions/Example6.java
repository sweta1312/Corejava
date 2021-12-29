package exceptions;

public class Example6 {
    public static void main(String[] args) {
        Example6 e=new Example6();
        e.m1();
    }
     void m1() {
            int a=-1;

            try {
                a = 10;
                System.out.println(a);
            }
            catch (ArithmeticException ae)
            { System.out.println("inside catch");}
//            finally {
//                System.out.println("finally");
//            }
            System.out.println(a);//CE"variable a might not have been initialized
        }
   /* void m1(){
        int a;
        try {
                a=10;
                System.out.println(a);
         //   System.out.println(a/0);
            }
            catch(ArithmeticException e){
                a=20;
                System.out.println(a);
            }
        System.out.println(a);
    }*/

}
