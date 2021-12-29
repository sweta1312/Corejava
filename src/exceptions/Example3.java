package exceptions;
//multiple inner try catch block
public class Example3 {
    public static void main(String[] args) {
        try{
            System.out.println("In outer try");
            try{
                System.out.println("In inner try");
                System.out.println(10/0);
            }
            catch (ArithmeticException e){
                System.out.println("in inner catch");
            }
            System.out.println("After inner try catch");
        }
        catch (ArithmeticException e){
            System.out.println("in outer catch");
        }
        System.out.println("After outer try/catch");
    }
}
