package exceptions;

public class TryCatchFinallyCases {
    public static void main(String[] args) {
        //case#1 try/catch/finally without exception
       try {
            System.out.println("try block");

        }
        catch (ArithmeticException ae)
        {
            System.out.println("catch block");
        }
        /*finally {
            System.out.println("finaly block");
        }*/
        System.out.println("After try/catch/finally block");

        //case#2 try/catch/finally with exception and catch block is matched
    /*    try {
            System.out.println("try block");
            System.out.println(10/0);
        }
        catch (ArithmeticException ae)
        {
            System.out.println("catch block");
        }
        finally {
            System.out.println("finaly block");
        }
        System.out.println("After try/catch/finally block");*/

        //case#3 try/catch/finally with exception and catch block not matched
     /*   try {
            System.out.println("try block");
        }
        catch (NullPointerException npe)
        {
            System.out.println("catch block");
        }
        finally {
            System.out.println("finaly block");
        }
        System.out.println("After try/catch/finally block");*/

        //case#4 try/finally without exception
       /* try {
            System.out.println("try block");
        }
        finally {
            System.out.println("finaly block");
        }
        System.out.println("After try/catch/finally block");
*/

        //case#5 try/finally with exception
    /*    try {
            System.out.println("try block");
            System.out.println(10/0);
        }
        finally {
            System.out.println("finaly block");
        }
        System.out.println("After try/catch/finally block");*/

    }
}
