package exceptions;

public class Example5 {
    public static void main(String[] args) {
        System.out.println(m1());
    }
        //case#1 no exception raised
    /*    m1();
    }
    static void m1(){
        try{
            System.out.println("in outer try");
            try {
                System.out.println("in inner try");
            }
            catch (NullPointerException npei)
            {
                System.out.println("inner catch");
            }
            finally {
                {
                    System.out.println("in inner finally");
                }
                System.out.println("after inner try/catch/finally");
            }
        }catch (NullPointerException npe)
        {
            System.out.println("in outer catch");
        }
        finally {
            System.out.println("in outer finally");
        }
        System.out.println("after outer try/catch/finally");*/

        //case#2 Return statement in finally block
     /*   m1();
    }
    static int m1(){
        try{
            System.out.println("in outer try");
            try {
                System.out.println("in inner try");
            }
            catch (NullPointerException npei)
            {
                System.out.println("inner catch");
            }
            finally {
                {
                    System.out.println("in inner finally");
                    return 10;
                }
                System.out.println("after inner try/catch/finally"); //unreacheable statement
            }
        }catch (NullPointerException npe)
        {
            System.out.println("in outer catch");
        }
        finally {
            System.out.println("in outer finally");
        }
        System.out.println("after outer try/catch/finally");
        return 10;*/

        //case#3 exception is raised in inner try, & either inner catch or outer catch is not matched
   /*     static void m1(){
            try{
                System.out.println("in outer try");
                try {
                    System.out.println("in inner try");
                    System.out.println(10/0);
                }
                catch (NullPointerException npei)
                {
                    System.out.println("inner catch");
                }
                finally {
                    {
                        System.out.println("in inner finally");

                    }
                    System.out.println("after inner try/catch/finally"); //unreacheable statement
                }
            }catch (NullPointerException npe)
            {
                System.out.println("in outer catch");
            }
            finally {
                System.out.println("in outer finally");
            }
            System.out.println("after outer try/catch/finally");
*/
        //case#4 exception is raised in inner try, & either inner catch or outer catch is not matched,and also return statement is placed inside inner finally
        static int m1(){
            try{
                System.out.println("in outer try");
                try {
                    System.out.println("in inner try");
                    System.out.println(10/0);
                }
                catch (NullPointerException npei)
                {
                    System.out.println("inner catch");
                }
                finally {
                    {
                        System.out.println("in inner finally");
                        return 20;
                    }
                    //System.out.println("after inner try/catch/finally"); //unreacheable statement
                }
            }catch (NullPointerException npe)
            {
                System.out.println("in outer catch");
            }
            finally {
                System.out.println("in outer finally");
              //  return 40;
            }
         System.out.println("after outer try/catch/finally");
            return 30;

        }
}
