package exceptions;

public class TestCasesForReturn {
    public static void main(String[] args) {
        TestCasesForReturn e=new TestCasesForReturn();
        System.out.println(e.m1());
    }
    int m1(){
        try {
            System.out.println("in try");
            return 10;

        }catch (ArithmeticException ae)
        {
            System.out.println("in catch");
           // return 20;
        }
        System.out.println("after try/catch");
     return 20 ;
    }
}
