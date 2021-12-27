package ExceptionHandling;

import java.util.Scanner;

public class FirstExample {
    public static void main(String[] args) {
        int a,b,c;
        try {
            System.out.println("Enter two integer");
            Scanner sc = new Scanner(System.in);
            a = sc.nextInt();
            b = sc.nextInt();
            c = a / b;
            System.out.println("Result " + c);//arthematic exception if a=10 and b=0/ InputMismatchException if a=10 and b=char
        }
        catch (ArithmeticException art){
            System.out.println("plz dont enter zero");
        }
        System.out.println("More code can go here");

    }


}
