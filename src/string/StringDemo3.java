package string;


public class StringDemo3 {
    public static void main(String[] args) {
        String s1="a";
        String s2="a";
        
        System.out.println(s1==s2);//true
        System.out.println(s1.equals(s2));//true
         String s3=new String("a");
        String s4=new String("a");
        System.out.println(s3==s4);//false
        System.out.println(s3.equals(s4));//true

        StringBuffer sb1=new StringBuffer("a");
        StringBuffer sb2=new StringBuffer("a");
        System.out.println(sb1.hashCode());
        System.out.println(sb2.hashCode());
        System.out.println(sb1==sb2);//false
        System.out.println(sb1.equals(sb2));//false

        //append()
        StringBuffer sb3=sb2.append("bc");
        System.out.println(sb3==sb2);//true

        //delete()
        StringBuffer sb4=new StringBuffer("Java Spring Mysql");
        System.out.println(sb4);

        System.out.println(sb4.delete(5,12));//Java Mysql
        System.out.println(sb4.deleteCharAt(5));//Java ysql

    }

}
