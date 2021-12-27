package ExceptionHandling;

public class ArrayIndexOOBExample extends Throwable {
    public static void main(String[] args) {
        int arr[]={10,20,30};
       try {
           System.out.println("element of array are:");
           for (int i = 0; i <= arr.length; i++) {
               System.out.println(arr[i]); //ArrayIndexOut ofBound Exception
           }
       }
       catch (ArrayIndexOutOfBoundsException aioob){
           System.out.println("index beyond arry length");
       }
        System.out.println("After array output");
    }
    void method1(){
        System.out.println("method1");
    }
}
