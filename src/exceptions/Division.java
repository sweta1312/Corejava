package exceptions;

public class Division {
    public static void main(String[] args) {
        int a = 40;
        int b = 0;
        int c =0;
        try {
            c = a / b;
        } catch (ArithmeticException e) {
            System.out.println("plz donot provide zero");
        }
        System.out.println(c);
    }
}
