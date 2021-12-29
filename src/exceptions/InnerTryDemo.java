package exceptions;
//case#1 Inner try catch is not matched but outer try catch is matched
/*public class InnerTryDemo {
    public static void main(String[] args) {
        try{
            int a=-5;
            System.out.println("a:" +a);
            try{
                int[] x=new int[a];
            }
            catch (NullPointerException npe){
                System.out.println("NPE is raised");
            }
        }
        catch (ArrayIndexOutOfBoundsException aiobe)
        { System.out.println("pass one int value");}
        catch (NumberFormatException nfe)
        {
            System.out.println("pass only int value");
        }
        catch (NegativeArraySizeException nase)
        {
            int[] x=new int[3];
            System.out.println("in outer try array :" +x.length);
        }
        System.out.println("After outer try/catch");
    }
}*/
/*o/pa:-5
        in outer try array
        After outer try/catch*/

//case#2 Inner catch and outer catch are not matched
/*public class InnerTryDemo {
    public static void main(String[] args) {
        try{
            int a=-5;
            System.out.println("a:" +a);
            try{
                int[] x=new int[a];
            }
            catch (NullPointerException npe){
                System.out.println("NPE is raised");
            }
        }
        catch (ArrayIndexOutOfBoundsException aiobe)
        { System.out.println("pass one int value");}
        catch (NumberFormatException nfe)
        {
            System.out.println("pass only int value");
        }

        System.out.println("After outer try/catch");
    }
}*/
/*
op:a:-5
        Exception in thread "main" java.lang.NegativeArraySizeException
        at exceptions.InnerTryDemo.main(InnerTryDemo.java:40)*/

//case#3