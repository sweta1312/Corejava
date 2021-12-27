package ExceptionHandling;

public class MultiCatch {
    public static void main(String[] args) {
        try {
            String s = args[0];
            System.out.println("input is:" +s);
            int i=Integer.parseInt(s);
        }
        catch (ArrayIndexOutOfBoundsException obj)
        {
            System.out.println("Input is required");
        }
        catch (IllegalArgumentException igl)
        {
            System.out.println("Invalid ");
        }
       /* catch (NumberFormatException num)
        {
            System.out.println("Invalid input");
        }*/

        System.out.println("More code can go here");
    }
}
