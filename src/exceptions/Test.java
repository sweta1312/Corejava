package exceptions;

public class Test {
    public static void main(String[] args) {
        int res=Test.div();
        System.out.println("Result:"+res);
    }
    static int div(){
        int res=-1;
        try {
            int a = 20;
            int b = 10;
            int c=a/b;
            res=4;
            System.out.println();
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            res=5;
        }
        catch (NumberFormatException e)
        {
            res=6;
        }
        catch (ArithmeticException e)
        {
            res=7;
        }
        System.out.println("after try/catch");
        return res;
    }
}
