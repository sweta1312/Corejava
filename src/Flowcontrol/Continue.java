package Flowcontrol;

public class Continue {
    public static void main(String[] args) {
       /* for(int i=0;i<10;i++)
        {
            if(i%2==0){
                continue;
            }
            System.out.println(i);
        }*/
        int i=10;
        switch (i){
            case 9:
            {
                System.out.println("hello");
                break;
            }
            case 10:
            {
                System.out.println("xyz");
                break;
            }
            case 8:
            {
                System.out.println("abc");
            }

        }
    }
}
