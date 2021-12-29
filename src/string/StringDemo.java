package string;

public class StringDemo {


    public static void main(String[] args) {
        //1.String()
     /*   String s1="abc";
        //StringBuffer s2="abc";
        // StringBuilder s3="abc";
        String s2=new String();
        String s4=new String("aab");
       System.out.println(s1);
        System.out.println(s2);*/

        //2.String(String value)
      /*  String s2="abc";
        String s3=new String(s2);
        String s4=new String("abc");
        String s5=s4;
        System.out.println(s2==s3);//false
        System.out.println(s2==s4);//false
        System.out.println(s5==s4);//true*/

        //3.String(StringBuffer sb)
      /*  String s1="abc";
        StringBuffer sb=new StringBuffer(s1);
        System.out.println(s1.equals(sb));//false*/

        //4.String(char[] ch)

     /*   char[] ch={'a','b','c','d','e'};
        String s1=new String(ch);
        System.out.println(s1);*/

        //5.String(chae[] ch, int offset,int count)
        char[] ch={'a','b','c','d','e','f'};
        String s1=new String(ch,2,4);
        System.out.println(s1);

        //7&8.String(byte[] b)
        byte[] b={97,98,99};
        String s2=new String(b,1,2);
       // String s3=new String(b,1,3);//StringIndexOutOfBoundsException
       // String s4=new String(null);//CE
        System.out.println(s2);
       // String s3="null";
        String s6=null;
        String s3=new String("null");
       String s4=new String(s3);//RE:NullPointerException
       // String s4=new String((String) null);//RE:NullPointerException
      // System.out.println("s3:"+s3);
        System.out.println("s4:"+s4);
    }
}
