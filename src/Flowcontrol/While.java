package Flowcontrol;

public class While {
    public static void main(String[] args) {
      /*  while(true){
            System.out.println("hello");
            break;
        }*/
        int x=1;
        do{
            if(x%2==0){
                System.out.println(x);
            }
            x++;
        }
        while (x<=30);

    }
}
